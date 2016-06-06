<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="canvas.SignedRequest" %>
<%@ page import="java.util.Map" %>
<%
    // Pull the signed request out of the request body and verify/decode it.
    Map<String, String[]> parameters = request.getParameterMap();
    String[] signedRequest = parameters.get("signed_request");
    if (signedRequest == null) {%>
        This App must be invoked via a signed request!<%
        return;
    }
    //String yourConsumerSecret=System.getenv("CANVAS_CONSUMER_SECRET");
    String yourConsumerSecret="5209022393788021283";
    String signedRequestJson = SignedRequest.verifyAndDecodeAsJson(signedRequest[0], yourConsumerSecret);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Basic Struts 2 Application - Welcome</title>
<s:head />

<script type="text/javascript" src="https://lightningtestaaaa-dev-ed.my.salesforce.com/canvas/sdk/js/34.0/canvas-all.js"></script>
<script type="text/javascript" src="scripts/json2.js"></script>
<script>
        if (self === top) {
            // Not in Iframe
            alert("This canvas app must be included within an iframe");
        }

        Sfdc.canvas(function() {
            var sr = JSON.parse('<%=signedRequestJson%>');
            // Save the token
            Sfdc.canvas.oauth.token(sr.oauthToken);
            Sfdc.canvas.byId('username').innerHTML = sr.context.user.fullName;
        });
</script>

</head>
<body>
<h1>Hello <span id='username'></span></h1>
<p><a href="<s:url action='hello'/>">Hello World</a></p>
<s:url action="registerInput" var="registerInputLink" />
<p><a href="${registerInputLink}">Please register</a> for our prize drawing.</p>

<s:form action='hello'>

<s:textfield name="userName" label="Your name" />
     
   <s:submit value="Submit" />

</s:form>

<hr />
<s:text name="contact" />

</body>
</html>