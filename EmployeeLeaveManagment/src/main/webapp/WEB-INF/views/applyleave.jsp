<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <link rel="stylesheet" href="addprod.css" -->
<style type="text/css">
    <%@include file="applyleave.css" %>
</style>
    
    <title>Document</title>
</head>
<body>
    <div class="add-product">
        <h2>Add Leave</h2>
        <form action="applyleave" method="post">
            <label for="title">Empno:</label>
            <input type="text" id="title" name="title" required>
            
            
            <label for="price">Start:</label>
            <input type="date" id="start" name="start" required>
            
            <label for="price">End:</label>
            <input type="date" id="end" name="end" required>
            
            <label for="leaveType">Leave Type:</label>
            <select id="leaveType" name="leaveType" required>
			  <option value="Earned Leave">Earned Leave</option>
			  <option value="Loss Of Pay">Loss Of Pay</option>
			</select>
			
            <label for="LeaveReason">Leave Reason:</label>
			 <select id="LeaveReason" name="LeaveReason" required>
			  <option value="Personal">Personal</option>
			  <option value="Sick">Sick</option>
			  <option value="Ritual">Ritual</option>
			  <option value="Out of Station">Out of Station</option>
			</select>
            
            <button type="submit" id="btn" name="btn">Add Leave</button>
        </form>
    </div>
</body>
</html>