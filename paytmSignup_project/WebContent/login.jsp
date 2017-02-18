<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>paytm login</title>
</head>
<body>
	<form method="post" action="login.do">
		<center>
			<table border="0" width="30%" cellpadding="0 ">
				<thead>
					<tr>
						<th colspan="2">Login Here</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>User Name</td>
						<td><input type="text" name="email" value="" /></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password" value="" /></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="Login" /> <input type="reset" value="Reset" /></td>
					</tr>
					<tr>
						<td>Yet Not Registered!! <a href="signup.jsp">Register
								Here</a></td>
						<td style="float: right;"><a href="forgot.jsp">Need Help?
								!!</a></td>
					</tr>
			</table>
		</center>
	</form>
</body>
</html>