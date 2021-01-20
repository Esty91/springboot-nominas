<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar el salario de un empleado</title>
</head>
<body>
<h1>Introduce el dni del empleado:</h1>
<form:form method="post" action="salarioPorDni.htm"> 
  <table>
    <tr>
      <td>
          <input type="text" name="dni" />
        </td>
    </tr>
  </table>
  <br>
  <input type="submit" value="Execute">
</form:form>
<a href="<c:url value="index.jsp"/>">Volver</a>
</body>
</html>