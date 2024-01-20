<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave History</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
    <%@include file="displayLeave.css" %>
</style>
<style>
.butt {
  background-color: #04AA6D; /* Green */
  border: none;
  color: #5BB9B8;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}
.button3 {
  background-color: #5BB9B8;; 
  color: black; 
  border: 2px solid #f44336;
}

.button3:hover {
  background-color: #f44336;
  color: white;
}
</style>
</head>
<body>
<div class="eula" style="padding-right: 20px"><h1>Employee Leave Management</h1></div>
<main>
  <table>
    <thead>
      <tr>
        <th>Leave ID</th>
        <th>Leave Applied On</th>
        <th>Start On</th>
        <th>End On</th>
        <th>Leave Type</th>
        <th>Leave Reason</th>
        
      </tr>
    </thead>
    <tbody>
      
      <c:forEach var="l" items="${llist}">
      	<tr>
      	<td data-title='Provider Name'>${l.leaveid}</td>
		<td data-title='Provider Name'>${l.leaveApplied}</td>
		<td data-title='Provider Name'>${l.start}</td>
		<td data-title='Provider Name'>${l.end}</td>
		<td data-title='Provider Name'>${l.leaveType}</td>
		<td data-title='Provider Name'>${l.leaveReason}</td>
		<td class='select'>
		</td>
		</tr>
	  </c:forEach>
      
    </tbody>
  </table>
   <label for="Home"><a href="Home">Home Page</a> &nbsp; &nbsp; <a href="applyleave">Apply Leave</a></label> <hr>
  
  
</main>
<br>
</body>
</html>