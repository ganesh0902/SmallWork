<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
    
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
		 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
	<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
	<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="p"%>

<style type="text/css">

#projectHeader{

	display: flex;
}
 #projectPart1{
	
	flex:5;
	
}
 #projectPart2{
	
	flex:5;
	
}
#projectPart1 th, td {
  padding: 20px;
}
.second{
	
	padding-left: 80px;
}
</style>	
</head>
<body>
<portlet:actionURL name="prepareQuote" var="prepareQuote"/>
<!-- Project info -->
<div class="outer" id="flip1" style="border: 1px solid gray;border-bottom: none;size: 20px;padding: 10px 0px 10px 0px; background: #e4e6e9;"><span class="arrow1"><span class="arrow-up1">&#x25BC;</span><span class="arrow-down1">&#9658;</span></span>Project Info
	</div>
	<form action="${prepareQuote }" method="post" style="font-size: 14px;">
	<div id="projectInfo" style="border: 1px solid black;">
		<div id="projectHeader">
			<div id="projectPart1">
				
			<%
			 int record=ParamUtil.getInteger(request,"currentId");
			 System.out.println("current user "+record);
			smallwork getRecord = smallworkLocalServiceUtil.getsmallwork(record); 
			%>
							
							
				<table style="margin-left: 50px;">
						<tr>
							<td>Requester Name</td>
							<td class="second">Ganesh Sakare</td>
						</tr>
						<tr style="padding-top:-60px; ">
							<td>Project Name</td>
							<td class="second"><%=getRecord.getProjectName() %></td>
						</tr>
						<tr>
							<td>Customer Address</td>
							<td class="second">	
 								<%=getRecord.getCustomerAddress()%>
						</tr>
						<tr>
							<td>Small Work Type</td>
							<td class="second"><%=getRecord.getWorkType() %></td>
						</tr>
						<tr>
							<td>Site Name</td>
							<td class="second"><%=getRecord.getSitename() %></td>
						</tr>
						<tr>
							<td>Short Site Name</td>
							<td class="second"> New Build S&C </td>
						</tr>
						<tr>
							<td>Lead Source</td>
							<td class="second"><%=getRecord.getLeadSource() %></td>
						</tr>
						<tr>
							<td>Description of Works</td>
							<td class="second"><%=getRecord.getDescription() %></td>
						</tr>
				</table>
			</div>
			<div id="projectPart2">
				<div>
					<table style="margin-left: 50px;">
						<tr>
							<td>Request Date</td>
							<td class="second"><%=getRecord.getQuoteSubmitDate() %></td>
						</tr>
						<tr>
							<td>Customer</td>
							<td class="second"><%=getRecord.getCustomerName() %></td>
						</tr>
						<tr>
							<td>Postal Code</td>
							<td class="second"><%=getRecord.getPostcode() %></td>
						</tr>
						<tr>
							<td>New or Existing</td>
							<td class="second">Existing</td>
						</tr>
						<tr>
							<td>Product Specified</td>
							<td class="second"><%=getRecord.getProductSpecific() %></td>
						</tr>
						<tr>
							<td>Customer Type</td>
							<td class="second">Lead Source Contextual Data</td>
						</tr>
							<tr>
							<td>Lead Source Contextual Data</td>
							<td class="second"><%=getRecord.getLeadSource() %></td>
						</tr>
						<tr>
							<td>End User</td>
							<td class="second"><%=getRecord.getEnduser() %></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<fieldset style="border: 1px solid gray; width: 92%; height: 200px; margin-left: 46px; margin-right: 2px;margin-bottom: 20px;">
				 <legend style="width: fit-content; margin-left: 20px; border-bottom: none; color: rgb(71, 143, 202); font-size: 16px; font-family: Segoe UI;">Estimated</legend>
					<div>
					<div style="margin-top: -30px;">
						<span style="margin-left: 210px;">Start Date</span>
						<span style="margin-left: 30px;">End Date</span>
						
						<span style="margin-left: 50px;">Week</span>
					</div>
							<table style="margin-top: -10px;margin-left: 60px;">
							<tr>
								<th>Bid Programme</th>
								<td style="color: white;">29/04/2023</td>
								<td><%=getRecord.getEndDate() %></td>
							</tr>
							<tr>
								<th>Project Programme</th>
								<td><%=getRecord.getProjectDate() %></td>
								<td><%=getRecord.getEndDate2() %></td>
							</tr>
							<tr>
								<th>Anticipated Date</th>
								<td><%=getRecord.getAnticipatedDate() %></td>
								<td style="color: white;">29/04/2023</td>
								<td>1</td>
							</tr>
						</table>
						
					</div>		
		</fieldset>				
	</div>
<!-- quote form content -->
<div class="outer" id="flip2" style="border: 1px solid gray;border-bottom: none;size: 20px;padding: 10px 0px 10px 0px; background: #e4e6e9;"><span class="arrow2"><span class="arrow-up2">&#x25BC;</span><span class="arrow-down2">&#9658;</span></span>Quote Form
	</div>

<div id="projectInfo2" style="border: 1px solid black;">
		
	<div style="display: flex;">
		<div style="flex:5">
			<table style="margin-left: 90px;">
				<tr>
					<th> Quotation on our Format</th>
					<td>Yes</td>
				</tr>
				<tr>
					<th>Overall Project Cost</th>
					<td>0.00</td>
				</tr>
				<tr>
					<th> Quote Document</th>
					<td>Yes</td>
				</tr>
			</table>
		</div>
		<div style="flex:5">
			<table>
				<tr>
					<th>Quote Reference Number</th>
					<td>SW8676-Q</td>
				</tr>
				<tr>
					<th>Quote Reference Number</th>
					<td>SW8676-Q</td>
				</tr>
				<tr>
					<th>Quote Reference Number</th>
					<td>SW8676-Q</td>
				</tr>
			</table>
			
		</div>
	</div>
		<div>
			<table class="table table-striped table-bordered" style="width: 95%;margin-left: 30px;text-align: center;">
				<thead>
					<tr>
						<th>Cost/code Category</th>
						<th>Cost</th>
						<th>Sell</th>
						<th>Margin</th>
						<th>Margin</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Warranty PPM SVC</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>Client Training</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>Client Demonstration / Witness	</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>O&M Creation	</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>Project Management	</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>BMS Controls	</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>Computers/Printers/Peripherals		</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>BMS Software		</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>Integration and EMS Software</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>Variable Speed Drives</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>Graphic Implementation</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
						<tr>
						<td>Control Panels & Panel Mods	</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
						<tr>
						<td>Installation & Labour Only	</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
						<tr>
						<td>Graphics Design	</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					
					</tr>
						<tr>
						<td>Software Design	</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					
						<tr>
						<td>Tech Sub Creation	</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					
					</tr>
					<tr>
						<td>Project Design		</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>Pre Commissioning Activites	</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>Site Commissioning Activites</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>SSite Supervision	</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
					<tr>
						<td>Total</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
						<td>00.00</td>
					</tr>
				</tbody>
			</table>
			<table style="margin-left: 70px;"> 
				<tr>
					<th>Does the Bid Sheet meet company<br> authorisation criteria?</th>
					<td style="padding-left: 100px;">Yes</td>
				</tr>
			</table>
		</div>
	</div>

	</form>	
<script type="text/javascript">


	$(document).ready(function() {
		$(".arrow-down1").hide();
		
		$("#flip1").click(function() {
			$('.arrow-up1,.arrow-down1').toggle();
			$("#projectInfo").slideToggle("slow");
		});
		
	$(".arrow-down2").hide();
		
		$("#flip2").click(function() {
			$('.arrow-up2,.arrow-down2').toggle();
			$("#projectInfo2").slideToggle("slow");
		});
		
	});
</script>
</body>
</html>