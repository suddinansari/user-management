<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success Form</title>
</head>
<body>
	<font color="green"><h2>Welcome</h2></font>
	<font color="green"><h3>Congratulation You have
			successfully logged in.</h3></font>
	<h3>${msg}</h3>
	<input id="search" type="text" name="search" placeholder="Search..">
	<button onclick="searching('search')">Search</button>
	<script type="text/javascript">
     function searching(id){
	  name=document.getElementById(id).value
	  var request = new XMLHttpRequest()
	request.open('GET', 'http://localhost:8080/employees?name='+name, true)
	request.onload = function() {
	  // Begin accessing JSON data here
	  var data = JSON.parse(this.response)
	  if (request.status >= 200 && request.status < 400) {
	    data.forEach(movie => {
	    	document.getElementById("movie[0]").innerHTML = obj.name + ", " + obj.age 
	      
	    })
	  } else {
	    console.log('error')
	  }
	}

	request.send();
	}
	</script>
</body>
</html>