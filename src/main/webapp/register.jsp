<%@ page language="java" contentType="text/html; charset=SJIS" pageEncoding="SJIS"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=SJIS">
 <title>Register</title>
</head>
<body>
<h3>Register for a prize by completing this form.</h3>
 
<s:form action="createregister">
 
      <s:textfield key="personBean.firstName"  />
      <s:textfield key="personBean.lastName"/>
      <s:textfield key="personBean.email"/>  
      <s:textfield key="personBean.age"/>
      <s:select key="personBean.sport" list="sports" />
      
      <s:submit/>
       
</s:form> 
  
</body>
</html>