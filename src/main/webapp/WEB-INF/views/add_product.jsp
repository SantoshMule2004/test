<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="base.jsp"%>
</head>
<body>
<%@include file="navbar.jsp" %>
	<div class="container mt-5 w-25">
		<h1 class="text-center mb-5">Add product form</h1>
		<div class="card">
			<div class="card-body">
				<form action="add-product" method="post">
					<div class="form-group">
						<label class="form-label">Product name: </label>
						<input type="text" name="name" class="form-control">
					</div>
					
					<div class="form-group">
						<label class="form-label">Description: </label>
						<textarea rows="" cols="" name="description" class="form-control"></textarea>
					</div>
					
					<div class="form-group">
						<label class="form-label">Price: </label>
						<input type="text" name="price" class="form-control">
					</div>
					
					<div class="container text-center mt-5">
						<a href="${pageContext.request.contextPath }/mobiles" class="btn btn-secondary">back</a>
						<button class="btn btn-primary">Add product</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>