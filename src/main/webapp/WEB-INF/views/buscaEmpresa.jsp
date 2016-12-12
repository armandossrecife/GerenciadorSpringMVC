<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Lista de Empresas</title>
</head>
<body>
<h1>
	Lista de Empresas Cadastradas
</h1>

<h3>Empresas</h3>
    <c:forEach items="${empresas}" var="empresa">
      <c:out value="${empresa.nome}"/> <br>
    </c:forEach>
   <br>
	<a href="home">Home</a>
</body>
</html>