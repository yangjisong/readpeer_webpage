package com.sesame.readpeer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.sesame.readpeer.model.Person;

@Controller
public class HomeController {
	
	//@RequestMapping("/")
	@RequestMapping(value = {"/"})
	public String homePage(Model m) {
	    return "index";
	}
	
	//@RequestMapping(value = {"/{url}"})
	@RequestMapping("/**")
	public String loadHomePage(Model m,HttpServletRequest request) { //,@PathVariable String url
		System.out.println("url:"+request.getRequestURI()+"?"+request.getQueryString());
		String url =request.getRequestURI()+ (request.getQueryString()==null?"":"?"+request.getQueryString());
		if(url!= null && url.startsWith("/")){
			url = url.substring(1);
		}
		
		System.out.println("url:"+url);
		String errorMsg = "Sorry,this URL hasn't any content";
		
		if(url == null){
			errorMsg ="Sorry,this URL is null";
		}else{			
			if(!(url.startsWith("http://") || url.startsWith("https://"))){
				errorMsg ="Sorry,this URL is not a legal URL";
			}
		}
		
        RestTemplate template = new RestTemplate();
        String pageBody = "";
		String response = template.getForObject(url, String.class);
		if(response != null){
			int fromIndex =  response.toLowerCase().indexOf("<head")+5;
			int index =  response.toLowerCase().indexOf('<', fromIndex);
			pageBody = response.substring(index);
		}else{
			pageBody = "</head><body>"+errorMsg+"</body></html>";
		}
		System.out.println(pageBody);
	    m.addAttribute("pageBody", pageBody);
	    return "page";
	}
}
