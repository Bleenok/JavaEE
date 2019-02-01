<%@ page import="java.util.List" %><%--
<%--
  Created by IntelliJ IDEA.
  User: Vlad Prokopenko
  Date: 01.02.2019
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Random numbers</title>
</head>
<body>
<h1>
    <%
        List numbers = (List) request.getAttribute("numbs");
        for(int i = 0;i<numbers.size();i++){
            out.print(i+": "+numbers.get(i)+"<br>");
        }
    %>
</h1>
<button onclick="location.href = 'loggedin.jsp';" id="myButton" class="float-left submit-button" >Home</button>
</body>
</html>
