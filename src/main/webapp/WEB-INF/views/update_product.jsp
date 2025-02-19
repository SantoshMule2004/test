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
		<h1 class="text-center mb-5">Change product details</h1>
		<div class="card">
			<div class="card-body">
				<form action="add-product" method="post">
					<div class="form-group">
						<label class="form-label">Product id: </label> <input
							type="text" name="id" value="${product.id }"
							class="form-control">
					</div>

					<div class="form-group">
						<label class="form-label">Product name: </label> <input
							type="text" name="name" value="${product.name }"
							class="form-control">
					</div>

					<div class="form-group">
						<label class="form-label">Description: </label>
						<textarea rows="" cols="" name="description" class="form-control">${product.description }</textarea>
					</div>

					<div class="form-group">
						<label class="form-label">Price: </label> <input type="text"
							name="price" value="${product.price }" class="form-control">
					</div>

					<div class="container text-center mt-5">
						<a href="${pageContext.request.contextPath }/mobiles"
							class="btn btn-secondary">back</a>
						<button class="btn btn-primary">Update</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>