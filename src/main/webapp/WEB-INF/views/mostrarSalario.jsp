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
  <input type="submit" class="btn btn-secondary" value="Execute">
</form:form>
<a href="hello.htm"><input type="submit" name="Opcion" class="btn btn-info"
		value="volver"></a>
</body>
</html>