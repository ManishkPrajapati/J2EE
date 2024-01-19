<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css'><link rel="stylesheet" href="./style.css">
<style type="text/css"><%@include file="displayproducts.css" %></style>
</head>
<body>
<h2><a href="addprod" type="button" class="btn btn-outline-primary" style="font-size: 25px; ">Add New Product</a></h2>
	<section class="section-products">
		<div class="container">
				<div class="row justify-content-center text-center">
				
						<div class="col-md-8 col-lg-6">
								<div class="header">
										<h3>Featured Product</h3>
										<h2>Popular Products</h2>
										
								</div>
						</div>
				</div>
				<div class="row">
						<!-- Single Product -->
						<c:forEach var="p" items="${plist}">
						<div class="col-md-6 col-lg-4 col-xl-3">
								<div id="product-1" class="single-product">
										<div class="part-1">
										<img class="image" src="${p.image}" width="300" height="300"/>
												<ul>	
														<li>${p.pid}</li>
														<li><a href="#"><i class="fas fa-edit"></i></a></li>
														<li><a href="#"><i class="fas fa-trash"></i></a></li>
												</ul>
										</div>
										<div class="part-2">
												<h3 class="product-title">${p.name}</h3>
												<h4 class="product-old-price">${p.price + 121}</h4>
												<h4 class="product-price">${p.price}</h4>
										</div>
								</div>
						</div>
						</c:forEach>
						
				</div>
		</div>
</section>
</body>
</html>