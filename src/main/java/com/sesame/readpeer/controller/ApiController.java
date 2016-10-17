package com.sesame.readpeer.controller;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sesame.readpeer.model.Person;
import com.sesame.readpeer.service.PersonService;

@RestController
@RequestMapping("api")
public class ApiController {
//	@Autowired 
//    private PersonService personService;
//     
//    @RequestMapping("person/random")
//    public Person randomPerson() {
//        return personService.getRandom();
//    }
// 
//    @RequestMapping("person/{id}")
//    public Person getById(@PathVariable Long id) {
//        return personService.getById(id);
//    }
//     
//    // same as above method, just showing different URL mapping
//    @RequestMapping(value="person", params="id")
//    public Person getByIdFromParam(@RequestParam Long id) {
//        return personService.getById(id);
//    }
//     
//    // handles person form submit
//    @RequestMapping(value="person", method=RequestMethod.POST)
//    public String savePerson(Person person) {
//        personService.save(person);
//        return "Saved person: " + person.toString();
//    }
//    
//    @RequestMapping("/callback")  
//    public Callable<Person> api() {  
//      System.out.println("=====hello");  
//      return new Callable<Person>() {  
//          @Override  
//          public Person call() throws Exception {  
//              Thread.sleep(10L * 1000); //暂停两秒  
//              Person user = new Person();  
//              user.setAge(18);  
//              user.setName("haha"); 
//              System.out.println(user.toString());
//              return user;  
//          }  
//      };  
//  }  
}
