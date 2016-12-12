<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Bem Vindo ao CRUD Simples de Controle de Empresa
</h1>

<P>  Hora do servidor ${serverTime}. </P>
<p> Usuario: ${emailUsuario} </p>
<br>
<a href="empresa">Tela Insere Empresa</a>
<a href="buscaEmpresa">Tela Busca Empresa</a>
<a href="deslogado">Logout</a>

</body>
</html>
