<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>paytm signup page</title>
</head>
<body bgcolor="cyan">
<center>
<form action="signup.do" method="post">
<pre>
<h2>Sign up here</h2>
FirstName: <input type="text" name="fname"></br>
LastName:  <input type="text" name="lname"></br>
Gender:    <input type="text" name="gender"></br>
Age: 	   <input type="text" name="age"></br>
Email:     <input type="text" name="email"></br>
Password:  <input type="password" name="password"></br>
Mobile:    <input type="text" name="mobile"></br>

<font color="blue"><input type="submit" value ="Signup" /></font>
<h5> Already registred </h5><a href="login.jsp">Go to login page</a>
</pre>
</form>
</center>
</body>
</html>