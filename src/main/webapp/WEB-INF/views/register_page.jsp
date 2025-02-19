<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="base.jsp" %>
</head>
<body>
	<div class="container mt-5 w-50">
		<div class="card">
		<h1 class="text-center m-5">Register form</h1>
			<div class="card-body">
				<form action="handle-user" method="post">
					<div class="form-group">
					<label class="form-label">Username: </label>
						<input type="text" name="username" class="form-control">
					</div>
					
					<div class="form-group">
					<label class="form-label">Email-id: </label>
						<input type="email" name="email" class="form-control">
					</div>
					
					<div class="form-group">
					<label class="form-label">Password: </label>
						<input type="password" name="pass" class="form-control">
					</div>
					
					<div class="form-group">
					<label class="form-label">Confirm password: </label>
						<input type="password" name="cpass" class="form-control">
					</div>
					
					<div class="container">
						<button class="btn btn-success mt-3">Register</button>
						Already have an account! <a href="${pageContext.request.contextPath }/login-page">login</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>