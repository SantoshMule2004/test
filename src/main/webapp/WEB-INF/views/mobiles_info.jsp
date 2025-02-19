<html>
<head>
<%@ include file="base.jsp"%>
</head>
<body class="bg-light">
<%@include file="navbar.jsp" %>

	<div class="container mt-5 w-50">
		<h1 class="text-center mb-5">PVS Mobiles</h1>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Product name</th>
					<th scope="col">Description</th>
					<th scope="col">Price</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products }" var="p">
					<tr>
						<td>P${p.id }</td>
						<td>${p.name }</td>
						<td>${p.description }</td>
						<td>${p.price }</td>
						<td><a href="delete/${p.id}" class="m-2"><i
								class="fa-solid fa-trash text-danger"></i></a> <a
							href="update/${p.id}" class="m-2"><i
								class="fa-solid fa-pen-to-square text-primary"></i></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="container text-center">
			<a class="btn btn-primary"
				href="${pageContext.request.contextPath }/addproduct">Add
				product</a>
		</div>
	</div>
</body>
</html>
