<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Lista - Embarcacoes</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<form action="/empurrador" method="get">
			<h3>Lista - Embarcacoes</h3>

			<c:if test="${not empty mensagem}">
				<div class="alert alert-success">
					<strong>Atenção!</strong> ${mensagem}
				</div>
			</c:if>

		</form>

		<c:if test="${empty embarcacoes}">
			<h4>Não existem embarcacoes cadastradas!</h4>
		</c:if>

		<c:if test="${not empty embarcacoes}">
			<h4>Quantidade de embarcacoes cadastradas: ${embarcacoes.size()}</h4>


			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Frota</th>
						<th>Nome</th>
						<th>Valor</th>
						<th>Comprimento(m)</th>
						<th>Largura(m)</th>
						<th>Altura(m)</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="eb" items="${embarcacoes}">
						<tr>
							<td>${eb.id}</td>
							<td>${eb.frota}</td>
							<td>${eb.nome}</td>
							<td>${eb.valor}</td>
							<td>${eb.comprimento}</td>
							<td>${eb.largura}</td>
							<td>${eb.altura}</td>
							<td><a href="/embarcacoes/${eb.id}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

	</div>

</body>
</html>