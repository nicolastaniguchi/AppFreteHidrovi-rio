<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Lista - Balsas Carreteiras</title>
</head>
<body>


	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<form action="/balsacarreteira" method="get">
			<h3>Lista - Balsas Carreteiras</h3>

			<c:if test="${not empty mensagem}">
				<div class="alert alert-success">
					<strong>Atenção!</strong> ${mensagem}
				</div>
			</c:if>

		</form>

		<c:if test="${empty balsaCarreteira}">
			<h4>Não existem balsas carreteiras cadastradas!</h4>
		</c:if>

		<c:if test="${not empty balsaCarreteira}">
			<h4>Quantidade de balsas carreteiras cadastradas:
				${balsaCarreteira.size()}</h4>


			<table class="table table-striped">
				<thead>
					<tr>
						<th>Frota</th>
						<th>Nome</th>
						<th>Valor</th>
						<th>Comprimento(m)</th>
						<th>Largura(m)</th>
						<th>Altura(m)</th>
						<th>Limite Máximo de Frotas</th>
						<th>Serviço de Segurança</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="bc" items="${balsaCarreteira}">
						<tr>
							<td>${bc.frota}</td>
							<td>${bc.nome}</td>
							<td>${bc.valor}</td>
							<td>${bc.comprimento}</td>
							<td>${bc.largura}</td>
							<td>${bc.altura}</td>
							<td>${bc.qtdeFrotas}</td>
							<td>${bc.segurancas}</td>
							<td><a href="/balsacarreteira/${bc.frota}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<form action="/balsacarreteira" method="get">
			<button type="submit">Novo Cadastro</button>
		</form>

	</div>

</body>
</html>