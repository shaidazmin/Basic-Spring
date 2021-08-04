<html>
<body>
<h2>Hello World!</h2>

<% String name = (String) request.getAttribute("name"); %>

<h3>Text from model controller : <%=name%></h3>

<a href="about">About</a>

</body>
</html>
