<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<html>
<head>
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
	
<!-- 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script> -->
	 
<script src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/dropzone.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/5.9.3/dropzone.min.js" integrity="sha512-U2WE1ktpMTuRBPoCFDzomoIorbOyUv0sP8B+INA3EzNAhehbzED1rOJg6bCqPf/Tuposxb5ja/MAUnC8THSbLQ==" 
crossorigin="anonymous" referrerpolicy="no-referrer"></script>


 <link href="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/dropzone.css" rel="stylesheet"/>
<link href="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/basic.css" rel="stylesheet"/>


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
/* Drop zone API */

#parent{
		width: 1200px;
		height: 120px;
		display: flex;
		flex-direction: row;
	
	}
	#child1{
	
		flex:6;
		border: 0.5px solid grey;
	}
	#child2{
		flex:2;
		border-bottom: 0.5px solid grey;
		border-top: 0.5px solid grey;
	}
	#child3{
		flex:2;
		border: 0.5px solid grey;	
	}
	.button {
		border:1 px solid grey;
		margin-left:4px;
		margin-right:2px;
		background-color: #a069c3;
		color:white;
		width:90%;	
	}
	.button1 {
		border:1 px solid grey;
		margin-left:4px;
		margin-right:2px;
		background-color: #a069c3;
		color:white;
		width:90%;	
	}
	.file {
		
		width:100px;
  		border: 2px solid #00aeff;
 		color: #00aeff;
 		background-color: white;
  		padding: 4px 8px;
  		border-radius: 3px;
  		font-size: 20px;
  		font-weight: bold;
}
 		#parent{
		width: 500px;
		height: 150px;
		display: flex;
		flex-direction: row;
		margin-left: 30%;
		
	}
	#child1{
		flex:5;
		border: 0.5px solid grey;
	}
	#child2{
		flex:3;
		border-bottom: 0.5px solid grey;
		border-top: 0.5px solid grey;
	}
	#child3{
		flex:2;
		border: 0.5px solid grey;	
	}
	.button {
		border:1 px solid grey;
		margin-left:4px;
		margin-right:2px;
		background-color: #a069c3;
		color:white;
		width:90%;	
	}
	.button1 {
		border:1 px solid grey;
		margin-left:4px;
		margin-right:2px;
		background-color: #a069c3;
		color:white;
		width:90%;	
	}
	.file {
		
		width:100px;
  		border: 2px solid #00aeff;
 		color: #00aeff;
 		background-color: white;
  		padding: 4px 8px;
  		border-radius: 3px;
  		font-size: 20px;
  		font-weight: bold;
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
	</style>
</head>
<body>
<portlet:actionURL var="save" name="saveAction"/>
<portlet:actionURL var="save2" name="saveAction2"/>
	
	<!-- this is for update -->
	<p:renderURL var="update">
		<p:param name="name" value="vinit"></p:param>
		<p:param name="jspPage" value="/html/example1/SubmitQuote.jsp"></p:param>
	</p:renderURL> <a type="button" href="${update}"
						class="btn btn-sm btn-warning">page</a>
		
	<!-- this is for dashboard -->
	<p:renderURL var="dashboard">
		<p:param name="name" value="vv"></p:param>
		<p:param name="jspPage" value="/html/example1/DashBoard.jsp"></p:param>
	</p:renderURL> 
	<a type="button" href="${dashboard}"class="btn btn-sm btn-warning">go to  dashboard</a>
						
	<!-- end of dashboard -->	
	<p:renderURL var="example">
		<p:param name="name" value="vv"></p:param>
		<p:param name="jspPage" value="/html/example1/example.jsp"></p:param>
	</p:renderURL> 
	<a type="button" href="${example}"class="btn btn-sm btn-warning">go to example</a>
				
	<!-- prepare to quote -->
		<p:renderURL var="prepare">
		<p:param name="name" value="vv"></p:param>
		<p:param name="jspPage" value="/html/example1/PrepareQuote.jsp"></p:param>
	</p:renderURL> 
	<a type="button" href="${prepare}"class="btn btn-sm btn-warning">go to prepare </a>
		
		
	<!-- status of submited code -->
		<!-- prepare to quote -->
		<p:renderURL var="statusOfSubmit">
		<p:param name="name" value="vv"></p:param>
		<p:param name="jspPage" value="/html/example1/StatusOfSubmited.jsp"></p:param>
	</p:renderURL> 
	<a type="button" href="${statusOfSubmit}"class="btn btn-sm btn-warning">go to status of ubt quote </a>
		
	<!-- PreOrder Information -->									
	<!-- status of submited code -->
		<!-- prepare to quote -->
		<p:renderURL var="Preorder">
		<p:param name="name" value="vv"></p:param>
		<p:param name="jspPage" value="/html/example1/PreorderInformation.jsp"></p:param>
	</p:renderURL> 
	<a type="button" href="${Preorder}"class="btn btn-sm btn-warning">go to PreOrder </a>
							
		<!-- combine page -->
		<p:renderURL var="com">
		<p:param name="name" value="vv"></p:param>
		<p:param name="jspPage" value="/html/example1/CombinePage.jsp"></p:param>
	</p:renderURL> 
	<a type="button" href="${com}"class="btn btn-sm btn-warning">go to combine </a>
					
	<!-- prepare revise -->		
		<!-- combine page -->
	
		<p:renderURL var="review">
		<p:param name="name" value="vv"></p:param>
		<p:param name="jspPage" value="/html/example1/Review-0.jsp"></p:param>
	</p:renderURL> 
	<a type="button" href="${review}"class="btn btn-sm btn-warning">go to review </a>
			
			
		<p:renderURL var="Dropzone">
		<p:param name="name" value="vv"></p:param>
		<p:param name="jspPage" value="/html/example1/Dropzone.jsp"></p:param>
	</p:renderURL> 
	<a type="button" href="${Dropzone}"class="btn btn-sm btn-warning">go to Dropzone </a>
						
		
						
	<!-- First section -->
	<div class="outer" id="flip1" style="border: 1px solid gray;border-bottom: none;size: 20px;padding: 10px 0px 10px 0px; background: #e4e6e9;"><span class="arrow1"><span class="arrow-up1">&#x25BC;</span><span class="arrow-down1">&#9658;</span></span>Quote Form
	</div>

	<form id="myForm" action="${save }" method="post">
		<div id="panel1" style="border: 1px solid gray;">
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
								<table>
									<tr>
										<td><label class="error"
											style="margin-top: -10px; margin-right: -40px;"
											id="quoteError">Quote Reference Number </label></td>
										<td style="height: 75px;"><input type="text"
											name="quoteReference" style="height: 70%; width: 115%;"
											size="25" height="32%;" id="quote" readonly="readonly"></td>
										<td><label class="text-primary"
											style="margin-top: -5px; margin-left: 25px; width: 100%; background-color: #00aeff; padding: 5px 10px 5px 10px;"
											class="btn btn-primary">Generate Quote Number</label></td>
									</tr>
									<tr>
										<td><label class="error"
											style="margin-top: -45px; margin-right: -130px; position: relative; right: -25px;"
											id="projectNameError">Project Name </label></td>
										<td style="height: 75px;"><input type="text"
											name="projectName"
											style="height: 70%; margin-top: -30px; width: 115%;"
											size="25" height="32%;" id="projectName"
											onkeyup="lettersOnly(this)"><i
											class='far fa-comment-dots'
											style='font-size: 20px; position: relative; top: -35px; left: 260px;'></i></td>
									</tr>
									<tr>
										<td><label style="margin-top: -90px;"></label></td>
										<td style="height: 170px;"><textarea
												style="width: 140%; height: 60%; margin-top: -90px;"
												id="customerAddress" name="customerAddress"></textarea> <i
											class='far fa-comment-dots'
											style='font-size: 20px; position: relative; top: -35px; left: 310px;'></td>
									</tr>
									<tr>
										<td><label class="error"
											style="margin-top: -110px; margin-right: -40px;"
											id="workTypeError"> Small Work Type </label></td>
										<td style="height: 170px;"><select
											style="margin-top: -160px; height: 25%; width: 115%;"
											id="workType" name="workType">
												<option value="select">Select</option>
												<option>New Build Fitout</option>
												<option>New Build S&C</option>
												<option>Other</option>
												<option>Refit</option>
												<option>Supply Only</option>
												<option>Servey</option>
												<option>Supply and install</option>
												<option>Validation Work</option>
										</select> <i class='far fa-comment-dots'
											style='font-size: 20px; position: relative; top: -100px; left: 260px;'></td>
									</tr>
									<tr>
										<td><label
											style="margin-top: -220px; margin-right: -130px; position: relative; right: -30px;"
											id="leadSourceError"> Lead Source</label></td>
										<td style="height: 170px;"><select
											style="margin-top: -380px; height: 25%; width: 115%;"
											id="leadSource" name="leadSource">
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
										</select> <i class='far fa-comment-dots'
											style='font-size: 20px; position: relative; top: -205px; left: 260px;'></td>
									</tr>
									<tr>
										<td><label style="margin-top: -270px;"> </label></td>
										<td style="height: 170px;"><select
											style="margin-top: -500px; height: 25%; width: 115%;"
											id="productSpecific" name="productSpecific">
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
										</select> <i class='far fa-comment-dots'
											style='font-size: 20px; position: relative; top: -270px; left: 260px;'></td>
									</tr>
									<tr>
										<td><label class="error"
											style="margin-top: -390px; margin-right: 0px; position: relative; right: -20px; font-size: 14px;"
											id="descriptionError">Description of Works </label></td>
										<td style="height: 170px;"><textarea
												style="width: 160%; height: 60%; margin-top: -680px;"
												id="description" name="description"></textarea></td>
									</tr>
								</table>
								<label style="position: relative; top: -830px; right: -10px;"
									id="customerAddressError" class="error">Customer
									Address</label> <label
									style="position: relative; top: -550px; right: -10px;"
									id="productSpecificError" class="error">Product
									Specified</label>
							</div>
							<div id="section1_child2" style="flex: 5;">
								<table>
									<tr></tr>
									<tr>
										<td><label class="error"
											style="margin-top: 30px; position: relative; right: -40px;"
											id="customerNameError">Customer</label></td>
										<td style="height: 75px; margin-top: 30px;"><input
											type="text" id="customerName" name="customerName"
											style="height: 30%; width: 115%; margin-top: 60px;" size="22"
											onkeyup="lettersOnly(this)"> <i
											class='far fa-comment-dots'
											style='font-size: 20px; position: relative; top: -29px; left: 270px;'></td>
									</tr>
									<tr>
										<td><label class="error"
											style="position: relative; right: -30px; margin-top: -30px;"
											id="postcodeError">Postal Code</label></td>
										<td style="height: 75px;"><input type="text"
											id="postcode" name="postcode"
											style="height: 70%; width: 115%;" size="22"> <i
											class='far fa-comment-dots'
											style='font-size: 20px; position: relative; top: -31px; left: 270px;'></td>
									</tr>
									<tr>
										<td><label
											style="margin-top: 30px; position: relative; right: -5px;">Add
												this project to<br> My Watchlist
										</label></td>
										<td><input type="checkbox"></td>
									</tr>
									<tr>
										<td><label
											style="position: relative; right: -40px; margin-top: -30px;"
											id="sitenameError" class="error">Site Name</label></td>
										<td style="height: 75px;"><input type="text"
											id="sitename" name="sitename"
											style="height: 70%; width: 115%;" size="22"
											onkeyup="lettersOnly(this)"> <i
											class='far fa-comment-dots'
											style='font-size: 20px; position: relative; top: -31px; left: 270px;'></td>
									</tr>
									<tr>
										<td><label
											style="margin-top: -70px; position: relative; right: -20px;"
											id="leadError" class="error">Lead Source<br>
												Contextual Data
										</label></td>
										<td style="height: 170px;"><textarea
												style="width: 130%; height: 60%; margin-top: -80px;"
												id="lead" name="lead" class="error"></textarea> <i
											class='far fa-comment-dots'
											style='font-size: 20px; position: relative; top: -33px; left: 306px;'></td>
									</tr>
									<tr>
										<td><label class="error"
											style="margin-top: -140px; position: relative; right: -60px;"
											id="locationError">Location </label></td>
										<td style="height: 170px;"><select
											style="height: 28%; width: 115%; margin-top: -230px;"
											id="location" name="location">
												<option value="select">Select</option>
												<option>Inside m25</option>
												<option>Other</option>
												<option>South East</option>
												<option>Leeds</option>
										</select> <i class='far fa-comment-dots'
											style='font-size: 20px; position: relative; top: -130px; left: 270px;'></td>
									</tr>
									<tr>
										<td><label class="error"
											style="margin-top: -210px; position: relative; right: -50px;"
											id="enduserError">End User</label></td>
										<td style="height: 75px;"><input type="text" id="enduser"
											name="enduser"
											style="height: 70%; width: 115%; margin-top: -360px;"
											size="22" onkeyup="lettersOnly(this)"> <i
											class='far fa-comment-dots'
											style='font-size: 20px; position: relative; top: -195px; left: 270px;'></td>
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
												<td><label style="margin-top: -60px;" class="error"
													id="contactError">Contact Name</label></td>
												<td style="height: 75px;"><input type="text"
													name="contactName"
													style="height: 70%; margin-top: -70px; width: 100%;"
													size="25" height="32%;" id="contact"
													onkeyup="lettersOnly(this)"></td>
											</tr>
											<tr>
												<td><label
													style="margin-top: -70px; margin-right: -70px;"
													class="error" id="phoneError">Phone </label></td>
												<td style="height: 75px;"><input type="text"
													name="phone"
													style="height: 70%; margin-top: -90px; width: 100%;"
													size="25" height="32%;" id="phone"
													onkeyup="lettersDigit(this)"></td>
											</tr>
										</table>
									</div>
									<div style="flex: 5;">
										<table>
											<tr>
												<td><label
													style="margin-top: -50px; margin-right: -20px; margin-left: 105px;"
													id="emailError" class="error">Email </label></td>
												<td style="height: 75px;"><input type="text"
													name="email"
													style="height: 70%; margin-top: -70px; width: 80%; margin-right: 50px; margin-left: 30px;"
													size="22" height="32%;" id="email"></td>
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
															style="position: relative; left: -100px; position: relative; top: -30px;"
															class="error"> Bid Programme</label></td>
														<td></td>
													</tr>

													<tr>
														<td><label style="margin-top: -20px;" class="error"
															id="projectDateError">Project Programme</label></td>
														<td><input type="text"
															style="width: 90%; height: 59%; margin-top: -20px;"
															id="projectDate" name="projectDate"> <span
															id="calendericon-pped"
															style="padding-left: 128px; position: relative; top: -35px;">&#128197;</span>
														</td>
													</tr>
													<tr>
														<td><label style="margin-top: -20px;" class="error"
															id="anticipatedDateError">Anticipated Order Date</label></td>
														<td><input type="text" name="anticipatedDate"
															style="width: 90%; height: 59%; margin-top: -20px;"
															id="anticipatedDate"> <span
															id="calendericon-pped2"
															style="padding-left: 128px; position: relative; top: -35px;">&#128197;</span>
														</td>
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
														<td><input type="text" name="endDate"
															style="width: 80%; height: 59%; position: relative; left: 20px; top: -60px;"
															id="endDate"> <span id="calendericon-pped3"
															style="padding-left: 150px; position: relative; top: -94px; left: 10px;">&#128197;</span>
														</td>
													</tr>
													<tr>
														<td><input type="text" name="endDate2"
															style="width: 80%; height: 59%; position: relative; left: 20px; margin-top: -10px; top: -60px;"
															id="endDate2"> <span id="calendericon-pped4"
															style="padding-left: 150px; position: relative; top: -94px; left: 10px;">&#128197;</span>

														</td>
													</tr>
												</table>
											</div>
											<div style="flex: 3">
												<table>
													<tr>
														<td><span style="position: relative; top: -45px;">Week
																End </span></td>
													</tr>
													<tr>
														<td><input type="text" name=""
															style="width: 60%; height: 120%; position: relative; top: 8px; padding-top: 7px; margin-left: 5px;"></td>
													</tr>
												</table>
											</div>
										</div>
									</fieldset>
								</div>
								<div style="flex: 5">
									<fieldset
										style="border: 1px solid gray; width: 92%; height: 300px; margin-left: 2px;">
										<legend
											style="width: fit-content; margin-left: 10px; border-bottom: none; color: rgb(71, 143, 202); font-size: 16px; font-family: Segoe UI;">Upload
											RTQ Documents</legend>
										
										<div class="upload-container" id="owb1">
											<div id="parent"
												style="margin-right: 20%; margin-left: 20px; width: 550px;">

												<div id="child1">
													<table style="margin-top: 10px; margin-left: 10px;">
														<tr id="preview1">
															<td><span></span>
															<td>
														</tr>
													</table>
												</div>

												<div class="mydropzone1" id="child2">
													<svg style="margin-left: 70px; margin-top: 20px"
														xmlns="http://www.w3.org/2000/svg" width="28" height="28"
														fill="currentColor" class="bi bi-cloud-arrow-up"
														viewBox="0 0 16 16">
 				 <path fill-rule="evenodd"
															d="M7.646 5.146a.5.5 0 0 1 .708 0l2 2a.5.5 0 0 1-.708.708L8.5 6.707V10.5a.5.5 0 0 1-1 0V6.707L6.354 7.854a.5.5 0 1 1-.708-.708l2-2z" />
  				 <path
															d="M4.406 3.342A5.53 5.53 0 0 1 8 2c2.69 0 4.923 2 5.166 4.579C14.758 6.804 16 8.137 16 9.773 16 11.569 14.502 13 12.687 13H3.781C1.708 13 0 11.366 0 9.318c0-1.763 1.266-3.223 2.942-3.593.143-.863.698-1.723 1.464-2.383zm.653.757c-.757.653-1.153 1.44-1.153 2.056v.448l-.445.049C2.064 6.805 1 7.952 1 9.318 1 10.785 2.23 12 3.781 12h8.906C13.98 12 15 10.988 15 9.773c0-1.216-1.02-2.228-2.313-2.228h-.5v-.5C12.188 4.825 10.328 3 8 3a4.53 4.53 0 0 0-2.941 1.1z" />
		</svg>
													<p style="margin-left: 30px; margin-top: 0px;">
														Drop Files Here <span style="margin-left: 45px;">or</span>

													</p>
													<button class="file mydropzone" type="button"
														style="margin-left: 25px; margin-top: -1px; width: 70%;">BrowseFiles</button>
												</div>
												<div id="child3">
													<br> <br>
													<button type="button" class="button1"
														style="margin-left: 5px;">LinkToFile</button>
													<br>
													<button type="button" class="button"
														style="margin-left: 5px; margin-top: 5px;">LinkToDropbox</button>
												</div>
												<input type="hidden" name='<portlet:namespace/>owb'
													id="files1">
											</div>
											<div></div>
										</div>
									</fieldset>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="oute2" id="flip3"
					style="border: 1px solid gray; size: 16px; border-bottom: none; margin-top: 1%; margin-left: 2%; margin-right: 2%; padding: 10px 0px 10px 0px; background: #e4e6e9;">
					<span class="arrow3"><span class="arrow-up3">&#x25BC;</span><span
						class="arrow-down3">&#9658;</span></span>Project Info
				</div>
				<div id="panel3" style="border: 1px; width: 96%; margin-left: 24px;">

					<div style="width: 100%;">
						<label style="position: relative; top: 100px; left: 190px;">Bid
							Sheet</label>

						<div class="upload-container" id="owb1">
							<div id="parent" style="margin-left: 20%; width: 600px;">

								<div id="child1">
									<table style="margin-top: 10px; margin-left: 10px;">
										<tr id="preview2">
											<td><span></span>
											<td>
										</tr>
									</table>
								</div>
								<div class="mydropzone2" id="child2">
									<svg style="margin-left: 50px; margin-top: 20px"
										xmlns="http://www.w3.org/2000/svg" width="28" height="28"
										fill="currentColor" class="bi bi-cloud-arrow-up"
										viewBox="0 0 16 16">
 				 <path fill-rule="evenodd"
											d="M7.646 5.146a.5.5 0 0 1 .708 0l2 2a.5.5 0 0 1-.708.708L8.5 6.707V10.5a.5.5 0 0 1-1 0V6.707L6.354 7.854a.5.5 0 1 1-.708-.708l2-2z" />
  				 <path
											d="M4.406 3.342A5.53 5.53 0 0 1 8 2c2.69 0 4.923 2 5.166 4.579C14.758 6.804 16 8.137 16 9.773 16 11.569 14.502 13 12.687 13H3.781C1.708 13 0 11.366 0 9.318c0-1.763 1.266-3.223 2.942-3.593.143-.863.698-1.723 1.464-2.383zm.653.757c-.757.653-1.153 1.44-1.153 2.056v.448l-.445.049C2.064 6.805 1 7.952 1 9.318 1 10.785 2.23 12 3.781 12h8.906C13.98 12 15 10.988 15 9.773c0-1.216-1.02-2.228-2.313-2.228h-.5v-.5C12.188 4.825 10.328 3 8 3a4.53 4.53 0 0 0-2.941 1.1z" />
		</svg>
									<p style="margin-left: 30px;">
										Drop Files Here <span style="margin-left: 45px;">or</span>

									</p>
									<button class="file mydropzone" type="button"
										style="margin-left: 26px; margin-top: -1px; width: 70%;">BrowseFiles</button>
								</div>
								<div id="child3">
									<br> <br>
									<button type="button" class="button1" style="margin-left: 5px;">LinkToFile</button>
									<br>
									<button type="button" class="button"
										style="margin-left: 5px; margin-top: 5px;">LinkToDropbox</button>
								</div>
								<input type="hidden" name='<portlet:namespace/>owb' id="files2">
							</div>
							<div></div>
						</div>


					</div>
					<!--  file upload section completed-->
					<div style="width: 90%;">
						<table style="">
							<tr>
								<td><label style="margin-left: 20px;" id="bidInforError"
									class="error">Does the Bid Sheet meet company <br>authorisation
										criteria?
								</label></td>
								<td><select style="height: 32%;" id="bidInfor"
									name="bidInfor">
										<option value="select">Select</option>
										<option>Yes</option>
										<option>No</option>
								</select></td>
								<td><label style="margin-left: 30px;" class="error">Populate
										Bid Information <br>from Bid Sheet
								</label></td>
								<td><input type="checkbox"></td>
							</tr>
						</table>
					</div>
					<div style="margin-top: 30px;">
						<!-- Bid sheet section start here -->
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
												style='font-size: 16px' id="udt"></i> <i class="fa fa-trash"
												aria-hidden="true" id="del"></i></td>
										</tr>
										<tr>
											<td class='txtcode'>Call Out Works</td>
											<td class='txtdesc'>0.00</td>
											<td class='txtprice'>0.00</td>
											<td class='txtqty'>0.00</td>
											<td class='code'>0.00</td>
											<td class="act"><i class='fas fa-pen'
												style='font-size: 16px' id="udt"></i> <i class="fa fa-trash"
												aria-hidden="true" id="del"></i></td>
										</tr>
										<tr>
											<td class='txtcode'>Ad-Hoc Cover</td>
											<td class='txtdesc'>0.00</td>
											<td class='txtprice'>0.00</td>
											<td class='txtqty'>0.00</td>
											<td class='code'>0.00</td>
											<td class="act"><i class='fas fa-pen'
												style='font-size: 16px' id="udt"></i> <i class="fa fa-trash"
												aria-hidden="true" id="del"></i></td>
										</tr>
										<tr>
											<td class='txtcode'>Other</td>
											<td class='txtdesc'>0.00</td>
											<td class='txtprice'>0.00</td>
											<td class='txtqty'>0.00</td>
											<td class='code'>0.00</td>
											<td class="act"><i class='fas fa-pen'
												style='font-size: 16px' id="udt"></i> <i class="fa fa-trash"
												aria-hidden="true" id="del"></i></td>
										</tr>
										<tr>
											<td class='txtcode'>Total</td>
											<td class='txtdesc'>0.00</td>
											<td class='txtprice'>0.00</td>
											<td class='txtqty'>0.00</td>
											<td class='code'>0.00</td>
											<td class="act"><i class='fas fa-pen'
												style='font-size: 16px' id="udt"></i> <i class="fa fa-trash"
												aria-hidden="true" id="del"></i></td>
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
					<!-- Bid sheet section close here -->
				</div>

				<div
					style="width: 100%; margin-bottom: 180px; margin-left: 230px; margin-top: 20px;">
					<div class="upload-container" id="owb1">
					<label style="position: relative;top: 70px;left: -120px;">Quote Document *</label>
						<div id="parent"
							style="margin-right: 20%; margin-left: 20px; width: 550px;">
												
							<div id="child1">
								<table style="margin-top: 10px; margin-left: 10px;">
									<tr id="preview3">
										<td><span></span>
										<td>
									</tr>
								</table>
							</div>

							<div class="mydropzone3" id="child2">
								<svg style="margin-left: 70px; margin-top: 20px"
									xmlns="http://www.w3.org/2000/svg" width="28" height="28"
									fill="currentColor" class="bi bi-cloud-arrow-up"
									viewBox="0 0 16 16">
 				 <path fill-rule="evenodd"
										d="M7.646 5.146a.5.5 0 0 1 .708 0l2 2a.5.5 0 0 1-.708.708L8.5 6.707V10.5a.5.5 0 0 1-1 0V6.707L6.354 7.854a.5.5 0 1 1-.708-.708l2-2z" />
  				 <path
										d="M4.406 3.342A5.53 5.53 0 0 1 8 2c2.69 0 4.923 2 5.166 4.579C14.758 6.804 16 8.137 16 9.773 16 11.569 14.502 13 12.687 13H3.781C1.708 13 0 11.366 0 9.318c0-1.763 1.266-3.223 2.942-3.593.143-.863.698-1.723 1.464-2.383zm.653.757c-.757.653-1.153 1.44-1.153 2.056v.448l-.445.049C2.064 6.805 1 7.952 1 9.318 1 10.785 2.23 12 3.781 12h8.906C13.98 12 15 10.988 15 9.773c0-1.216-1.02-2.228-2.313-2.228h-.5v-.5C12.188 4.825 10.328 3 8 3a4.53 4.53 0 0 0-2.941 1.1z" />
		</svg>
								<p style="margin-left: 30px; margin-top: 0px;">
									Drop Files Here <span style="margin-left: 45px;">or</span>

								</p>
								<button class="file mydropzone" type="button"
									style="margin-left: 25px; margin-top: -1px; width: 70%;">BrowseFiles</button>
							</div>
							<div id="child3">
								<br> <br>
								<button type="button" class="button1" style="margin-left: 5px;">LinkToFile</button>
								<br>
								<button type="button" class="button"
									style="margin-left: 5px; margin-top: 5px;">LinkToDropbox</button>
							</div>
							<input type="hidden" name='<portlet:namespace/>owb' id="files3">
						</div>
						<div></div>
					</div>
				</div>
			</div>
			<!--  -->
			<div style="display: flex;">
				<div style="flex: 5">
					<table style="margin-top: -160px; margin-left: 45px;">
						<tr>
							<td><label id="quotationError" class="error">Quotation
									on our Format</label></td>
							<td><select id="quotation" name="quotationName">
									<option value="select">Select</option>
									<option>Yes</option>
									<option>No</option>
							</select></td>
						</tr>
						<tr>
							<td><label id="projectcostError" class="error">Overall
									Project Cost(£)</label></td>
							<td><input type="text" name="projectCost"
								style="height: 34px;" id="projectcost"
								onkeyup="lettersDigit(this)"></td>
						</tr>
					</table>
				</div>
				<div style="flex: 5">
					<table style="margin-top: -160px; margin-left: -20px;">
						<tr>
							<td><label id="datesError" class="error">Date shown
									on Quote</label></td>
							<td><input type="date" name="dateShowOnQuote"
								style="height: 34px;" id="dates"></td>
						</tr>
						<tr>
							<td><label id="costsError" class="error">Overall
									Project Sell(£)</label></td>
							<td><input type="text" name="projectSell"
								style="height: 34px;" id="costs" onkeyup="lettersDigit(this)"></td>
						</tr>
					</table>
				</div>
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
	<!-- Jquery is start -->
	
	<script type="text/javascript">
	
	  $("#calendericon-pped").click(function(){
		  $("#projectDate").datepicker({dateFormat: 'dd/mm/yy',numberOfMonths: 3, showCurrentAtPos:0,minDate:$("#inp1").val(),maxDate:$("#inp4").val()});
		  $("#projectDate").focus();
	  });
	 $("#calendericon-pped2").click(function(){
		  $("#anticipatedDate").datepicker({dateFormat: 'dd/mm/yy',numberOfMonths: 3, showCurrentAtPos:0,minDate:$("#inp1").val(),maxDate:$("#inp4").val()});
		  $("#anticipatedDate").focus();
	  });
	 $("#calendericon-pped3").click(function(){
		  $("#endDate").datepicker({dateFormat: 'dd/mm/yy',numberOfMonths: 3, showCurrentAtPos:0,minDate:$("#inp1").val(),maxDate:$("#inp4").val()});
		  $("#endDate").focus();
	  });
	 $("#calendericon-pped4").click(function(){
		 
		  $("#endDate2").datepicker({dateFormat: 'dd/mm/yy',numberOfMonths: 3, showCurrentAtPos:0,minDate:$("#inp1").val(),maxDate:$("#inp4").val()});
		  $("#endDate2").focus();
	  }); 
	
	 
	/*anticipatedDate  */
	$( document ).ready(function() {
		
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
	/* Drop zone API */
	
		     var mydz1= new Dropzone(".mydropzone1",{
		    	url: "/Dropzone",
		        maxFilesize: 10,
		        addRemoveLinks: true,
		        paramName: "file",	
		        maxFiles: 5,
		        autoProcessQueue: false,
		            
		    });
		   
		     mydz1.on("addedfile", function(file) {
		    	 
		    	   this.removeFile(file);
		    	  mydz1.createThumbnail(file,null,120,120);

		    	  $("#files1").val(file.name);
		    	   
		    	  document.querySelector("#preview1").innerHTML =  file.name + "  " + file.size + " bytes";
		    	  
		    	}); 
		     var mydz2= new Dropzone(".mydropzone2",{
			    	url: "/Dropzone",
			        maxFilesize: 10,
			        addRemoveLinks: true,
			        paramName: "file",	
			        maxFiles: 5,
			        autoProcessQueue: false,
			            
			    });
			   
			     mydz2.on("addedfile", function(file) {
			    	 
			    	   this.removeFile(file);
			    	  mydz1.createThumbnail(file,null,120,120);

			    	  $("#files2").val(file.name);
			    	   
			    	  document.querySelector("#preview2").innerHTML =  file.name + "  " + file.size + " bytes";
			    	  
			    	}); 
			     var mydz3= new Dropzone(".mydropzone3",{
				    	url: "/Dropzone",
				        maxFilesize: 10,
				        addRemoveLinks: true,
				        paramName: "file",	
				        maxFiles: 5,
				        autoProcessQueue: false,
				            
				    });
				   
				     mydz3.on("addedfile", function(file) {
				    	 
				    	   this.removeFile(file);
				    	  mydz1.createThumbnail(file,null,120,120);

				    	  $("#files3").val(file.name);
				    	   
				    	  document.querySelector("#preview3").innerHTML =  file.name + "  " + file.size + " bytes";
				    	  
				    	}); 
		     
	
	/* Generate Number function star here */
	 function generateChar1(len){
		var digits='0123456789';
		var chars='ABCDEFGHIJKLMNOPQRSTUVWXYZ';
		let char1='';
			for(i=0;i<len;i++){
			    	char1+=chars[Math.floor(Math.random()*10)];
			}
			 return char1;
			 }
			    		//Generate Quote reference number
			 function  generate() {
			    	var str="PW"+(Math.floor(Math.random() * 100) + 1000)+"-"+generateChar1(1);
			    			
			    console.log(str);
			    return str;
         }		
		
	/* Generate number function close here */
	
	
	$("#validation").click(function(){
		var quote=$("#quote").val();
		var projectName=$("#projectName").val();
		var customerAddress=$("#customerAddress").val();
		var workType=$("#workType").val();
		var leadSource=$("#leadSource").val();
		var productSpecific=$("#productSpecific").val();
		var description=$("#description").val();
		
		var customerName=$("#customerName").val();
		var postcode=$("#postcode").val();
		var sitename=$("#sitename").val();
		var lead=$("#lead").val();
		var location=$("#location").val();
		var enduser=$("#enduser").val();
		
		var contact=$("#contact").val();
		var phone=$("#phone").val();
		var email=$("#email").val();
		
		var bidInfor=$("#bidInfor").val();
		
		var quotation=$("#quotation").val();
		var projectcost=$("#projectcost").val();
		
		var dates=$("#dates").val();
		var costs=$("#costs").val();
		
		/*projectDateError  anticipatedDate  */
		var projectDate=$("#projectDate").val();
		var anticipatedDate=$("#anticipatedDate").val();
		
		var found=true;
		
		if(projectName=="")
		{
			document.getElementById("projectName").style.border="1px solid red";
			document.getElementById("projectNameError").style.color=" red";
			found=false;
		}	
		else{
			document.getElementById("projectName").style.border="1px solid black";
			document.getElementById("projectNameError").style.color="black";
			
		}
		if(customerAddress=="")
		{
			document.getElementById("customerAddress").style.border="1px solid red";
			document.getElementById("customerAddressError").style.color=" red";
			found=false;customerAddress
		}
		else{
			document.getElementById("customerAddress").style.border="1px solid black";
			document.getElementById("customerAddressError").style.color=" black";
		}
		if(workType=="select")
		{
			document.getElementById("workType").style.border="1px solid red";
			document.getElementById("workTypeError").style.color=" red";
			found=false;
		}
		else{
			document.getElementById("workType").style.border="1px solid black";
			document.getElementById("workTypeError").style.color=" black";
		}
		if(leadSource=="select")
		{
			document.getElementById("leadSource").style.border="1px solid red";
			document.getElementById("leadSourceError").style.color=" red";
			found=false;
		}	
		else{
			document.getElementById("leadSource").style.border="1px solid black";
			document.getElementById("leadSourceError").style.color=" black";
		}
		if(productSpecific=="select")
		{
			document.getElementById("productSpecific").style.border="1px solid red";
			document.getElementById("productSpecificError").style.color="red";
			found=false;
		}	
		else{
			document.getElementById("productSpecific").style.border="1px solid black";
			document.getElementById("productSpecificError").style.color="black";
		
		}
		if(description=="")
		{
			document.getElementById("description").style.border="1px solid red";
			document.getElementById("descriptionError").style.color="red";
		}	
		else{
			document.getElementById("description").style.border="1px solid black";
			document.getElementById("descriptionError").style.color="black";
		}
		if(customerName=="")
		{
			document.getElementById("customerName").style.border="1px solid red";
			document.getElementById("customerNameError").style.color="red";
			found=false;
		}	
		else{
			document.getElementById("customerName").style.border="1px solid black";
			document.getElementById("customerNameError").style.color="black";
		}
		if(postcode=="")
		{	
			document.getElementById("postcode").style.border="1px solid red";
			document.getElementById("postcodeError").style.color="red";
			found=false;
		}	
		else{
			
			document.getElementById("postcode").style.border="1px solid black";
			document.getElementById("postcodeError").style.color="black";
		}
		if(sitename=="")
		{
			document.getElementById("sitename").style.border="1px solid red";
			document.getElementById("sitenameError").style.color="red";
			found=false;			
		}
		else{

			document.getElementById("sitename").style.border="1px solid black";
			document.getElementById("sitenameError").style.color="black";
		}
		if(lead=="")
		{
			document.getElementById("lead").style.border="1px solid red";
			document.getElementById("leadError").style.color="red";
			found=false;
		}
		else{
			document.getElementById("lead").style.border="1px solid black";
			document.getElementById("leadError").style.color="black";
		}
		if(location=="select")
		{
			document.getElementById("location").style.border="1px solid red";
			document.getElementById("locationError").style.color="red";
			found=false;
		}
		else{
			document.getElementById("location").style.border="1px solid black";
			document.getElementById("locationError").style.color="black";
		}
		if(enduser=="")
		{
			document.getElementById("enduser").style.border="1px solid red";
			document.getElementById("enduserError").style.color="red";
			found=false;
		}
		else{
			document.getElementById("enduser").style.border="1px solid black";
			document.getElementById("enduserError").style.color="black";
		}
	 	if(contact=="")
		{
			document.getElementById("contact").style.border="1px solid red";
			document.getElementById("contactError").style.color="red";
			found=false;
		}	
		else{
			document.getElementById("contact").style.border="1px solid black";
			document.getElementById("contactError").style.color="black";
		}
	 	 if(phone=="")
		{
			document.getElementById("phone").style.border="1px solid red";
			document.getElementById("phoneError").style.color="red";
			
			found=false;
		}
		else{
			 document.getElementById("phone").style.border="1px solid black";
			 document.getElementById("phoneError").style.color="black";	
			 var leng=phone.length;
				
			if(leng!=10)
			{
				document.getElementById("phone").style.border="1px solid red";
				document.getElementById("phoneError").style.color="red";
				found=false;
			}	
			 
		}  
 		if(email=="")
		{
			document.getElementById("email").style.border="1px solid red";
			document.getElementById("emailError").style.color="red";
			
			found=false;
		}	
		else{
			document.getElementById("email").style.border="1px solid black";
			document.getElementById("emailError").style.color="black";
			
		}  
 		if(bidInfor=="select")
 		{
 			document.getElementById("bidInfor").style.border="1px solid red";
 			document.getElementById("bidInforError").style.color="red";
 			found=false;
 		}	
 		else{
 			document.getElementById("bidInfor").style.border="1px solid black";
 			document.getElementById("bidInforError").style.color="black";
 		}
 		if(quotation=="select")
 		{
 			document.getElementById("quotation").style.border="1px solid red";
 			document.getElementById("quotationError").style.color="red";
 			found=false;
 		}	
 		else{
 			document.getElementById("quotation").style.border="1px solid black";
 			document.getElementById("quotationError").style.color="black";
			
 		}
 		if(projectcost=="")
 		{
 			document.getElementById("projectcost").style.border="1px solid red";
 			document.getElementById("projectcostError").style.color="red";
 			found=false;
 		}	
 		else{

 			document.getElementById("projectcost").style.border="1px solid black";
 			document.getElementById("projectcostError").style.color="black";
 		}
 		if(dates=="")
 		{
 			document.getElementById("dates").style.border="1px solid red";
 			document.getElementById("datesError").style.color="red";
 			found=false;
 		}	
 		else{
 			document.getElementById("dates").style.border="1px solid black";
 			document.getElementById("datesError").style.color="black";
 			
 		}
 		if(costs=="")
 		{
 			document.getElementById("costs").style.border="1px solid red";
 			document.getElementById("costsError").style.color="red";
 			found=false;
 		}	
 		else{
 			document.getElementById("costs").style.border="1px solid black";
 			document.getElementById("costsError").style.color="black";
 		}
 		if(projectDate=="")
 		{
 			document.getElementById("projectDate").style.border="1px solid red";
 			document.getElementById("projectDateError").style.color="red";
 			found=false;
 		}	
 		else{
 			document.getElementById("projectDate").style.border="1px solid black";
 			document.getElementById("projectDateError").style.color="black";			
 		}
 		if(anticipatedDate=="")
 		{
 			document.getElementById("anticipatedDate").style.border="1px solid red";
 			document.getElementById("anticipatedDateError").style.color="red";
 			found=false;
 		}	
 		else{
 			document.getElementById("anticipatedDate").style.border="1px solid black";
 			document.getElementById("anticipatedDateError").style.color="black";
 		}
 		
 		if(found!=true)
 		{
 			alert("Please fix the error");
						
 			found=false;
 		}	
 		else{
 			var gen=generate();
			document.getElementById("quote").value=gen; 
 		}	
 		return found;
	});
	});
	</script>
	
	 <script>
     function lettersDigit(input) {
         var regex = /[^0-9]/gi;
         input.value = input.value.replace(regex, "");
     }
     function lettersOnly(input) {
         var regex = /[^a-z]/gi;
         input.value = input.value.replace(regex, "");
     }
     </script>
</body>
</html>