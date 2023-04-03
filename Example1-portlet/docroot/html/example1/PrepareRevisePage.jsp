<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>    
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>   
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="p"%>
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
	
	
	<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<script src="https://code.jquery.com/jquery-3.6.3.js" 
integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js" integrity="sha256-0YPKAwZP7Mp3ALMRVB2i8GXeEndvCq3eSl/WsAl1Ryk=" 
  crossorigin="anonymous"></script>
	
<style type="text/css">
	
	#section1_parent{
		
		display: flex;
		margin-top: 50px;
		margin-left: 50px;
	}
	#section1_parent #section1_child1{
		
		flex:5;
	}
	#section1_parent #section2_child2{
		
		flex:5;
	}
	  tr, td {
 	 		padding-top: -25px;
 	 		padding-left: 50px;
		}
		tr,td,input{
			
			padding-left: 20px;
			padding-top: 30px;

		}
			#firstSection{
		display: flex;
		margin-left: 10px;
		margin-right: 10px;
	}
	#bidSheet{
		
		flex:5;
		margin-right: 15px;
		padding-top: -20px;
	}
	#bidInformation{
		
		flex:5;
		margin-left: 15px;
	}
	#secondSection{
		
		display: flex;
		margin-left: 10px;
		margin-right: 10px;
		margin-top: 20px;
	}
	#ppm{
		
		flex:6;
		margin-right: 5px;
		margin-right: 10px;
	}
	#calloutsiteattendence{
	
		flex:4;
		margin-left: 5px;
		/* margin-right: 10px; */
	}
	#bidSheetChild{
		
		display: flex;
		margin-top: -20px;
	}
	#fileUploadSection{
		
		flex:4;
		margin-left: 20px;
		margin-right: 20px;

	}
	#ppmBidSheetTemplate{
		
		flex:6;
		margin-right: 20px;
		margin-left: -30px;
	}
	#toggle-btn1 input[type="checkbox"]{
	
		display: none;		
	}
	#toggle-btn1 label{
		
		display: block;
		width: 60px;
		height: 30px;
		border-raduis:20px;
		background: #555;
	}
	#ppmGrid{
		
		display: flex;
		margin-top: -20px;
		margin-left: 20px;
		margin-right: 10px;
	}
	 #ppmGrid #ppmC1{
		
		display: 5;
		reuqest
	}
	#ppmGrid  #ppmC2{
		display: 5;
		
	}
	 #callOutGrid{
	
		display: flex;
		margin-top: -20px;
	}
	 #grid1{
		
		flex:5;
		margin-left: 20px;
		margin-right: 10px;
		padding-right: -30px;
		
	}
	 #grid2{
		
		flex:5;
		flex:5;
		margin-left: 20px;
		padding-right: 20px;
	}
	#thirdSection{
		
		display: flex;
		margin-left: 10px;
		margin-right: 10px;
	}
	#tgrid1{
		
		flex:3;
		margin-right: 10px;
		
	}
	#tgrid2{
		
		flex:3;
		margin-right: 10px;
		
	}
	#tgrid3{
		flex:3;
	}
	#del{
		
		color: red;
	}
	#udt{
		
		color: #3498DB;
		margin-right: 3px;
		margin-left: 5px;
	}
	.required-field::after{
	
		content:"*";
		color:red;
	}
	.error::after {
	  
	  color: red;
	  content: "*";
	}
	.flex-container{
		display: flex;
		flex-direction: row;
		justify-content: flex-end;
		align-items: center;
	}
	.right-item{
		width: 65%;
	}
	.right-item1{
	justify-content: flex-end;
	}
	.comment{
		color:#009EFF;
		border: 1px solid #009EFF;
		height: 30px;
	}
	.container{
		padding: 1%;
	}
	.comment >label{
		margin: 10px 5px;
	}
	.border	{
		border: 1px solid black;
	}
	textarea {
  	
  		border: 1px solid black;
	}
.SO{
	padding: 2px;
}	
/* .prepare-quote{
	border-left: 1px solid #00aeff;
	border-right: 1px solid #00aeff;
} */	
	.timeline {
  	display: grid;
  	grid-template-columns: 10% 3px 50%;
}
.ccd{
	margin-left: 20%;
	column-gap: 0px;
	
}
.timeline__middle {
  		
  position: relative;
  background: grey;
  width: 1px;
  top: 15px;
}
.timeline__component{
	color: #a069c3;
	margin-top: 15px;
	margin-left: 10%;
	font-weight: bold;
}
.timeline__point {
  position: absolute;
  top: 0;
  left: 55%;
  transform: translateX(-50%);
  width: 15px;
  height: 15px;
  background: #009EFF;
  border-radius: 50%;
}
.timeline__component__right{
	padding: 15px;
}
.timeline__component--bottom {
  margin-bottom: 0;
}
div.timeline:last-of-type .timeline__middle{
	height:10px;
}
	</style>	
</head>
<body>
<portlet:actionURL var="updates" name="ambedUpdates"/>

<%
  //int record = daoImplement.getRecord(); 

 int record=ParamUtil.getInteger(request,"currentId");
 
 System.out.println("current user "+record);
smallwork getRecord = smallworkLocalServiceUtil.getsmallwork(record); %>

	<div style="margin-bottom: 20px;border-bottom: 6px solid black;padding-bottom: 20px;width: 35%;" id="head">
			<small><a href="#" style="font-size: 16px;">Quote Form</a></small>
			<small><a href="#" style="font-size: 16px;margin-left: 20px;color: black;">Pre-Order Information</a></small>
			<small><a href="#" style="font-size: 16px;margin-left: 20px;color: black;">Status of submited Quote</a></small>
	</div>
	
	<div id="panell">
		<!-- First section -->
	<div class="outer" id="flip1" style="border: 1px solid gray;border-bottom: none;size: 20px;padding: 10px 0px 10px 0px; background: #e4e6e9;"><span class="arrow1"><span class="arrow-up1">&#x25BC;</span><span class="arrow-down1">&#9658;</span></span>Quote Form
	</div>
	<form id="myForm" action="${updates }" method="post">
	<div id="panel1"  style="border: 1px solid gray;">
			<div id="header" style="border: 1px solid gray;">
				<!-- Section of Project Info -->
				<div class="oute2" id="flip2"
					style="border: 1px solid gray; size: 16px; border-bottom: none; margin-top: 1%; margin-left: 2%; margin-right: 2%; padding: 10px 0px 10px 0px; background: #e4e6e9;">
					<span class="arrow2"><span class="arrow-up2">&#x25BC;</span><span
						class="arrow-down2">&#9658;</span></span>Project Info
				</div>
				<div id="panel_Of_Project_Info"
					style="border: 1px solid gray; border-bottom: none; size: 16px; margin-left: 2%; margin-right: 2%;">
					<div id="header_of_project" style="border: 1px solid gray;">
						<div id="section1_parent" style="display: flex;">
							<div id="section1_child1" style="flex: 5;">
							<input type="hidden" value="<%=getRecord.getId()%>" name="currentId">
								<table>
									<tr>
										<td><label class="error"
											style="margin-top: -10px; margin-right: -40px;" id="quoteError" >Quote
												Reference Number </label></td>
										<td style="height: 75px;"><input type="text"
											 name="quoteReference"
											style="height: 70%; width: 115%;" size="25" height="32%;" id="quote" value="<%=getRecord.getQuoteReference()%>"></td>
										<td><label class="text-primary"
											style="margin-top: -5px;margin-left: 25px;width: 100%;background-color: #00aeff;padding: 5px 10px 5px 10px;" class="btn btn-primary">Generate Quote Number</label></td>
									</tr>
									<tr>
										<td><label class="error"
											style="margin-top: -45px; margin-right: -130px; position: relative; right: -25px;" id="projectNameError">Project
												Name </label></td>
										<td style="height: 75px;"><input type="text"
											 name="projectName" value="<%=getRecord.getProjectName()%>"
											style="height: 70%; margin-top: -30px; width: 115%;"
											size="25" height="32%;" id="projectName" onkeyup="lettersOnly(this)"><i class='far fa-comment-dots' style='font-size:20px;position: relative;top: -35px;left: 260px;'></i></td>
									</tr>
									<tr>
										<td ><label style="margin-top: -90px;" ></label></td>
										<td style="height: 170px;"><textarea
												style="width: 140%; height: 60%; margin-top: -90px;" id="customerAddress" name="customerAddress"><%=getRecord.getCustomerAddress()%></textarea>
												<i class='far fa-comment-dots' style='font-size:20px;position: relative;top: -35px;left: 305px;'>
												</td>
									</tr>
									<tr>
										<td><label class="error"
											style="margin-top: -110px; margin-right: -40px;" id="workTypeError">
												Small Work Type </label></td>
										<td style="height: 170px;"><select
											style="margin-top: -160px; height: 25%; width: 115%;" id="workType" name="workType">
												<option value="select">Select</option>
												<option>New Build Fitout</option>
												<option>New Build S&C</option>
												<option>Other</option>
												<option>Refit</option>
												<option>Supply Only</option>
												<option>Servey</option>
												<option>Supply and install</option>
												<option>Validation Work</option>											
										</select>
										<i class='far fa-comment-dots' style='font-size:20px;position: relative;top: -100px;left: 260px;'></i>
										</td>
									</tr>
									<tr>
										<td><label
											style="margin-top: -220px; margin-right: -130px; position: relative; right: -30px;" id="leadSourceError">
												Lead Source</label></td>
										<td style="height: 170px;"><select
											style="margin-top: -380px; height: 25%; width: 115%;" id="leadSource" name="leadSource">
												<option value="select">Select</option>
												<option>Sales Relationship</option>
												<option>Existing Contract</option>
												<option>Cold Call</option>
												<option>Ad-hoc Enquiry</option>
												<option>Online Portal</option>
												<option>Sub Contractor</option>
												<option>On Site Contact</option>
												<option>Word of Mouth</option>
												<option>Search Engine</option>
												<option>Email Marketing</option>
												<option>Press Article</option>
												<option>Conference/ trade Show</option>
												<option>Networking Event</option>
										</select>
										<i class='far fa-comment-dots' style='font-size:20px;position: relative;top:-205px;left: 260px;'>
										</td>
									</tr>
									<tr>
										<td><label  style="margin-top: -270px;">
												</label></td>
										<td style="height: 170px;"><select
											style="margin-top: -500px; height: 25%; width: 115%;" id="productSpecific" name="productSpecific">
												<option value="select">Select</option>
												<option>Sales Relationship</option>
												<option>Existing Contract</option>
												<option>Cold Call</option>
												<option>Ad-hoc Enquiry</option>
												<option>Online Portal</option>
												<option>Sub Contractor</option>
												<option>On Site Contact</option>
												<option>Word of Mouth</option>
												<option>Search Engine</option>
												<option>Email Marketing</option>
												<option>Press Article</option>
												<option>Conference/ trade Show</option>
												<option>Networking Event</option>
										</select>
										<i class='far fa-comment-dots' style='font-size:20px;position: relative;top: -270px;left: 260px;'>
										</td>
									</tr>
									<tr>
										<td><label class="error"
											style="margin-top: -390px; margin-right: 0px; position: relative; right:-20px;font-size: 14px;" id="descriptionError">Description
												of Works </label></td>
										<td style="height: 170px;"><textarea
												style="width: 160%; height: 60%; margin-top: -680px;" id="description" name="description"><%=getRecord.getDescription() %></textarea></td>
									</tr>
								</table>								
							<label style="position: relative;top: -830px;right: -10px;" id="customerAddressError" class="error">Customer Address</label>
							<label style="position: relative;top: -550px;right: -10px;" id="productSpecificError" class="error">Product Specified</label>
							</div>
							<div id="section1_child2" style="flex: 5;">
								<table>
									<tr></tr>
									<tr>
										<td><label class="error"
											style="margin-top: 30px; position: relative; right: -40px;" id="customerNameError" >Customer</label></td>
										<td style="height: 75px; margin-top: 30px;"><input
											type="text"  id="customerName" name="customerName"
											style="height: 30%; width: 115%; margin-top: 60px;" size="22" onkeyup="lettersOnly(this)" value=<%=getRecord.getCustomerName() %>>
											<i class='far fa-comment-dots' style='font-size:20px;position: relative;top: -29px;left: 270px;'>
											</td>
									</tr>
									<tr>
										<td><label class="error"
											style="position: relative; right: -30px;margin-top: -30px;" id="postcodeError">Postal Code</label></td>
										<td style="height: 75px;"><input type="text"
											id="postcode" name="postcode"
											style="height: 70%; width: 115%;" size="22" value="<%=getRecord.getPostcode()%>">
											<i class='far fa-comment-dots' style='font-size:20px;position: relative;top: -31px;left: 270px;'>
											</td>
									</tr>
									<tr>
										<td><label
											style="margin-top: 30px; position: relative; right: -5px;">Add
												this project to<br> My Watchlist
										</label></td>
										<td><input type="checkbox"></td>
									</tr>
									<tr>
										<td><label style="position: relative; right: -40px;margin-top: -30px;" id="sitenameError" class="error">Site
												Name</label></td>
										<td style="height: 75px;"><input type="text"
											id="sitename" name="sitename"
											style="height: 70%; width: 115%;" size="22" onkeyup="lettersOnly(this)" value="<%=getRecord.getSitename()%>">
											<i class='far fa-comment-dots' style='font-size:20px;position: relative;top: -31px;left: 270px;' >
											</td>
									</tr>
									<tr>
										<td><label
											style="margin-top: -70px; position: relative; right: -20px;" id="leadError" class="error">Lead
												Source<br> Contextual Data
										</label></td>
										<td style="height: 170px;"><textarea
												style="width: 130%; height: 60%; margin-top: -80px;" id="lead" name="lead" class="error" ><%=getRecord.getLeadSource() %></textarea>
												<i class='far fa-comment-dots' style='font-size:20px;position: relative;top: -33px;left: 306px;'>
												</td>
									</tr>
									<tr>
										<td><label class="error"
											style="margin-top: -140px; position: relative; right: -60px;" id="locationError">Location
										</label></td>
										<td style="height: 170px;"><select
											style="height: 28%; width: 115%; margin-top: -230px;" id="location">
												<option value="select">Select</option>
												<option>Inside m25</option>
												<option>Other</option>
												<option>South East</option>
												<option>Leeds</option></select>
												<i class='far fa-comment-dots' style='font-size:20px;position: relative;top: -130px;left: 270px;'>
										</td>
									</tr>
									<tr>
										<td><label class="error"
											style="margin-top: -210px; position: relative; right: -50px;" id="enduserError">End
												User</label></td>
										<td style="height: 75px;"><input type="text" value="<%=getRecord.getEnduser()%>"
											 id="enduser" name="enduser"
											style="height: 70%; width: 115%; margin-top: -360px;"
											size="22" onkeyup="lettersOnly(this)">
											<i class='far fa-comment-dots' style='font-size:20px;position: relative;top: -195px;left: 270px;'>
											</td>
									</tr>
								</table>
							</div>
						</div>
						<div style="width: 103%; margin-top: -350px; margin-left: 40px;">
							<!--Contact Details-->
							<fieldset
								style="border: 1px solid gray; width: 90%; height: 200px;">
								<legend
									style="width: fit-content; margin-left: 20px; border-bottom: none; color: rgb(71, 143, 202); font-size: 16px; font-family: Segoe UI;">Contact
									Details</legend>
								<div style="display: flex;">
									<div style="flex: 5;">
										<table style="margin-left: 100px;">
											<tr>
												<td><label style="margin-top: -60px;" class="error" id="contactError">Contact
														Name</label></td>
												<td style="height: 75px;"><input type="text" name="contactName" value="<%=getRecord.getContactName() %>"
													style="height: 70%; margin-top: -70px; width: 100%;"
													size="25" height="32%;" id="contact" onkeyup="lettersOnly(this)"></td>
											</tr>
											<tr>
												<td><label
													style="margin-top: -70px; margin-right: -70px;" class="error"  id="phoneError">Phone
												</label></td>
												<td style="height: 75px;"><input type="text" name="phone" value="<%=getRecord.getPhone() %>"
													style="height: 70%; margin-top: -90px; width: 100%;"
													size="25" height="32%;" id="phone" onkeyup="lettersDigit(this)"></td>
											</tr>
										</table>
									</div>
									<div style="flex: 5;">
										<table>
											<tr>
												<td><label
													style="margin-top: -50px; margin-right: -20px; margin-left: 105px;" id="emailError" class="error">Email
												</label></td>
												<td style="height: 75px;"><input type="text" name="email"
													style="height: 70%; margin-top: -70px; width: 80%; margin-right: 50px; margin-left: 30px;"
													size="22" height="32%;" id="email" value="<%=getRecord.getEmail()%>"></td>
											</tr>
										</table>
									</div>
								</div>
							</fieldset>
						</div>
						<!--Contact Details Close  -->
						<div style="width: 102%; margin-bottom: 20px;">
							<div style="display: flex;">
								<div style="flex: 5">
									<fieldset
										style="border: 1px solid gray; width: 92%; height: 300px; margin-left: 20px; margin-right: 2px;">
										<legend
											style="width: fit-content; margin-left: 20px; border-bottom: none; color: rgb(71, 143, 202); font-size: 16px; font-family: Segoe UI;">Estimated</legend>
										<div style="display: flex;">
											<div style="flex: 3">
												<table>
													<tr>
														<td><label
															style="position: relative; top: -66px; left: 120px;">Start
																Date </label></td>
														<br>
														<td><label
															style="position: relative; left: -130px; position: relative; top: -30px;" class="error"> Bid
																Programme</label></td>
														<td></td>
													</tr>

													<tr>
														<td><label style="margin-top: -20px;position: relative;right: -20px;" class="error" id="projectDateError">Project
																Programme</label></td>
														<td><input type="date" name="projectProgramDate"
															style="width: 90%; height: 59%; margin-top: -20px;" id="projectDate" name="projectDate"></td>
													</tr>
													<tr>
														<td><label style="margin-top: -20px;" class="error" id="anticipatedDateError">Anticipated
																Order Date</label></td>
														<td><input type="date" name="AnticipatedDate"
															style="width: 90%; height: 59%; margin-top: -20px;" id="anticipatedDate" name="anticipatedDate"></td>
													</tr>
												</table>
											</div>
											<div style="flex: 3">
												<table>
													<tr>
														<td><label
															style="position: relative; top: -45px; left: 20px;">End
																Date</label></td>
													</tr>
													<tr>
														<td><input type="date" name="endDate"
															style="width: 90%; height: 59%; position: relative; left: 20px; top: -60px;"></td>
													</tr>
													<tr>
														<td><input type="date" name="endDate2"
															style="width: 90%; height: 59%; position: relative; left: 20px; margin-top: -10px; top: -60px;"></td>
													</tr>
												</table>
											</div>
											<div style="flex: 3">
												<table>
													<tr>
														<td><span style="position: relative; top: -45px;left: -130px;">Week
																End </span></td>
													</tr>
													<tr>
														<td><input type="text" name=""
															style="width: 60%; height: 120%; position: relative; top: 8px; padding-top: 7px; margin-left: -120px;"></td>
													</tr>
												</table>
											</div>
										</div>
									</fieldset>
								</div>
								<!-- <div style="flex: 5">
									<fieldset
										style="border: 1px solid gray; width: 92%; height: 300px; margin-left: 2px;">
										<legend
											style="width: fit-content; margin-left: 10px; border-bottom: none; color: rgb(71, 143, 202); font-size: 16px; font-family: Segoe UI;">Upload
											RTQ Documents</legend>
										<div
											style="display: flex; border: 1px solid black; width: 90%; margin-left: 30px; margin-top: 30px;">
											<div style="flex: 5;"></div>
											<div style="flex: 3;border: 1px solid black;text-align: center;">
												<span><i class="fa fa-upload" style="font-size: 36px;"></i></span>
												<label>Drop file here <br> or
												</label>
												<button
													style="border: 1px solid green; color: green; width: 90%; height: 25%;">Brows
													File</button>
											</div>
											<div style="flex: 2; border: 1px solid black;">
												<button
													style="background-color: #9585bf; width: 100%; color: white; margin-top: 40px; font-size: 12px; border: none;">
													Link to file</button>
												<button
													style="background-color: #9585bf; width: 100%; color: white; margin-top: 20px; margin-bottom: 30px; font-size: 12px; border: none;">Link
													to Browser</button>
											</div>
										</div>
									</fieldset>
								</div> -->
							</div>
						</div>
					</div>
				</div>
				<div class="oute2" id="flip3"
					style="border: 1px solid gray; size: 16px; border-bottom: none; margin-top: 1%; margin-left: 2%; margin-right: 2%; padding: 10px 0px 10px 0px; background: #e4e6e9;">
					<span class="arrow3"><span class="arrow-up3">&#x25BC;</span><span
						class="arrow-down3">&#9658;</span></span>Quote Info
				</div>
				<div id="panel3"
					style="border: 1px solid black; width: 96%; margin-left: 24px;">
						
						<div style="width: 100%;background-color: red;"><!-- quote information start here -->
								
							<div style="display: flex;margin-top: 200px;">
							<div style="flex:5">
							<table style="margin-top: -160px;margin-left: 45px;">
								<tr>
									<td> <label id="quotationError" class="error">Quotation on our Format</label></td>
									<td><select id="quotation" name="quotationName">
										<option value="select">Select</option>
										<option>Yes</option>
										<option>No</option>	
									</select></td>
								</tr>
								<tr>
									<td> <label id="projectcostError" class="error">Overall Project Cost(£)</label></td>
									<td><input type="text" name="projectCost" value="<%=getRecord.getProjectCost() %>" style="height: 34px;" id="projectcost" onkeyup="lettersDigit(this)"></td>
								</tr>
							</table>
							</div>
							<div style="flex:5">
								<table style="margin-top: -160px;margin-left: -20px;">
								<tr>
									<td> <label id="datesError" class="error">Date shown on Quote</label></td>
									<td><input type="date" name="dateShowOnQuote" style="height: 34px;" id="dates"></td>
								</tr>
								<tr>
									<td> <label id="costsError" class="error">Overall Project Sell(£)</label></td>
									<td><input type="text" name="projectSell" style="height: 34px;" id="costs" onkeyup="lettersDigit(this)" value="<%=getRecord.getProjectSell()%>"></td>
								</tr>
							</table>
							</div>
						</div>
						</div><!-- quote information end here -->				
						
					<div style="width: 100%;">
						
						<div style="display: flex;">
							<div style="flex:6;">
								<div
									style="display: flex; border: 1px solid black; width: 40%; margin-left: -20px; margin-top: 30px;margin-left: 150px;position: relative;left: -50px;">
									<div style="flex: 4;">
									</div>
									<div style="flex: 3;height: 140px;border: 1px solid black;">
										<span><i class="fa fa-upload" style="font-size: 36px"></i></span>
										<label>Drop file here <br> or
										</label>
										<button
											style="border: 1px solid green; color: green; width: 90%; height: 25%;">Brows
											File</button>
									</div>
									<div style="flex: 2; border: 1px solid black;height: 140px;">
										<button
											style="background-color: #9585bf; width: 100%; color: white; margin-top: 40px; font-size: 12px; border: none;">
											Link to file</button>
										<button
											style="background-color: #9585bf; width: 100%; color: white; margin-top: 20px; margin-bottom: 30px; font-size: 12px; border: none;">Link
											to Browser</button>
									</div>
									
								</div>	
									<div style="flex:4;width: 35%;border: 1px solid black;position: relative;top: -140px;left: 700px;">
										<div style="display: flex;">
											<div style="flex:5;height: 140px;border: 1px solid black;">
												
											</div>
											<div style="flex:5;height: 140px;border: 1px solid black;">
											
											</div>
										</div>					
								</div>
								<span style="position: relative;top: -240px;left: 160px;">Generate Quote <br>Document</span>	
							</div><!-- file upload close -->
						</div>
						
						<div style="margin-top: -50px;position: relative;top: -80px;">
							
							<div id="bidInformation">
								<div style="margin-right: 10px; margin-left: 20px;">
									<table class="table table-bordered"
										style="margin-top: -30px; font-size: 12px;" id="tblData">
										<thead>
											<tr>
												<th scope="col" width="100px" height="20px;">Cost/Code..
												</th>
												<th scope="col">Cost(£)</th>
												<th scope="col">Sell(£)</th>
												<th scope="col">Margin(£)</th>
												<th scope="col">Margin(%)</th>
												<th scope="col" colspan="2" class="act">Action</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td class='txtcode'>PPM</td>
												<td class='txtdesc'>0.00</td>
												<td class='txtprice'>0.00</td>
												<td class='txtqty'>0.00</td>
												<td class='code'>0.00</td>
												<td class="act"><i class='fas fa-pen'
													style='font-size: 16px' id="udt"></i> <i
													class="fa fa-trash" aria-hidden="true" id="del"></i></td>
											</tr>
											<tr>
												<td class='txtcode'>Call Out Works</td>
												<td class='txtdesc'>0.00</td>
												<td class='txtprice'>0.00</td>
												<td class='txtqty'>0.00</td>
												<td class='code'>0.00</td>
												<td class="act"><i class='fas fa-pen'
													style='font-size: 16px' id="udt"></i> <i
													class="fa fa-trash" aria-hidden="true" id="del"></i></td>
											</tr>
											<tr>
												<td class='txtcode'>Ad-Hoc Cover</td>
												<td class='txtdesc'>0.00</td>
												<td class='txtprice'>0.00</td>
												<td class='txtqty'>0.00</td>
												<td class='code'>0.00</td>
												<td class="act"><i class='fas fa-pen'
													style='font-size: 16px' id="udt"></i> <i
													class="fa fa-trash" aria-hidden="true" id="del"></i></td>
											</tr>
											<tr>
												<td class='txtcode'>Other</td>
												<td class='txtdesc'>0.00</td>
												<td class='txtprice'>0.00</td>
												<td class='txtqty'>0.00</td>
												<td class='code'>0.00</td>
												<td class="act"><i class='fas fa-pen'
													style='font-size: 16px' id="udt"></i> <i
													class="fa fa-trash" aria-hidden="true" id="del"></i></td>
											</tr>
											<tr>
												<td class='txtcode'>Total</td>
												<td class='txtdesc'>0.00</td>
												<td class='txtprice'>0.00</td>
												<td class='txtqty'>0.00</td>
												<td class='code'>0.00</td>
												<td class="act"><i class='fas fa-pen'
													style='font-size: 16px' id="udt"></i> <i
													class="fa fa-trash" aria-hidden="true" id="del"></i></td>
											</tr>
										</tbody>
									</table>
									<div
										style="width: 100%; background-color: #F8F9F9; margin-top: -20px;">
										<span style="padding: 5px 0px 5px 10px;"><button
												class="act" type="button"
												style="border: none; margin-top: 5px; margin-bottom: 5px; margin-right: 6px;"
												id="inforBid">
												<i class="fa fa-plus" aria-hidden="true"
													style="font-size: 15px; background-color: #a069c3; border-radius: 9px; padding: 0px 1px 0px 1px;"></i>Add
												New
											</button></span>
									</div>
								</div>
							</div>
						</div>
					 <div style="width: 100%;position: relative;top: -80px;">
						<label style="position: relative; top: 100px; left: 190px;">Bid
							Sheet</label>
						<div
							style="display: flex; border: 1px solid black; width: 50%; margin-left: 290px; margin-top: 30px;">
							<div style="flex: 5;"></div>
							<div style="flex: 2; border: 1px solid black;">
								<span style="padding-left: 40px;"><i class="fa fa-upload"
									style="font-size: 36px"></i></span> <label style="padding-left: 20px;">Drop
									file here <br> or
								</label>
								<button
									style="border: 1px solid green; color: green; width: 90%; height: 25%; margin-left: 5px;">Brows
									File</button>
							</div>
							<div style="flex: 2; border: 1px solid black;">
								<button
									style="background-color: #9585bf; width: 100%; color: white; margin-top: 40px; font-size: 12px; border: none;">
									Link to file</button>
								<button
									style="background-color: #9585bf; width: 100%; color: white; margin-top: 20px; margin-bottom: 30px; font-size: 12px; border: none;">Link
									to Browser</button>
							</div>
						</div>	
						<div style="width: 90%;">
							<table style="">
								<tr>
									<td><label style="margin-left: 20px;" id="bidInforError" class="error">Does the Bid
											Sheet meet company <br>authorisation criteria?
									</label></td>
									<td><select style="height: 32%;" id="bidInfor" name="bidInfor">
											<option value="select">Select</option>
											<option>Yes</option>
											<option>No</option>
									</select></td>
									
								</tr>
							</table>
						</div> 					
					</div> 
							
					</div>				 
				</div>
	<!-- comment history start here -->
		<div  class="toggle-bar " style="margin-right: 2%;margin-left: 2%;">
		<label class="toggle-button3 comment">&nbsp;<i class='fas fa-caret-right' style="color:#009EFF; "></i> Comment History</label>
		<div class="toggle-content3">
		<%
			/* List<OFA> clist = OFALocalServiceUtil.getOFAs(-1, -1);
			for(OFA ofa: clist) */
		%>
		
			<div class="timeline" style="border: 1px solid black;">
				
				   <%
  			    	List<smallwork> getsmallworks = smallworkLocalServiceUtil.getsmallworks(-1,-1);

  			    	System.out.println(getsmallworks.get(1).getContactName());
  					
  			    	%>
			
				<div class="timeline__component"><%=getsmallworks.get(1).getCustomerName() %></div>
				<div class="timeline__middle">
   					<div class="timeline__point"></div>
  				</div>
  			    <div class="timeline__component__right">
  			    
  			    	 <p style="font-weight: bold;">Submited On<%=getsmallworks.get(1).getAnticipatedDate()%> </p>
  			    	<p><%=getsmallworks.get(1).getLeadSource()%></p> 
  			
  			    </div>
			</div>
			<%
			%>
		</div>
		</div>
	<!--comment history close here  -->
	</div>
		</div>
		<div>
			<textarea style="width: 100%;margin-top: 30px;padding-bottom: 20px;"></textarea>
		</div>
		<div style="float: right;">
			<button class="btn btn-primary" style="padding: 10px 20px 10px 20px">Save</button>
			<button class="btn btn-warning" style="padding: 10px 20px 10px 20px">Reset</button>
			<button class="btn btn-primary" style="padding: 10px 20px 10px 20px" id="validation">Submit</button>
			<button class="btn btn-danger" style="padding: 10px 20px 10px 20px">Cancel</button>
					
		</div>
	</form> 
	</div>
</body>

<script type="text/javascript">

	$( document ).ready(function() {
		$('.toggle-content11').hide();
		$('.toggle-content12').hide();
		
	$(".arrow-downn").hide();
	$("#flipp").click(function(){
	    $('.arrow-upp,.arrow-downn').toggle();
	$("#panell").slideToggle("slow");
	});
	
		$(".arrow-down1").hide();
		$("#flip1").click(function(){
		    $('.arrow-up1,.arrow-down1').toggle();
		$("#panel1").slideToggle("slow");
		});
		
		$(".arrow-down2").hide();
		
		$("#flip2").click(function(){
		    $('.arrow-up2,.arrow-down2').toggle();
		$("#panel_Of_Project_Info").slideToggle("slow");
		});
		$(".arrow-down3").hide();
		$("#flip3").click(function(){
		    $('.arrow-up3,.arrow-down3').toggle();
		$("#panel3").slideToggle("slow");
		});
		
		
		//$('.toggle-content1').hide();
		//$('.toggle-content2').hide();
		$('.toggle-content11').hide();
		$('.toggle-content12').hide();
		
		
		$('.toggle-button1').click(function() {  
		    $('.toggle-content1').slideToggle();
		  });
		
		  $('.toggle-button2').click(function() {  
		    $('.toggle-content2').slideToggle();
		  });
		  
		  $('.toggle-button11').click(function() {  
			    $('.toggle-content11').slideToggle();
			  });
		  
		  $('.toggle-button12').click(function() {  
			    $('.toggle-content12').slideToggle();
			  });
		  
		  $('.toggle-content3').hide();
		  $('.toggle-button3').click(function() {  
		    $('.toggle-content3').slideToggle();
		  });  
		  
		  $("#calendericon").click(function(){
			  $("#datepicker-input").datepicker();
			  $("#datepicker-input").focus();
		  });
	})
	
</script>
</html>