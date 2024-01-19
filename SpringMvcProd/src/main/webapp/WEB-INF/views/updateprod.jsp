<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
<style type="text/css">
    <%@include file="addprod.css" %>
</style>
</head>
<body>
	<div class="add-product">
        <h2>Add a Product</h2>
        <form action="/SpringMvcProd/update" method="post">
        
        	<label for="cid">Product ID:</label>
            <input type="number" id="pid" name="pid" value="${p.pid}" readonly="readonly">
            
            <label for="title">Product Name:</label>
            <input type="text" id="pname" name="pname" value="${p.name}" required>
            
            
            <label for="price">Product Price:</label>
            <input type="number" id="price" name="price" value="${p.price}"  required>
            
            <label for="title">Product Image URL:</label>
            <input type="url" id="image" name="image" value="${p.image}" required>
            
            <button type="submit" id="btn" name="btn">Update Product</button>
        </form>
    </div>
</body>
</html>