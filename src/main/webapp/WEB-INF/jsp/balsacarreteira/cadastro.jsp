<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Balsa Carreteira</title>
</head>
<body>
	
		<div class="container">
		
		<form action="/balsacarreteira/incluir" method="post">
			
		<h3>Cadastro Balsa Carreteira</h3>
		
		<div class="form-group">
		<label>Nome da Embarcação:</label>
		<input type="text" name="nomedaembarcacao" value="Yamato01" class="form-control">
		</div>

		<button type="submit">Cadastrar</button>
		
		</form>
	</div>

</body>
</html>