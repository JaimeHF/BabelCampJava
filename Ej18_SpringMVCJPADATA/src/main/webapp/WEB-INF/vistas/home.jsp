<%--
  Created by IntelliJ IDEA.
  User: jaime.hidalgo
  Date: 28/10/2021
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Iniciar sesion</h1>


<form action="mvc/login"  method="post">
    		<input class="input" placeholder="Username" name="username">
	        <input type="password" class="input" placeholder="Password" name="password">
	        <button type="submit" class="login">Entrar</button>
    
</form>
</body>
</html>