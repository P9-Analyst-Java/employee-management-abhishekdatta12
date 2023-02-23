<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
	font-family: garamond;
	font-size: 16px;
	text-align: center;
	background-color: lavender;
}
div{
	margin-left: auto;
  	margin-right: auto;
  	width: 200px;
  	align-items: center;
  	font-size: 20px;
	
}
table, th, td{
	text-align: center;
	border: 3px solid indigo;
	border-collapse: collapse;
	padding: 3px;
	margin: 3px;
}
table{
	margin-left: auto;
  	margin-right: auto;
}
td{
text-align: center;
background-color: lightcyan;
}
th, td{
	padding: 10px;
}
.error{
color:red
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Employee Details</h1>
	
	<form:form action="${contextRoot}/employee" method="post" modelAttribute="employee">
	<table>
		<!--<form:hidden path="id"/>-->
		<tr><td>First Name</td><td><form:input path="firstName" placeholder="Enter First Name"/></td></tr>
		<tr><td>Last Name</td><td><form:input path="lastName" placeholder="Enter Last Name"/>
		<tr><td>Gender</td><td><form:input path="gender" placeholder="Enter Gender"/>
		<tr><td>Date Of Birth</td><td><form:input path="dob" placeholder="Enter Date Of Birth"/>
		<tr><td>PAN Card Number</td><td><form:input path="panNum" placeholder="Enter PAN Card Number"/>
		<tr><td>Aadhaar Number</td><td><form:input path="aadhaarNum" placeholder="Enter Aadhaar Number"/>
		<tr><td>Mobile Number</td><td><form:input path="mobileNum" placeholder="Enter Mobile Number"/><form:errors path="mobileNum" cssClass="error"/>
		<tr><td>Email ID</td><td><form:input path="emailId" placeholder="Enter Email ID"/>
		<tr><td>Office Mail ID</td><td><form:input path="officeMail" placeholder="Enter Office Mail ID"/>
		<tr><td>Permanent Address</td><td><form:input path="permanentAddress" placeholder="Enter Permanent Address"/>
		<tr><td>Present Address</td><td><form:input path="presentAddress" placeholder="Enter Present Address"/>
		<tr><td>Blood Group</td><td><form:input path="bloodGroup" placeholder="Enter Blood Group"/>
		<tr><td>Profile Picture</td><td><form:input path="profilePict" placeholder="Enter Profile Picture"/>
		<tr><td>Date of Joining</td><td><form:input path="doj" placeholder="Enter DOJ"/>
		<tr><td>Employee Level</td><td><form:input path="empLevel" placeholder="Enter Employee Level"/>
		<tr><td>Post Name</td><td><form:input path="postName" placeholder="Enter Post Name"/>
		<tr><td>Basic Pay</td><td><form:input path="basicPay" placeholder="Enter Basic Pay"/>
		<tr><td>House Allowance</td><td><form:input path="houseAllowance" placeholder="Enter House Allowance"/>
		</table>
		
		<input type="submit" value = "submit">
	</form:form>
</body>
</html>