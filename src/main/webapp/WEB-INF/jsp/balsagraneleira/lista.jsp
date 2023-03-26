<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Lista - Balsas Graneleira</title>
</head>
<body>


	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<form action="/balsagraneleira" method="get">
			<h3>Lista - Balsas Graneleiras</h3>

			<c:if test="${not empty mensagem}">
				<div class="alert alert-success">
					<strong>Atenção!</strong> ${mensagem}
				</div>
			</c:if>

		</form>

		<c:if test="${empty balsaGraneleira}">
			<h4>Não existem balsas graneleiras cadastradas!</h4>
		</c:if>

		<c:if test="${not empty balsaGraneleira}">
			<h4>Quantidade de balsas graneleiras cadastradas:
				${balsaGraneleira.size()}</h4>


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
						<th>Capacidade</th>
						<th>Modelo</th>
						<th>Serviço de Limpeza</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="bg" items="${balsaGraneleira}">
						<tr>
							<td>${bg.id}</td>
							<td>${bg.frota}</td>
							<td>${bg.nome}</td>
							<td>${bg.valor}</td>
							<td>${bg.comprimento}</td>
							<td>${bg.largura}</td>
							<td>${bg.altura}</td>
							<td>${bg.capacidade}</td>
							<td>${bg.modelo}</td>
							<td>${bg.limpeza}</td>
							<td><a href="/balsagraneleira/${bg.id}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<form action="/balsagraneleira" method="get">
			<button type="submit">Novo Cadastro</button>
		</form>

	</div>

</body>
</html>