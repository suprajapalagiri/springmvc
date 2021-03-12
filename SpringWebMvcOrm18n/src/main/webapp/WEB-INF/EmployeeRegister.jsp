<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Employee RegisterPageeeeeeee</title>
<style type="text/css">
.errors {
	color: red;
}
</style>
</head>
<body>
	<a href="?lang=hi">HINDI</a>
	<a href="?lang=te">TELUGU</a>
	<h2>
		<spring:message code="title" />
	</h2>
	<!-- action="/spring-mvc-xml/addEmployee" modelAttribute="employee"> -->
	<form:form action="/SpringWebMvcOrm18n/insert" method="post" modelAttribute="employee">
		<pre>
<spring:message code="ename" /> : <form:input path="empName" />
<form:errors path="empName" cssClass="errors" />
<spring:message code="epwd" /> : <form:password path="empPwd" />
<form:errors path="empPwd" cssClass="errors" />
<spring:message code="egen" /> : <form:radiobutton path="empGen" value="Male" /> Male 
                                  <form:radiobutton path="empGen" value="Female" /> Female
<form:errors path="empGen" cssClass="errors" />
<spring:message code="eaddr" /> : <form:textarea path="empAddr" />
<form:errors path="empAddr" cssClass="errors" />

<spring:message code="ecntry" /> :
 <form:select path="empCntry">
<form:option  value="NONE" label="--- Select ---"/>
 <form:option  value="IND" label="IND"></form:option>
  <form:option  value="AUS" label="AUS"></form:option>
   <form:option  value="DNR" label="DNR"></form:option>
</form:select>
 <form:errors path="empCntry" cssClass="errors" />
 
<spring:message code="elang" />: 
 ENG<form:checkbox path="empLang" value="ENG" />
 HIN<form:checkbox path="empLang" value="HIN" />
 TEL<form:checkbox path="empLang" value="TEL" />
 TAM<form:checkbox path="empLang" value="TAM" />
<form:errors path="empLang" cssClass="errors" />
<input type="submit" value="Register" />
</pre>
	</form:form>
	${message}
</body>
</html>