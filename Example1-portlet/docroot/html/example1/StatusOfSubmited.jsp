
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.*" %>    
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>   
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="p"%>
<%@page import="com.test.model.smallwork" %>    
<%@page import="com.test.service.smallworkLocalServiceUtil" %>
<%@page import="com.test.dao.*" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="p"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<html>
<head>
<title>Welcome To Econsys</title>
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
  
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/dropzone.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/5.9.3/dropzone.min.js" integrity="sha512-U2WE1ktpMTuRBPoCFDzomoIorbOyUv0sP8B+INA3EzNAhehbzED1rOJg6bCqPf/Tuposxb5ja/MAUnC8THSbLQ==" 
crossorigin="anonymous" referrerpolicy="no-referrer"></script>

<link href="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/dropzone.css" rel="stylesheet"/>
<link href="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/basic.css" rel="stylesheet"/>

 <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script> 
 <script src=" https://cdnjs.cloudflare.com/ajax/libs/datejs/1.0/date.min.js "></script>
   <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
 
 <style>
 	/* dropzone */
		#parent{
		width: 800px;
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
flex-container{
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
.toggle-button11{
	width: 98%;
	margin-left: 10px;
}
.toggle-button12{
	width: 98%;
	margin-left: 10px;
}
input{
	
	height: 30px;
}
 </style>
 
</head>
<body>


<portlet:actionURL var="insertdata" name="stausOfSubmitedQuote"></portlet:actionURL>
<portlet:defineObjects />

	<div  class="toggle-bar-quote-form ">
	<label class="toggle-button1 comment">&nbsp;<i class='fas fa-caret-right' style="color:#009EFF; "></i>Status Of Submitted Quote</label>
		<div class="toggle-content1">


	<%
		int id=(Integer)ParamUtil.getInteger(request,"currentId");
		smallwork getRecord = smallworkLocalServiceUtil.getsmallwork(id);
		
	%>

	<form action="${insertdata }" method="post">
	<div class="container">
	<div class="flex-container"  >
		<input type="hidden" name="cid" >
		<label id="lsosq" style="position: relative;left: 200px;">Status Of Submitted Quote <span style="color:red;font-weight:bold">*</span></label>&nbsp;
		<div class="right-item" style="position: relative;left: 400px;top: -50px;">
		<input type="hidden" name="currentId" value="<%=id%>">
		<select class="border" id="sosq" onchange="settext()" name='<portlet:namespace/>Status_Of_Submitted_Quote' required="required">
					<option value="">Select</option>
					<option >Customer Commitment Received</option>
					<option >Amend Bid</option>
					<option >Withdrawn</option>
					<option >Lost</option>
					<option>Update</option>
		 </select>
		 <span id="sosqerror"></span>
		 </div>
	</div>

		<div class="flex-container" id="preorder">
		<label id="lpreorder" style="position: relative;top: -50px;left: 230px;">Pre-Order Information</label>&nbsp;
		<div class="right-item " >
		 	<span id="modalbtn" style="background-color: #a069c3; color: white; font-weight: bold;position: relative;top: -100px;left: 400px;">+</span> 
		 </div>
		</div>
		<div class="update">
			<table style="margin-left:25%;">
			<tr>
				<td><label id="lwinp" style="text-align: right;">Win Probability<span style="color:red;font-weight:bold">*</span></label>&nbsp;</td>
				<td><input type="text" name='<portlet:namespace/>winp' id="winp" style="height: 30px;">&nbsp;%</td>
			</tr>
			</table>
			<table style="margin-left:62%; margin-top: -100px;">
			<tr>
		 	<td></td>
		 	<td ><label id="laod" >Anticipated Order Date<span style="color:red;font-weight:bold">*</span></label></td>
		 	<td><input class="aod" readonly="readonly" id="datepicker-input-aod" type="text" name='<portlet:namespace/>aoddate'><span id="calendericon-aod">&#128197;</span></td>
		 	</tr>
		 	<tr>
		 		<td></td>
		 		<td ><label id="lppsd" >Project Program Start Date<span style="color:red;font-weight:bold">*</span></label></td>
		 		<td><input class="ppsd" readonly="readonly" id="datepicker-input-ppsd" type="text" name='<portlet:namespace/>ppsddate'><span id="calendericon-ppsd">&#128197;</span></td>
		 	</tr>
		 	<tr>
		 		<td></td>
		 		<td ><label id="lpped" >Project Program End Date<span style="color:red;font-weight:bold">*</span></label></td>
		 		<td><input class="pped" readonly="readonly" id="datepicker-input-pped" type="text" name='<portlet:namespace/>ppeddate'><span id="calendericon-pped">&#128197;</span></td>
		 	</tr>
		 	</table>
		</div>
	<div class="flex-container" id="cct1">
		<input type="hidden" name="cid" >
		<label id="lcct" style="position: relative;top: -80px;left: 200px;">Customer Commitment Type  <span style="color:red;font-weight:bold">*</span></label>&nbsp;
		<div class="right-item" style="position: relative;top: -130px;left: 400px;margin-bottom: -100px;"><select class="border" id="cct" onchange="settext()" name='<portlet:namespace/>Customer_Commitment_Type' >
					<option value="">Select</option>
					<option >PO Received-Under Review</option>
					<option >LOI Received-Under Review</option>
					<option >Verbal Commitment Received-Under Review</option>
					<option >Email Received-Under Review</option>
					<option>Sub-Contract Received-Under Review</option>
		 </select>
		 <i class='fas fa-undo' style='color:yellow;'></i>
		 <span id="ccterror"></span>
		 </div>
	</div>
	<%-- <div class="flex-container" id="upo1">
		<label id="lupload">Upload <span style="color:red;font-weight:bold">*</span></label>&nbsp;
		<div class="right-item " >
		  <textarea name='<portlet:namespace/>uploadpo' onchange="settext()" id="upo" class="border" rows="5" cols="200" required="required"></textarea>
		  <span id="upoerror"></span>
		 </div>
	</div> --%>
	<div class="upload-container" id="upo1">
	<div id="parent">
	<label id="lupload" >Upload <span style="color:red;font-weight:bold">*</span></label>&nbsp;
		<div id="child1">
			<table style="margin-top: 10px; margin-left: 10px;">
				<tr id="preview"><td><span></span><td></tr>
			</table>
		</div>	
	<div class="mydropzone" id="child2" >
		<svg style="margin-left: 50px; margin-top: 25px" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cloud-arrow-up" viewBox="0 0 16 16">
 				 <path fill-rule="evenodd" d="M7.646 5.146a.5.5 0 0 1 .708 0l2 2a.5.5 0 0 1-.708.708L8.5 6.707V10.5a.5.5 0 0 1-1 0V6.707L6.354 7.854a.5.5 0 1 1-.708-.708l2-2z"/>
  				 <path d="M4.406 3.342A5.53 5.53 0 0 1 8 2c2.69 0 4.923 2 5.166 4.579C14.758 6.804 16 8.137 16 9.773 16 11.569 14.502 13 12.687 13H3.781C1.708 13 0 11.366 0 9.318c0-1.763 1.266-3.223 2.942-3.593.143-.863.698-1.723 1.464-2.383zm.653.757c-.757.653-1.153 1.44-1.153 2.056v.448l-.445.049C2.064 6.805 1 7.952 1 9.318 1 10.785 2.23 12 3.781 12h8.906C13.98 12 15 10.988 15 9.773c0-1.216-1.02-2.228-2.313-2.228h-.5v-.5C12.188 4.825 10.328 3 8 3a4.53 4.53 0 0 0-2.941 1.1z"/>
		</svg>
		<p style="margin-left: 7px; margin-top: 10px;">Drop Files Here <span style="margin-left: 45px;">or</span> 
		
		</p>
			<button class="file mydropzone" type="button" style=" margin-left: 8px; margin-top: -1px;">BrowseFiles</button>
	</div>
		<div id="child3">
		<br><br>
			<button type="button" class="button1" style="margin-left:5px;">LinkToFile</button><br>
			<button type="button" class="button" style="margin-left:5px; margin-top: 5px;">LinkToDropbox</button>
		</div>
			<input id="upo" type="hidden" name='<portlet:namespace/>uploadpo' id="files">
		</div>
	<div >
  </div>
  </div>	<br>
	<table class="ccd">
		<tr style="padding: 0px;">
			<td><label id="lpon">Proposed Order Number<span style="color:red;font-weight:bold">*</span></label></td>
			<td><input type="text" id="pon"></td>
			<td style="padding-left: 100px;"><label id="lvoc">Value Of commitment(£)<span style="color:red;font-weight:bold">*</span></label></td>
			<td style="height: 100px;"><input type="text" name='<portlet:namespace/>voc' id="voc"  style="height: 100px;"></td>
		</tr>
		<tr style="padding: 0px;" >
			<td style="margin-left: 10px;"><label>Receipt Method</label></td>
			<td><input type="text" name='<portlet:namespace/>rmethod'></td>
			<td style="padding-left: 100px;margin-left: 10px;"><label id="lrd">Receipt Date<span style="color:red;font-weight:bold">*</span></label></td>
			<td><input class="border" readonly="readonly" id="datepicker-input" type="text" name='<portlet:namespace/>rdate'><span id="calendericon">&#128197;</span></td>	
		</tr>
	</table>	
	</div>
	<%-- <div class="flex-container" id="cdate1">
		<label>Receipt Date</label>&nbsp;
		<div class="right-item" >
		 	<input class="border" readonly="readonly" id="datepicker-input" type="text" name='<portlet:namespace/>cdate'><span id="calendericon">&#128197;</span>
		 </div>	 
	</div>
	<div class="flex-container" id="cdate1">
		<label>Receipt Method</label>&nbsp;
		<div class="right-item" >
		 	<input type="text">
		 </div>	 
	</div> --%>
	<div class="flex-container" id="pcdc1" >
		<label id="lpcdc" style="margin-left: 40px;">Is The Proposed Customer Deemed Creditworthy For<br> This Project <span style="color:red;font-weight:bold " >*</span></label>
		<div class="right-item" style="position:relative;left: 420px;top: -40px; ">
			<select class="border" id="pcdc" onchange="settext()" name='<portlet:namespace/>PCDC' onclick="showowb()">
					<option value="">Select</option>
					<option >Yes</option>
					<option >No</option>
				</select>
			<span id="pcdcerror"></span>	
		</div>
	</div>
	<%-- <div class="flex-container" id="owb1">
		<label id="lowb" style="margin-left: 20px;">Client has been identified as New at RtQ stage,<br>
		therefore credit report is to 
		be uploaded to evidence credit worthiness <span style="color:red;font-weight:bold">*</span></label>&nbsp;
		<div class="right-item" >
		 <textarea style="margin-left:-10px;" name='<portlet:namespace/>OWB' id="owb" onchange="settext()" class="border" rows="4" cols="200"></textarea>
		 <span id="owberror"></span>
		 </div>
	</div> --%>
	
	<div class="upload-container" id="owb1">
	<div id="parent" style="margin-right: 20%;">
	<label id="lupload">On what Basis <span style="color:red;font-weight:bold">*</span></label>&nbsp;
		<div id="child1">
			<table style="margin-top: 10px; margin-left: 10px;">
				<tr id="preview1" ><td><span></span><td></tr>
			</table>
		</div>	
	<div class="mydropzone1" id="child2" >
		<svg style="margin-left: 50px; margin-top: 25px" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cloud-arrow-up" viewBox="0 0 16 16">
 				 <path fill-rule="evenodd" d="M7.646 5.146a.5.5 0 0 1 .708 0l2 2a.5.5 0 0 1-.708.708L8.5 6.707V10.5a.5.5 0 0 1-1 0V6.707L6.354 7.854a.5.5 0 1 1-.708-.708l2-2z"/>
  				 <path d="M4.406 3.342A5.53 5.53 0 0 1 8 2c2.69 0 4.923 2 5.166 4.579C14.758 6.804 16 8.137 16 9.773 16 11.569 14.502 13 12.687 13H3.781C1.708 13 0 11.366 0 9.318c0-1.763 1.266-3.223 2.942-3.593.143-.863.698-1.723 1.464-2.383zm.653.757c-.757.653-1.153 1.44-1.153 2.056v.448l-.445.049C2.064 6.805 1 7.952 1 9.318 1 10.785 2.23 12 3.781 12h8.906C13.98 12 15 10.988 15 9.773c0-1.216-1.02-2.228-2.313-2.228h-.5v-.5C12.188 4.825 10.328 3 8 3a4.53 4.53 0 0 0-2.941 1.1z"/>
		</svg>
		<p style="margin-left: 7px; margin-top: 10px;">Drop Files Here <span style="margin-left: 45px;">or</span> 
		
		</p>
			<button class="file mydropzone"  type="button" style=" margin-left: 8px; margin-top: -1px;">BrowseFiles</button>
	</div>
		<div id="child3">
		<br><br>
			<button type="button" class="button1" style="margin-left:5px;">LinkToFile</button><br>
			<button type="button" class="button" style="margin-left:5px; margin-top: 5px;">LinkToDropbox</button>
		</div>
			<input  type="hidden" name='<portlet:namespace/>owb' id="files1">
		</div>
	<div >
  </div>
  </div>
	
	<div class="flex-container" id="resformat1">
		<label style="margin-left: 30px;">Record proposed course of action to protect company</label>&nbsp;
		<div class="right-item" >
		 <textarea  name='<portlet:namespace/>RFormat' class="border" rows="4" cols="6" style="width: 50%; max-width: 100%;position: relative;left: 420px;top: -57px;"></textarea>
		</div>
	</div>
	
	<fieldset id="oad" style=" border: 1px solid #009EFF; width:100%;">
       <legend style="font-size:15px;font-weight:bold; width:fit-content; margin:9px; color:#009EFF; border: none;">Order Acknowlege Documents</legend>
       
				       <table>
				<tr>
				<td  style="margin-left: 20%; text-align: right;">
				<label style="margin-left: 100px;">Quote Reference Number PQ8493-P &nbsp; &nbsp; &nbsp;</label>
				</td>
				<td>
				</td>
				<td style="margin-left: 20%; text-align: right;" >
				<label>Date</label>
				</td>
				<td>
				<input class="border" readonly="readonly" id="datepicker-input1" type="text" name='<portlet:namespace/>cdate'><span id="calendericon1">&#128197;</span>
				</td>
				</tr>
				
				<!-- Company And Addresss   Details -->
				
				<tr>
				<td  style="margin-left: 20%; text-align: right;">
				<label>Company</label>
				</td>
				<td>
				<input type="text" name="<portlet:namespace/>company" placeholder="" id='company'  value="<%=getRecord.getCustomerName() %>" >
				</td>
				<td  style="margin-left: 20%; text-align: right;">
				<label>Address</label>
				</td>
				<td>
				<textarea id='address'   name="<portlet:namespace/>address"><%=getRecord.getCustomerAddress() %>></textarea>
				</td>
				</tr>
				<tr>
				<td  style="margin-left: 20%; text-align: right;">
				<label>Attention of</label>
				</td>
				<td>
				<input type="text" name="<portlet:namespace/>attention_of" placeholder="" id='attention' value="<%=getRecord.getContactName() %>">
				</td>
				<td  style="margin-left: 20%; text-align: right;">
				<label>Subject</label>
				</td>
				<td>
				<input type="text" name="<portlet:namespace/>subject" placeholder="" id='subject' >
				</td>
				</tr>
				
				<!-- Project Name Setting Panel for Teerth Techonospace & Scope of works   Details -->
				
				<tr>
				<td  style="margin-left: 20%; text-align: right;">
				<label><%=getRecord.getProjectName() %></label>
				</td>
				<td></td>
				<td  style=" padding-left:20px; text-align: right;">
				<label>Scope of works</label>
				</td>
				<td>
				<textarea  id='sow'  name="<portlet:namespace/>scope_of_works" placeholder=""></textarea>
				</td>
				</tr>
				
				<!-- Quoted Date & Proposed Works at Quadwave -->
				
				<tr>
				<td style="margin-left: 20%; text-align: right;">
				<label><%=getRecord.getQuoteSubmitDate() %> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</label>
				</td>
				<td></td>
				<td  style="margin-left: 20%; text-align: right;">
				<label>Proposed Works at Quadwave</label>
				</td>
				</tr>
				
				<!-- advise and Postal Code -->
				
				<tr>
				<td  style="margin-left: 20%; text-align: right;">
				<label>We will advise you</label>
				</td>
				<td>
				<input type="text" name="<portlet:namespace/>we_will_advise" placeholder="" id='advice' >
				</td>
				<td  style="margin-left: 20%; text-align: right;">
				<label>Postal Code</label>
				</td>
				<td>
				<input type="text" name="<portlet:namespace/>postal_code" placeholder="" id='postcode' value="<%=getRecord.getPostcode() %>">
				</td>
				</tr>
				
				<!-- Correspond with role and name details -->
				
				<tr>
				<td  style="margin-left: 20%; text-align: right;">
				<label>Correspond with Role</label>
				</td>
				<td>
				<select name="<portlet:namespace/>correspond_with_role" style="height: 25px; width: 250px;" id="owner">
					<option value="">select</option>
					<option>Board</option>
					<option>Head of Sales</option>
					<option>Sales Leader</option>
					<option>Engineering Leader</option>
					<option>Commercial Leader</option>
					<option>Operations Leader</option>
					<option>Project Leader</option>
					<option>Admin</option>
					<option>Design Lead</option>
					<option>Project Lead</option>
					<option>External Consultant</option>
					<option>Sales Director</option>
					<option>Econsys National</option>
					<option>Account Lead</option>
					<option>Project Delegator</option>
				
				</select>
				</td>
				
				<td  style="margin-left: 20%; text-align: right;">
				<label>Correspond with name</label>
				</td>
				<td>
				<select name="<portlet:namespace/>correspond_with_name"  style="height: 25px; width: 250px;" id="co-owner">
					<option value="" selected>select an option</option>
					<option>Andrew Redfern</option>
					<option>Pradeep k</option>
					<option>Rahul Singh</option>
					<option>Sanket s</option>
					<option>Prakash k</option>
					<option>Vinit d</option>
					<option>Devkaran</option>
				
				</select>
				</td>
				</tr>
				
				<!-- Correspond with Email -->
				<tr>
				   <td  style="margin-left: 20%; text-align: right;">
				   <label>Correspond with Email</label>
				   </td>
				<td>
				<input type="email" name="<portlet:namespace/>email" placeholder="" value="<%=getRecord.getEmail()%>">
				</td>
				</tr>
				 </table>	
  <div class="upload-container" style="margin-right: 10%;" >
 	
	<div id="parent">	
	 <label style="margin-left: 1%;">Upload evidence</label>&nbsp;
		<div id="child1">
			<table style="margin-top: 10px; margin-left: 10px;">
				<tr id="preview2"><td><span></span><td></tr>
			</table>
		</div>	
	<div class="mydropzone2" id="child2" >
		<svg style="margin-left: 50px; margin-top: 25px" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cloud-arrow-up" viewBox="0 0 16 16">
 				 <path fill-rule="evenodd" d="M7.646 5.146a.5.5 0 0 1 .708 0l2 2a.5.5 0 0 1-.708.708L8.5 6.707V10.5a.5.5 0 0 1-1 0V6.707L6.354 7.854a.5.5 0 1 1-.708-.708l2-2z"/>
  				 <path d="M4.406 3.342A5.53 5.53 0 0 1 8 2c2.69 0 4.923 2 5.166 4.579C14.758 6.804 16 8.137 16 9.773 16 11.569 14.502 13 12.687 13H3.781C1.708 13 0 11.366 0 9.318c0-1.763 1.266-3.223 2.942-3.593.143-.863.698-1.723 1.464-2.383zm.653.757c-.757.653-1.153 1.44-1.153 2.056v.448l-.445.049C2.064 6.805 1 7.952 1 9.318 1 10.785 2.23 12 3.781 12h8.906C13.98 12 15 10.988 15 9.773c0-1.216-1.02-2.228-2.313-2.228h-.5v-.5C12.188 4.825 10.328 3 8 3a4.53 4.53 0 0 0-2.941 1.1z"/>
		</svg>
		<p style="margin-left: 7px; margin-top: 10px;">Drop Files Here <span style="margin-left: 45px;">or</span> 
		
		</p>
			<button class="file mydropzone" type="button" style=" margin-left: 8px; margin-top: -1px;">BrowseFiles</button>
	</div>
		<div id="child3">
		<br><br>
			<button type="button" class="button1" style="margin-left:5px;">LinkToFile</button><br>
			<button type="button" class="button" style="margin-left:5px; margin-top: 5px;">LinkToDropbox</button>
		</div>
			<input type="hidden" name='<portlet:namespace/>files2' id="files2">
		</div>
	<div >
  </div>
  </div>    <br>
	</fieldset></div></div>
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
<label id="lcomments">Comments<span style="color:red;font-weight:bold">*</span></label>
<textarea name='<portlet:namespace/>comments' id="comment" onchange="settext()" class="border" rows="4" cols="400" style="width: 100%; max-width: 100%;" maxlength="20" required="required"></textarea>
<br><span id="comerror"></span>
		<div class="flex-container">
			<button type="button" style="background-color: #a069c3; height: 35px; width:100px; color:white; border: none;">New Link</button>&nbsp;
			<button type="button" style="background-color: #a069c3; height: 35px; width:100px; color:white; border: none;">Link Project</button>&nbsp;
			<button type="button" style="background-color: #5BC0F8; height: 35px; width:50px; color:white; border: none;">Save</button>&nbsp;
			<button type="submit" onclick="validate()" style="background-color: #5BB318; height: 35px; width:50px; color:white; border: none;">Submit</button>&nbsp;
			<button type="reset" style="background-color: #E64848; height: 35px; width:52px; color:white; border: none;">Cancel</button>	
		</div><br>	
</div>
</form>
<script type="text/javascript">

	$(document).ready(function() {
		
		$(".update").hide();
		$("#cct1").hide();
		$("#pcdc1").hide();
		$("#resformat1").hide();
		$("#cdate1").hide();
		$("#puc1").hide();
		$("#upo1").hide();
		$("#owb1").hide();
		$("#span2").hide();
		$(".ccd").hide();
		 $("#oad").hide();
		 $("#resformat1").hide();
		 $('.toggle-content1').hide();
		 
		 
		 $('.toggle-button1').click(function() {  
			    $('.toggle-content1').slideToggle();
			  });
		
		$('.toggle-content').hide();
	  $('.toggle-button').click(function() {  
	    $('.toggle-content').slideToggle();
	  });
	  
	  $('.toggle-content3').hide();
	  $('.toggle-button3').click(function() {  
	    $('.toggle-content3').slideToggle();
	  });
	  
	  $("#calendericon").click(function(){
		  $("#datepicker-input").datepicker();
		  $("#datepicker-input").focus();
	  });
	  
	  $("#calendericon1").click(function(){
		  $("#datepicker-input1").datepicker();
		  $("#datepicker-input1").focus();
	  });
	  
	  $("#calendericon-aod").click(function(){
		  $("#datepicker-input-aod").datepicker();
		  $("#datepicker-input-aod").focus();
	  });
	  $("#calendericon-ppsd").click(function(){
		  $("#datepicker-input-ppsd").datepicker();
		  $("#datepicker-input-ppsd").focus();
	  });
	  
	  $("#calendericon-pped").click(function(){
		  $("#datepicker-input-pped").datepicker();
		  $("#datepicker-input-pped").focus();
	  });
	  
	  var mydz= new Dropzone(".mydropzone",{
	    	url: "/Dropzone",
	        maxFilesize: 10,
	        addRemoveLinks: true,
	        paramName: "file",	
	        maxFiles: 5,
	        autoProcessQueue: false,
	            
	    });
	   
	     mydz.on("addedfile", function(file) {
	    	 
	    	   this.removeFile(file);
	    	  mydz.createThumbnail(file,null,120,120);

	    	  $("#files").val(file.name);
	    	   
	    	  document.querySelector("#preview").innerHTML =  file.name + "  " + file.size + " bytes";
	    	  
	    	}); 
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
	  
	});
	function validate(){
		 var sosq =$('#sosq').val();
		 var winp = $('#winp').val();
		 var cct = $('#cct').val();
		 var upo = $('#upo').val();
		 var pcdc = $('#pcdc').val();
		 var owb = $('#owb').val();
		 var puc = $('puc').val();
		 var pon = $('#pon').val();
		 var voc = $('#voc').val();
		 var rd = $('#datepicker-input').val();
		 var uaod = $('.aod').val();
		 var uppsd = $('.ppsd').val();
		 var upped = $('.pped').val();
		 var comments = $('#comment').val();
		 var flag = true;
		

		 if(sosq =="")
			{
			 document.getElementById("sosq").style.border = '1px solid red';
				document.getElementById("lsosq").style.color = 'red';
				flag=false;
			}
		 else{
			
			 document.getElementById("lsosq").style.color = '';
			 
		 }
		 
		 if(pon =="")
			{
			 document.getElementById("pon").style.border = '1px solid red';
				document.getElementById("lpon").style.color = 'red';
				flag=false;
			}
		 else{
			
			 document.getElementById("lpon").style.color = '';
			 
		 }
		 
		 if(winp =="")
			{
			 document.getElementById("winp").style.border = '1px solid red';
				document.getElementById("lwinp").style.color = 'red';
				flag=false;
			}
		 else{
			
			 document.getElementById("lwinp").style.color = '';
			 
		 }
		 
		 if(uaod =="")
			{
			 	document.getElementById("datepicker-input-aod").style.border = '1px solid red';
				document.getElementById("laod").style.color = 'red';
				flag=false;
			}
		 else{
			
			 document.getElementById("laod").style.color = '';
			 
		 }
		 
		 if(uppsd =="")
			{
			 	document.getElementById("datepicker-input-ppsd").style.border = '1px solid red';
				document.getElementById("lppsd").style.color = 'red';
				flag=false;
			}
		 else{
			
			 document.getElementById("lppsd").style.color = '';
			 
		 }
		 
		 if(upped =="")
			{
			 document.getElementById("datepicker-input-pped").style.border = '1px solid red';
				document.getElementById("lpped").style.color = 'red';
				flag=false;
			}
		 else{
			
			 document.getElementById("lpped").style.color = '';
			 
		 }
		 
		 if(rd =="")
			{
			 document.getElementById("datepicker-input").style.border = '1px solid red';
				document.getElementById("lrd").style.color = 'red';
				flag=false;
			}
		 else{
			
			 document.getElementById("lrd").style.color = '';
			 
		 }
		 if(voc =="")
			{
			 document.getElementById("voc").style.border = '1px solid red';
				document.getElementById("lvoc").style.color = 'red';
				flag=false;
			}
		 else{
			
			 document.getElementById("lvoc").style.color = '';
			 
		 }
		 
		 if(cct =="")
			{
				
				document.getElementById("lcct").style.color = 'red';
				flag=false;
			}
		 else{
			 
			 document.getElementById("cerror").innerHTML="";
			 
		 }
		 
		 if(upo =="")
			{
				document.getElementById("upoerror").innerHTML="";
				document.getElementById("upoerror").style.color = 'red';
				document.getElementById("upo").style.border = '1px solid red';
				document.getElementById("lupload").style.color = 'red';
				flag=false;
			}
		 else{
			 document.getElementById("upoerror").innerHTML="";
		 }
		 
		 if(pcdc =="")
			{
				
				document.getElementById("pcdc").style.border = '1px solid red';
				document.getElementById("lpcdc").style.color = 'red';
				flag=false;
			}
		 else{
			 document.getElementById("pcdcerror").innerHTML="";
		 }
		 
		 if(owb =="")
			{
				document.getElementById("owberror").innerHTML="";
				document.getElementById("owberror").style.color = 'red';
				document.getElementById("owb").style.border = '1px solid red';
				document.getElementById("lowb").style.color = 'red';
				flag=false;
			}
		 else{
			 document.getElementById("owberror").innerHTML="";
			 document.getElementById("owb").style.border = '';
		 }
		 
		 if(puc =="")
			{
				document.getElementById("pucerror").innerHTML="";
				document.getElementById("pucerror").style.color = 'red';
				document.getElementById("puc").style.border = '1px solid red';
				
				flag=false;
			}
		 else{
			 document.getElementById("pucerror").innerHTML="";
		 }
		 
		 if(comments =="")
			{
				document.getElementById("comerror").innerHTML="";
				document.getElementById("comerror").style.color = 'red';
				document.getElementById("comment").style.border = '1px solid red';
				document.getElementById("lcomments").style.color = 'red';
				flag=false;
			}
		 else{
			 document.getElementById("comerror").innerHTML="";
		 }
	 }
	
	function settext(){
		 var sosq =$('#sosq').val();
		 var cct = $('#cct').val();
		 var upo = $('#upo').val();
		 var pcdc = $('#pcdc').val();
		 var owb = $('#owb').val();
		 var puc = $('puc').val();
		 var comments = $('#comment').val();
		 
		 if(sosq =="Customer Commitment Received")
			{
			
			 $("#cct1").show();
			}
		 else{
			 
			
			 $("#cct1").hide();
			 $("#owb1").hide();
			 $("#upo1").hide();
			 $("#puc1").hide();
			 $("#cdate1").hide();
			 $("#resformat1").hide();
			 $("#pcdc1").hide();
			 $("#span2").hide();
			 $("#oad").hide();
			 $(".ccd").hide();
			 
		 }
		 
		 if(sosq =="Update")
			{
			
			 $(".update").show();
			 
			}
		 else{
			 
			 $(".update").hide();
			 
		 }
		 
		 
		 if(sosq =="")
			{
				 $("#cct1").hide();
				 $("#owb1").hide();
				 $("#upo1").hide();
				 $("#puc1").hide();
				 $("#cdate1").hide();
				 $("#resformat1").hide();
				 $("#pcdc1").hide();
				 $("#span2").hide();
				 $("#oad").hide();
				 $(".ccd").hide();
			}
		 
		 
		 if(sosq =="Customer Commitment Received")
			{
			 $(".ccd").show();
			}
		 else{
			 $(".ccd").hide();
			 
		 }
		 
		 
		 if(cct !=="")
			{
				 $("#oad").show();
			 	$("#pcdc1").show();
				$("#resformat1").show();
			 	$("#cdate1").show();
			 	$("#upo1").show();
			 	$("#puc1").show();
			 	$(".ccd").show();
				document.getElementById("ccterror").innerHTML="";
				document.getElementById("cct").style.border = 'none';
				document.getElementById("lcct").style.color = '';
				flag=false;
			}
		 else{
			 $("#oad").hide();
			 $("#owb1").hide();
			 $("#upo1").hide();
			 $("#puc1").hide();
			 $("#cdate1").hide();
			 $("#resformat1").hide();
			 $("#pcdc1").hide();
			 $("#span2").hide();
			 $(".ccd").hide();
			 
		 }
		 
		 if(cct =="Verbal Commitment Received-Under Review")
			{
			
			 $("#upo1").hide();
			}
		 
		 if(pcdc !=="")
			{
				document.getElementById("pcdcerror").innerHTML="";
				document.getElementById("pcdc").style.border = 'none';
				document.getElementById("lpcdc").style.color = '';
				flag=false;
			}
		 
		 if(upo !=="")
			{
				document.getElementById("upoerror").innerHTML="";
				document.getElementById("upo").style.border = 'none';
				document.getElementById("lupload").style.color = '';
			}
		 if(owb !=="")
			{
				document.getElementById("owberror").innerHTML="";
				document.getElementById("owb").style.border = 'none';
				document.getElementById("lowb").style.color = '';
			}
		 if(comments !=="")
			{
				document.getElementById("comerror").innerHTML="";
				document.getElementById("comment").style.border = 'none';
				document.getElementById("lcomments").style.color = '';
				flag=false;
			} 		
	}
	
	function showowb(){
		
		var pcdc = $('#pcdc').val();	
		
		if(pcdc=="Yes"){
	 		$("#owb1").show();
	 } 
		else{
			$("#owb1").hide();
			
		}
		
		if(pcdc=="No"){
	 		$("#resformat1").show();
	 } 
		else{
			$("#resformat1").hide();
			
		}
	}
</script>
</body>
</html>