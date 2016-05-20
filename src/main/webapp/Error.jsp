<%@ page language="java" contentType="text/html; charset=SJIS" pageEncoding="SJIS"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=SJIS">
    <title>Hello World!</title>
  </head>
 
  <body>
    <h2>エラーメッセージ</h2>
    <h4>The application has malfunctioned.</h4>
    
    <p><a href="<s:url action='index' />" >Return to home page</a>.</p>
 
	<p>  Please contact technical support with the following information:</p> 
	 
	<h4>Exception Name: <s:property value="exception" /> </h4>
	 
	<h4>Exception Details: <s:property value="exceptionStack" /></h4> 
  </body>
</html>