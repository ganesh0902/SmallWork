<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.test.model.smallwork" %>    
<%@page import="com.test.service.smallworkLocalServiceUtil" %>
<%@page import="com.test.dao.*" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="p"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<title></title>
		 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
	<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
	<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="p"%>
	
	<link rel="stylesheet" href="https://code.jquery.com/ui/1.13.0/themes/smoothness/jquery-ui.css">
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="https://code.jquery.com/ui/1.13.0/jquery-ui.min.js"></script>

<style type="text/css">

tr td:nth-child(2) {
  padding-right: 10px;
}
.leftSide{
	padding-right: 200px;"
	padding-top:30px;
}

</style>
</head>
<body>

	 <%
			 int record=ParamUtil.getInteger(request,"currentId");
			 System.out.println("current user "+record);
			smallwork getRecord = smallworkLocalServiceUtil.getsmallwork(record); 
	%> 

	<div class="outer" id="flip1" style="border: 1px solid gray;border-bottom: none;size: 20px;padding: 10px 0px 10px 0px; background: #e4e6e9;"><span class="arrow1"><span class="arrow-up1">&#x25BC;</span><span class="arrow-down1">&#9658;</span></span>Quote Form
	</div>
	<div id="projectInfoPanel">
		<div id="projectInfos" style="display: flex; margin-top: 20px;">
			<div id="projectChild1" style="flex:3;">
					<div>
						<table style="margin-left: 60px;">
							<tr>
								<td class="leftSide">Project Name</td>
								<td><%=getRecord.getProjectName() %>
								</td>
							</tr>
							<tr style="height: 100px;">
								<td class="leftSide">Small Work Type</td>
								<td><%=getRecord.getWorkType() %>
							</td>
							</tr>
						</table>
					</div>
			</div>
			<div id="projectChild12" style="flex:3;">
				<div>
					<table style="margin-left: 60px;">
						<tr>
							<td class="leftSide">Customer</td>
							<td><%=getRecord.getCustomerName() %></td>
						</tr>
						<tr style="height: 100px;">
								<td class="leftSide">New or Existing/td>
								<td>New Build Fitout
							</td>
							</tr>
					</table>
				</div>
			</div>
		</div>
		
		<fieldset style="border: 1px solid gray; width: 98%; height: 150px; margin-left: 20px; margin-right: 2px;margin-bottom: 20px;">
		<legend style="width: fit-content; margin-left: 20px; border-bottom: none; color: rgb(71, 143, 202); font-size: 16px; font-family: Segoe UI;">Estimated</legend>
			<div style="margin-left: 50px;">
			<div style="margin-top: -20px;margin-bottom: 10px;">
					<span style="position: relative;left: 170px;">Start Date</span>
					<span style="position: relative;left: 270px;">End Date</span>
					<span style="position: relative;left: 320px;">Week Date</span>
			</div>		
					<table>
						<tr>							
							<td style="padding-right: 70px;" class="pos">Bid Programme</td>
							<td style="padding-right: 70px;color: white;" class="pos">Bid Programme</td>
							<td style="padding-right: 70px;" class="pos">12/06/2023</td>
						</tr>
						<tr style="height: 60px;">
							<td >Project Programme</td>
							<td><%=getRecord.getProjectDate() %></td><!--  start date-->
							<td><%=getRecord.getEndDate() %></td><!-- end date -->
							<td>03;4;44</td><!-- week -->
						</tr>
					</table>
			</div>
		</fieldset>
	</div>
	
	<div class="outer" id="flip2" style="border: 1px solid gray;border-bottom: none;size: 20px;padding: 10px 0px 10px 0px; background: #e4e6e9;"><span class="arrow2"><span class="arrow-up2">&#x25BC;</span><span class="arrow-down2">&#9658;</span></span>Quote Form
	</div>
	<div id="quoteInfoPanel">
		<div>
			<div style="display: flex;margin-top: 30px;">
				<div style="flex:4">
					<table style="margin-left: 50px;">
						<tr style="height: 40px;">
							<td>Quotation on our Format</td>
							<td style="padding-left: 200px;"><%=getRecord.getQuotationName() %></td>
						</tr>
						<tr style="height: 40px;">
							<td>Overall Project Cost(£)</td>
							<td style="padding-left: 200px;"><%=getRecord.getProjectCost() %></td>
						</tr>
						<tr style="height: 40px;">
							<td>Quote Document</td>
							<td style="padding-left: 200px;">
							</td>
						</tr>
					</table>
				</div>
				<div style="flex:4">
					<table>
						<tr style="padding-top: 80px;height: 100px;">
							<td>Overall Project Sell(£)</td>
							<td style="padding-left: 200px;"><%=getRecord.getProjectSell() %></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<div style="width: 100%;background-color: #307ecc;height: 40px;">
			<label style="padding-top: 10px;padding-left: 20px;color: white;">Bid Information</label>
		</div>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Cost code/Category</th>
					<th>Cost</th>
					<th>Sell</th>
					<th>Margin</th>
					<th>Margin</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Total</td>
					<td>0.00</td>
					<td>0.00</td>
					<td>0.00</td>
				    <td>0.00</td>
				</tr>
			</tbody>
		</table>
		<div style="display: flex;">
			<div style="flex:4">
					<table style="margin-left: 50px;">
						<tr style="height: 60px;">
							<td>Bid Sheet</td>
							<td style="padding-left: 200px;"></td>
						</tr>
						<tr style="height: 60px;">
							<td>Does the Bid Sheet meet company <br>authorisation criteria?</td>
							<td style="padding-left: 200px;"><%=getRecord.getBidInfor() %></td>
						</tr>
					</table>
				</div>
			<div style="flex:4">
			
			</div>	
			
		</div>
	</div>
	
<script type="text/javascript">
$( document ).ready(function() {
	
	$(".arrow-down1").hide();
	$("#flip1").click(function(){
	    $('.arrow-up1,.arrow-down1').toggle();
	$("#projectInfoPanel").slideToggle("slow");
	});
	
	$(".arrow-down2").hide();
	$("#flip2").click(function(){
	    $('.arrow-up2,.arrow-down2').toggle();
	$("#quoteInfoPanel").slideToggle("slow");
	});
	
	$(".arrow-down3").hide();
	$("#flip3").click(function(){
	    $('.arrow-up3,.arrow-down3').toggle();
	$("#panel3").slideToggle("slow");
	
	});
});
</script>		
</body>
</html>