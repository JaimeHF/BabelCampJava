<%--
  Created by IntelliJ IDEA.
  User: jaime.hidalgo
  Date: 26/10/2021
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista Juegos</title>
</head>
<body>
    <h1>Lista Juegos</h1>
    <h2>${lista}</h2>
    <form action="juegoDetalle"  method="post">
		 <input type="text" name="id" placeholder="id">
        <input type="submit" value="Entrar">
        </form>
</body>
</html>
