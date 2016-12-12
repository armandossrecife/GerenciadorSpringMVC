<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Tela Inserir Empresa</title>
</head>
<body>
<h1>
	Insere Empresa
</h1>
    
<!--http://www.tutorialspoint.com/jsp/jsp_form_processing.htm -->
<form action="novaEmpresa" method="POST">
Nome: <input type="text" name="nome">
<input type="submit" value="Submit" />
<br>
<a href="home">Home</a>

</form>
</body>
</html>