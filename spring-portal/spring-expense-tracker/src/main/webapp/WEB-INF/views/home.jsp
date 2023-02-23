<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
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
  	background-color: lavenderblush;
}
td{
text-align: center;
background-color: lightcyan;
}
th, td{
	padding: 10px;
}
</style>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<h1>Employee Portal</h1>
	<hr/>
	<h3>Search for an employee</h3>
	
	<form action="${contextRoot}/search" method="post">
	Enter ID: <input  name="id"/>
	or, Enter Name: <input name="name"/>
	<button type="submit">Search</button>
	</form>
	<br>
	<hr/>
	<div>
	<a href="${contextRoot}/employee">Add Employee</a>
	<br>
	<a href="${contextRoot}/exportUsers">Download CSV</a>
	</div>
	<br>
	<table>
	<tr>
	<th>Employee</th>
	<th>Contact</th>
	<th>Level and Post</th>
	<th>Action</th>
	<!-- <th>Last Name</th>
	<th>Gender</th>
	<th>Date Of Birth</th>
	<th>PAN Card Number</th>
	<th>Aadhaar Number</th>
	<th>Mobile Number</th>
	<th>Email ID</th>
	<th>Office Mail</th>
	<th>Permanent Address</th>
	<th>Present Address</th>
	<th>Blood Group</th>
	<th>Profile Picture</th>
	<th>Date of Joining</th>
	<th>Employee Level</th>
	<th>Post Name</th>
	<th>Basic Pay</th>
	<th>House Allowance</th>
	<th>Edit</th>
	<th>Delete</th>-->
	</tr>
	<c:forEach var="employee" items="${employees}">
		<tr>
			<td>${employee.firstName}&nbsp;${employee.lastName}<br/>#${employee.id}</td>
			
			<td>${employee.mobileNum}<br/>${employee.emailId}</td>
			
			<td>${employee.empLevel}/<br/>${employee.postName}</td>
			
			<td><a href="${contextRoot}/history/${employee.id}">Employments</a>/<a href="${contextRoot}/employee/${employee.id}">Edit</a>/<a href="${contextRoot}/${employee.id}">Delete</a></td>
			<!-- <td>${employee.id}</td>
			<td>${employee.firstName}</td>
			<td>${employee.lastName}</td>
			<td>${employee.gender}</td>
			<td>${employee.dob}</td>
			<td>${employee.panNum}</td>
			<td>${employee.aadhaarNum}</td>
			<td>${employee.mobileNum}</td>
			<td>${employee.emailId}</td>
			<td>${employee.officeMail}</td>
			<td>${employee.permanentAddress}</td>
			<td>${employee.presentAddress}</td>
			<td>${employee.bloodGroup}</td>
			<td>${employee.profilePict}</td>
			<td>${employee.doj}</td>
			<td>${employee.empLevel}</td>
			<td>${employee.postName}</td>
			<td>${employee.basicPay}</td>
			<td>${employee.houseAllowance}</td>
			<td><a href="${contextRoot}/employee/${employee.id}">Edit</a></td>
			<td><a href="${contextRoot}/${employee.id}">Delete</a></td>-->
		</tr>
	</c:forEach>
	</table>
	
</body>
</html>