<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %> 
<%@page import="com.test.model.smallwork" %>  
<%@page import="java.util.*" %> 
<%@page import="com.test.service.smallworkLocalServiceUtil" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="p"%>
    
<%-- <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>   
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="p"%>
<%@page import="com.test.model.smallwork" %>    
<%@page import="com.test.service.smallworkLocalServiceUtil" %>
<%@page import="com.test.dao.*" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="p"%>   
<%@page import="java.util.List;" %>  --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">

body {
	margin: 0px;
	padding: 0px;
}
</style>

</head>
<body>

<!-- this is for update -->
	<%-- <p:renderURL var="submitQuote">
		<p:param name="name" value="vinit"></p:param>
		<p:param name="jspPage" value="/html/example1/SubmitQuote.jsp"></p:param>
	</p:renderURL>  --%>
		


	<div style="width: 100%;background-color: #2E86C1;height: 50px;display: flex;">
		<div style="width: 200px;flex:5;">
			<img alt="Quadwave" src="https://rcc-test.econsys.io/ace-theme/images/LogoForHubPage.png" style="padding-left: 18px;bottom:0px;margin-top: 10px;">
		</div>
		<div style="flex:5;">
			
			<div> <small style="font-size: 17px;color: white;position: relative;left: 400px;top: 1px;">My Site</small> <small style="position: relative;left: 335px;top: 13px;padding:10px 20px 10px 20px;border-radius:40px;"> <img alt="My Account" class="user-avatar-image" src="/image/user_male_portrait?img_id=0&amp;t=1680595284530" style="width: 7%;border-radius:20px;position: relative;top: -12px;right: -65px;"></small> <label style="float: right;color:white;; margin-right: 20px;">Welcome <br>Ganesh Sakhare</label></div>
		</div>
	</div><!-- header section close here -->
	<div class="container" style="width: 100%;background-color: #F0F0F0">
		<div style="display: flex">
			<div style="flex:5">
				<div style="font-size: 18px;">
					<small>Menu</small>
					<small><i class="fa fa-home" style="font-size:24px;margin-right: 7px;" ></i>RCC Limit </small>
					<small> <i class="fa fa-angle-right" style="font-size:24px;margin-top:3px;margin-left: 6px;margin-right: 6px;"></i>Home</small>
					<small>
						<p:renderURL var="reuqestToQuote">
						<p:param name="name" value="vinit"></p:param>
						<p:param name="jspPage" value="/html/example1/view.jsp"></p:param>
						</p:renderURL> <a type="button" href="${reuqestToQuote}"
						class="btn btn-sm btn-warning">Small Work</a>
					
					 </small>
				</div>
			</div>
			<div style="flex:5">
				<div style="float: right;margin-top: 10px;">
					<button class="btn btn-primary"><i class="fa fa-home" style="font-size:20px;margin-right: 7px;" ></i></button>
					<button class="btn btn-primary" ><i class="fa fa-sitemap" style="font-size:20px"></i></button>
					<button class="btn btn-warning"><i class="fa fa-tag" style="font-size:20px"></i></button>
					<button class="btn btn-danger" ><i class="icon-th "></i></button>
					<button class="btn btn-success" ><i class="icon-time "></i></button>
					<button class="btn btn-primary" style="background-color: #6fb3e0;"><i class="icon-info-sign"></i></button>
				</div>
			</div>
		</div>
	</div>
	<!-- review section -->
		<div style="width: 100%;">
			
				<div style="display: flex;margin-top: 20px;height: 100px;">
					<div style="flex:3;background-color: white;margin-right: 20px;border: 1px solid #27abc3;border-left: 5px solid #27abc3">
					
						<small style="font-size: 20px;position: relative;top: 40px;left: 30px;">Tasks</small>
						<small style="background-color: white;position: relative;top: 33px;left: 40px;padding: 10px 20px 10px 20px;border-radius:30px;border:2px solid #27abc3;font-size: 17px;"> 36</small>
						<small><a href="#" style="position: relative;top: 25px;left: 95px;font-size: 16px;">Now: 26</a></small><br>
						<small><a href="#" style="position: relative;top: 30px;left: 215px;font-size: 16px;">Later: 10</a></small>	
					</div>
					<div style="flex:3;background-color: white;margin-right: 10px;border: 1px solid #f38425;border-left: 5px solid #f38425">
						<small style="font-size: 20px;position: relative;top: 40px;left: 30px;">Reviews</small>
						<small style="background-color: white;position: relative;top: 33px;left: 40px;padding:10px 20px 10px 20px;border-radius:30px;border:2px solid #f38425;font-size: 17px;"> 36</small>
						<small><a href="#" style="position: relative;top: 25px;left: 72px;font-size: 16px;">Now: 26</a></small><br>
						<small><a href="#" style="position: relative;top: 30px;left: 215px;font-size: 16px;">Later: 10</a></small>	
					
					</div>
					<div style="flex:3;background-color:white;margin-right: 10px;border: 1px solid green;border-left: 5px solid green">
						<small style="font-size: 20px;position: relative;top: 40px;left: 30px;">Approvals</small>
						<small style="background-color: white;position: relative;top: 33px;left: 40px;padding:10px 20px 10px 20px;border-radius:30px;border:2px solid green;font-size: 17px;"> 36</small>
						<small><a href="#" style="position: relative;top: 25px;left: 58px;font-size: 16px;">Now: 26</a></small><br>
						<small><a href="#" style="position: relative;top: 30px;left: 215px;font-size: 16px;">Later: 10</a></small>	
					
					</div>
					<div style="flex:3;background-color:white;border: 1px solid #27abc3;border-left: 5px solid #27abc3">
								<small style="font-size: 20px;position: relative;top: 40px;left: 30px;">Buddy Tasks</small>
								<small style="background-color: white;position: relative;top: 33px;left: 40px;padding:10px 20px 10px 20px;border-radius:30px;border:2px solid #27abc3;font-size: 17px;"> 36</small>
									
					</div>
				</div>
		</div>
		
		<!-- all task -->
		<div style="width: 65%;background-color: white;height: 120px;margin-top: 40px;">
			
			<div style="display: flex;">
				<div style="flex:3;background-color:#e4edf6;border: 1px solid #27abc3;margin-right: 3px;height: 45px;">
					<div style="margin-left: 30px;">
					<small style="font-size: 15px;position: relative;top: 10px">Now </small>
					<small style="font-size: 15px;position: relative;top: 13px;padding: 7px 12px 7px 12px;border: 1px solid black;border-radius:20px;">35</small>
					</div>
				</div>
				<div style="flex:3;background-color:white;border: 1px solid #27abc3;margin-right: 3px;height: 45px;">
				<div style="margin-left: 30px;">	
				 	<small style="font-size: 15px;position: relative;top: 10px">Later </small>
					<small style="font-size: 15px;position: relative;top: 13px;padding: 7px 12px 7px 12px;border: 1px solid black;border-radius:20px;">35</small>
				</div>	
				</div>
				<div style="flex:3;background-color:white;border: 1px solid #27abc3;margin-right: 3px;height: 45px;">
				<div style="margin-left: 30px;">
				    <small style="font-size: 15px;position: relative;top: 10px">All </small>
					<small style="font-size: 15px;position: relative;top: 13px;padding: 7px 12px 7px 12px;border: 1px solid black;border-radius:20px;">35</small>
				</div>	
				</div>
				<div style="flex:3;background-color:white;border: 1px solid #27abc3;margin-right: 3px;height: 45px;">
				<div style="margin-left: 30px;">
			         <small style="font-size: 15px;position: relative;top: 10px">Buddy Task </small>
					<small style="font-size: 15px;position: relative;top: 13px;padding: 7px 12px 7px 12px;border: 1px solid black;border-radius:20px;">35</small>
				</div>	
				</div>
			</div>
		</div>
		<div style="background-color:#e4edf6;width: 100%;height: 20px; position: relative;top: -74px;padding: 10px 0px 10px 10px;font-size: 15px;">Now   </div>
		<div style="background-color:#BDCDD6;width: 100%;height: 20px;padding: 10px 0px 10px 10px;font-size: 15px;position: relative;top: -78px;">
			<div style="display: flex;">
				<div style="flex:3">
					<small><i class="fa fa-search" style="font-size:18px;color: #f38425;"></i></small>
					<small style="font-size: 15px;">Search</small>
					<small><i class="fa fa-file-excel-o" style="font-size:18px;margin-left: 10px;color: green;"></i></small>
					<small><i class="fa fa-print" style="font-size:18px;margin-left: 10px;color: red;"></i></small>
				</div>
				<div style="flex:3">
					<div>
						<small><i class="fa fa-angle-double-left" style="font-size:24px"></i></small>
						<small><i class="fa fa-angle-left" style="font-size:24px;margin-left: 10px;"></i></small>
						<small style="position: relative;top: -4px;left: 15px;font-size: 14px;">Page</small>
						<small><input type="text" style="width: 26px;margin-left: 20px;margin-top: -5px;text-align: center;" value="1"></small>
						<small style="position: relative;top: -8px;margin-left: 10px;font-size: 14px;"> Of 2</small>
						<small><i class="fa fa-angle-right" style="font-size:24px;position: relative;top: -5px;left: 20px;"></i></small>
						<small><i class="fa fa-angle-double-right" style="font-size:24px;position: relative;top: -5px;left: 29px;"></i></small>
						<small><input type="text" style="width: 40px;position: relative;left: 35px;top: -3px;text-align: center;height: 15px;" value="30"></small>
					</div>
				</div>
				<div style="flex:3">
					<small style="font-size: 14px;float: right;margin-right: 20px;">View 1 - 30 of 38</small>
				</div>
			</div>
			<div style="width: 100%;margin-bottom: 30px; overflow: scroll;">
				<table class="table table-striped">
					<thead>
						<tr>
							<td>Quote Ref</td>
							<td>Job Reference</td>
							<td>Customer</td>
							<td>Site Name</td>
							<td>Project</td>
							<td>Task</td>
							<td>Anticipated Order</td>
							<td>Receive Date</td>
							<td>Types</td>
							<td>Last UPD</td>
							<td>Action</td>
						</tr>
					</thead>
					<tbody>
				 	 <%
					List<smallwork> getsmallworks = smallworkLocalServiceUtil.getsmallworks(-1,-1);
					
					String redirect=(String)request.getAttribute("key");
					for (smallwork getsmall : getsmallworks) {
						
					%>	
						<tr>
							<td><%=getsmall.getQuoteReference() %></td>
							<td>---</td>
							<td><%=getsmall.getCustomerName() %></td>
							<td><%=getsmall.getSitename() %></td>
							<td><%=getsmall.getProjectName() %></td>
							<%
								if(getsmall.getStage().equals("submitquote"))
								{
									
							%>						
							<td>
								<p:renderURL var="submitQuote">
								 <p:param name="currentId" value="<%=String.valueOf(getsmall.getId())%>"></p:param>
								<p:param name="jspPage" value="/html/example1/SubmitQuote.jsp"></p:param>
							   </p:renderURL> 
							<a href="${submitQuote }">Submit  Quote</a></td>
							<%} 
							if(getsmall.getStage().equals("combine"))
							{	
							%>
								<td>
								<p:renderURL var="combine">
								 <p:param name="currentId" value="<%=String.valueOf(getsmall.getId())%>"></p:param>
								<p:param name="jspPage" value="/html/example1/CombinePage.jsp"></p:param>
							   </p:renderURL> 
								<a href="${combine }">Status of Submit quote</a></td>
								
							<%} 
							if(getsmall.getStage().equals("submitQuote"))
							{	
							%>
								<td>
								<p:renderURL var="SubmitQuote2">
								 <p:param name="currentId" value="<%=String.valueOf(getsmall.getId())%>"></p:param>
								  <p:param name="stage" value="SubmitQuote2"></p:param>
								<p:param name="jspPage" value="/html/example1/CombinePage.jsp"></p:param>
							   </p:renderURL> 
								<a href="${SubmitQuote2 }">Status of Submit quote</a></td>
								
							<%} 
							if(getsmall.getStage().equals("preOrder"))
							{
							%>
								<td>
								<p:renderURL var="preOrder">
								 <p:param name="currentId" value="<%=String.valueOf(getsmall.getId())%>"></p:param>
								  <p:param name="stage" value="SubmitQuote2"></p:param>
								<p:param name="jspPage" value="/html/example1/CombinePage.jsp"></p:param>
							   </p:renderURL> 
								<a href="${preOrder }">preOrder</a></td>
								
							<%}
								
							if(getsmall.getStage().equals("prepareReviewQuote"))
							{
							%>
								<td>
								<p:renderURL var="prepareReviewQuote">
								 <p:param name="currentId" value="<%=String.valueOf(getsmall.getId())%>"></p:param>
								  <p:param name="stage" value="prepareReviewQuote"></p:param>
								<p:param name="jspPage" value="/html/example1/prepareReviewQuote.jsp"></p:param>
							   </p:renderURL> 
								<a href="${prepareReviewQuote }">prepare Revise Quote</a></td>
								
							<%}
							if(getsmall.getStage().equals("orderAcceptance"))
							{
							%>
								<td>
									<a href="#"> order Acceptance</a>
								</td>
							<%	
							}	
							%>
							<td><%=getsmall.getAnticipatedDate() %></td>							
							<td>--</td>
							<td>Type</td>
							<td>Last UPD</td>
							<td> <button class="btn btn-primary">Update</button></td>
							
						</tr>
						
					<%}%> 	<!--prepareReviewQuote-->
					</tbody>
				</table>	
			</div>
		 </div>
</body>
</html>