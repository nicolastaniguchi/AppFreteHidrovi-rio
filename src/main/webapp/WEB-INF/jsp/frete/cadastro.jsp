
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<title>Cadastro Frete</title>
</head>
<body>
	<div class="container">
		<form action="/frete/incluir" method="post">
		<h3>Cadastro Frete</h3>
		
		<div class="form-group">
		<label>Nome da Embarcação:</label>
		<input type="text" name="nomedaembarcacao" value="Yamato01" class="form-control">
		</div>

		<button type="submit">Cadastrar</button>
		
		</form>
	</div>
	

</body>
</html>