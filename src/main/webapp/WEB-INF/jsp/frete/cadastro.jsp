<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Cadastro - Frete</title>
</head>
<body>
	<c:set var="btn" value="" />

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<form action="/frete/incluirf" method="post">

			<h3>Cadastro de Fretes</h3>

			<div class="form-group">
				<label>Descrição:</label> <input type="text" name="descricao"
					value="Descricao do primeiro frete" class="form-control">
			</div>

			<div class="form-group">
				<c:if test="${not empty cliente}">
					<label>Cliente:</label>
					<select name="cliente" class="form-control">
						<c:forEach var="c" items="${cliente}">
							<option value="${c.id}">${c.nome}</option>
						</c:forEach>
					</select>
				</c:if>
				<c:if test="${empty cliente}">
					<c:set var="btn" value="disabled" />
					<label>Não existem clientes cadastrados!</label>
				</c:if>
			</div>

			<div class="form-group">
				<c:if test="${not empty embarcacoes}">
					<label>Embarcações:</label>
					<c:forEach var="e" items="${embarcacoes}">
						<div class="form-check">
							<label class="form-check-label"> <input type="checkbox"
								name="embarcacoes" value="${e.id}" class="form-check-input">
								${e.nome}
							</label>
						</div>
					</c:forEach>
				</c:if>

				<c:if test="${empty embarcacoes}">
					<c:set var="btn" value="disabled" />
					<label>Não existem embarcações cadastradas!</label>
				</c:if>
			</div>

			<button ${btn} type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>