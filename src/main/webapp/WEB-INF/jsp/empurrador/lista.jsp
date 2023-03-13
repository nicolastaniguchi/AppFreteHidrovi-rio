<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Lista - Empurrador</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<form action="/empurrador" method="get">
			<h3>Lista - Empurradores</h3>

			<c:if test="${not empty mensagem}">
				<div class="alert alert-success">
					<strong>Atenção!</strong> ${mensagem}
				</div>
			</c:if>

		</form>

		<c:if test="${empty empurrador}">
			<h4>Não existem empurradores cadastrados!</h4>
		</c:if>

		<c:if test="${not empty empurrador}">
			<h4>Quantidade de empurradores cadastrados: ${empurrador.size()}</h4>


			<table class="table table-striped">
				<thead>
					<tr>
						<th>Frota</th>
						<th>Nome</th>
						<th>Valor</th>
						<th>Comprimento(m)</th>
						<th>Largura(m)</th>
						<th>Altura(m)</th>
						<th>Motor</th>
						<th>Tripulação</th>
						<th>Rancho</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" items="${empurrador}">
						<tr>
							<td>${e.frota}</td>
							<td>${e.nome}</td>
							<td>${e.valor}</td>
							<td>${e.comprimento}</td>
							<td>${e.largura}</td>
							<td>${e.altura}</td>
							<td>${e.motor}</td>
							<td>${e.tripulacao}</td>
							<td>${e.rancho}</td>
							<td><a href="/empurrador/${e.frota}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<form action="/empurrador" method="get">
			<button type="submit">Novo Cadastro</button>
		</form>

	</div>

</body>
</html>