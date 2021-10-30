<%--
  Created by IntelliJ IDEA.
  User: jaime.hidalgo
  Date: 26/10/2021
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${j.nombre}</title>
</head>
<body>
    <h2>ID: ${j.id}</h2>
    <h2>Nombre Juego: ${j.nombre}</h2>
    <h2>Compañia: ${j.compa}</h2>
    <h2>Nota Media:${j.notaMedia}</h2>
    <h2><a href="${j.enlace}">${j.nombre}</a></h2>
</body>
</html>
