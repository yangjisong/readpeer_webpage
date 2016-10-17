<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE HTML>
<html>
<head>
  <meta charset="utf-8">
  <title>Readpeer</title>
  <style>
    /* @import url("//d2v52k3cl9vedd.cloudfront.net/basscss/4.1.7/basscss.min.css"); */
    body { margin-top: 5%; font-family: "myriad-pro", sans-serif; }
    h1 { color: #939393; }
	.field-light {
		width: 33.3333%;
		box-sizing: border-box;
	    height: 2.25em;
	    padding: 0.25em 1rem;
	    background-color: hsl(0, 0%, 100%);
	    border-color: hsl(0, 0%, 80%);
	    border-radius: 3px;
	    border-style: solid;
	    border-width: 1px;
	    transition: box-shadow 0.2s ease 0s;
	    font-family: inherit;
	    font-size: 100%;
	    margin-bottom: 0.5rem;
	    margin-top: 0;
	}
	.button-blue {
	    background-color: hsl(208, 100%, 44%);
	    border-radius: 3px;
	    color: hsl(0, 0%, 100%);
	    transition-duration: 0.1s;
	    transition-property: box-shadow, background-color;
	    transition-timing-function: ease-out;
	}
	.button, button {
	    border: 1px solid hsla(0, 0%, 0%, 0);
	    box-sizing: border-box;
	    cursor: pointer;
	    display: inline-block;
	    font-weight: 700;
	    height: auto;
	    line-height: 1.125;
	    margin: 0;
	    padding: 0.5em 1rem;
	    text-decoration: none;
	}
  </style>
</head>
<body>
  <center>
  <!-- <img width="142" height="142" src="https://hypothes.is/assets/images/logo.png" /> -->
  <form class="h3" onsubmit="url = document.getElementById('search').value; if (url != '') { document.location.href = '/' + url; } return false;">
    <input id="search" class="block sm-col-4 field-light" name="search" type="text" maxsize="30" placeholder="Paste a link to create or view annotations"/>
    <button type="submit" class="button-blue">Go!</button>
  </form>
  </center>
</body>
</html>