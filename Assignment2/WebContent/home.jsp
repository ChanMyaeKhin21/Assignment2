<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>
		<script src="connect.js" type="text/javascript"></script>	
<head>
<body>
<h1>Hello Welcome to my page</h1>
<form name="userInput" id="myForm">
		<table>
			<tr>
			<td style="width: 179px; ">From:</td>
				<td style="width: 233px; ">
					Binary:<input type="text" name="Binary">			
  				</td>

			</tr>
			<tr>
					<td>To</td>
				
				
					<td>
						<input id = "Submit" type = "submit" value ="Submit"/>
  					</td>
					
			<tr>
				<td>The Decimal is </td>  
				<td><div id ="response" style="width: 228px; "> </div></td>
			</tr>
			<tr>
			<td> The Octal is</td>
			<td><div id ="response2">  </div> </td>
			</tr>
		</table>
	</form>
</body>
</html>