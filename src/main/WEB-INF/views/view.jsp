<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>>

<!DOCTYPE html>
<html>
<head>
    <title>Add Player</title>
</head>
<body>
<h2>PLayer Form</h2>
<hr>

<%--@elvariable id="athlete" type="controller.Athlete"--%>
<form:form action = "processPlayerForm" modelAttribute="athlete">
    <br><br>
    Name:<form:input path="Lastname"/>

    <br><br>
    <input type="submit" value="Add Player"/>

</form:form>



</body>
</html>