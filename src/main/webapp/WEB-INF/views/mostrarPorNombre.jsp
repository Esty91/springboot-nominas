<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
<meta charset="ISO-8859-1">
<title>Buscar empleado por nombre</title>
</head>
<body>
<h1>Introduce el nombre del empleado:</h1>
<form:form method="post" action="empleadoPorNombre.htm"> 
  <table>
    <tr>
      <td>
          <input type="text" name="nombre" />
        </td>
    </tr>
  </table>
  <br>
  <input type="submit" value="Execute">
</form:form>
<a href="<c:url value="modificarDatos.htm"/>">Volver</a>
</body>
</html>