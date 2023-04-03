<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
	<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
	<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="p"%>
</head>
<body>

<div style="width: 100%;height: 90px;">
  <button class="btn btn-primary" id="submitBtn"> Submit quote</button>
  <button class="btn btn-primary" id="prepareBtn"> PreOrder information</button>
  <button class="btn btn-primary" id="statusBtn"> Status of Submitted quote</button>
</div>


 <small id="submit"><jsp:include page="PrepareQuote.jsp" />  
 </small>

   <small id="preOrder"><jsp:include page="PreorderInformation.jsp" />  
 </small>
 <small id="status"><jsp:include page="StatusOfSubmited.jsp" />  
 </small>
 

<script type="text/javascript">

$(document).ready(function(){
	
	$("#submit").hide();
	$("#preOrder").hide();
	$("#status").show();

	$("#submitBtn").click(function(){
		$("#submit").show();
		$("#preOrder").hide();
		$("#status").hide();
	});
	$("#prepareBtn").click(function(){
		$("#submit").hide();
		$("#preOrder").show();
		$("#status").hide();
		
	});
	$("#statusBtn").click(function(){
		
		$("#submit").hide();
		$("#preOrder").hide();
		$("#status").show();

	});

	});
</script> 

</body>
</html>