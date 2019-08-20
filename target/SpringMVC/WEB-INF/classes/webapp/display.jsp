<%--
  Created by IntelliJ IDEA.
  User: nshi0719
  Date: 8/20/2019
  Time: 5:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>I am here</h2>
Username: ${name}
<br>
Password: <%= request.getAttribute("password")%>
</body>
</html>
