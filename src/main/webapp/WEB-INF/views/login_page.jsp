<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="base.jsp" %>
</head>
<body>
	<div class="container mt-5 w-25">
		<div class="card">
		<h1 class="text-center m-5">Login</h1>
			<div class="card-body">
				<form action="login-handle" method="post">
					<div class="form-group">
					<label class="form-label">User Id: </label>
						<input type="text" name="id" class="form-control">
					</div>
										
					<div class="form-group">
					<label class="form-label">Password: </label>
						<input type="password" name="pass" class="form-control">
					</div>
					
					<div class="container text-center">
						<button class="btn btn-success mt-3">Login</button>
					</div>
					
					<div class="container text-center">
						Don't have an account! <a href="${pageContext.request.contextPath }/register-page">register</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>