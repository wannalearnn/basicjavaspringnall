<%@page import="org.springframework.web.context.request.RequestAttributes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.visa.project.domain.Test"%>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create your test here</title>
</head>
<body>
<form action = "testcreation" method = "GET">
		Title : <input type="text" name="testTitle"> <br/>
         Description : <input type = "text" name = "testDescription">
         <br />
      Link :  <input type = "text" name = "testLink">
         <br />
         <input type = "submit" value = "Submit" />
      </form>
      
      
      <br>
      <br>
      <br>
      
  

<c:forEach items = "${all}" var="x">
<a href = "testdisplay/${x.testId}" ><c:out value="${x.getTestId() }"/>  <br/></a>


</c:forEach>


      
      
</body>
</html>