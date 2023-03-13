<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Lista de Clientes</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<form action="/cliente" method="get">
			<h3>Lista - Clientes</h3>

			<c:if test="${not empty mensagem}">
				<div class="alert alert-success">
					<strong>Atenção!</strong> ${mensagem}
				</div>
			</c:if>

		</form>

		<c:if test="${empty cliente}">
			<h4>Não existe nenhum cliente cadastrado!</h4>
		</c:if>

		<c:if test="${not empty cliente}">
			<h4>Quantidade de clientes cadastrados: ${cliente.size()}</h4>


			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>CPF</th>
						<th>Email</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="c" items="${cliente}">
						<tr>
							<td>${c.id}</td>
							<td>${c.nome}</td>
							<td>${c.cpf}</td>
							<td>${c.email}</td>
							<td><a href="/cliente/${c.id}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<form action="/cliente" method="get">
			<button type="submit">Novo Cadastro</button>
		</form>

	</div>

</body>
</html>