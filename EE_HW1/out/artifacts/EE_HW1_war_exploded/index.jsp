<%--
  Created by IntelliJ IDEA.
  User: Vlad Prokopenko
  Date: 23.01.2019
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login form</title>
  </head>
  <body>
  <form  style="text-align: center" action="loginServlet" method="post">
    Name:<input type="text" name="username"/><br/><br/>
    Password:<input type="password" name="userpass"/><br/><br/>
    <input type="submit" value="login"/>
  </form>
  </body>
</html>
