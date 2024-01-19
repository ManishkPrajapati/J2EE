<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="add-product">
        <h2>Add a Product</h2>
        <form action="insertprod" method="post">
        
        	<label for="cid">Product ID:</label>
            <input type="number" id="pid" name="pid" required>
            
            <label for="title">Product Name:</label>
            <input type="text" id="pname" name="pname" required>
            
            
            <label for="price">Product Price:</label>
            <input type="number" id="price" name="price"  required>
            
            <label for="title">Product Image URL:</label>
            <input type="url" id="image" name="image" required>
            
            <button type="submit" id="btn" name="btn">Add Product</button>
        </form>
    </div>
</body>
</html>