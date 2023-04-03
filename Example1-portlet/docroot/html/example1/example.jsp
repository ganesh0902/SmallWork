<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
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
</head>
<body>
	
	
		<div  class="toggle-bar-quote-form ">
		<label class="toggle-button1 comment">&nbsp;<i class='fas fa-caret-right' style="color:#009EFF; "></i>Quote Form</label>
		<div class="toggle-content1">
			<label class="toggle-button11 comment">&nbsp;<i class='fas fa-caret-right' style="color:#009EFF; "></i>Project Info</label>
				<div class="toggle-content11">
					<h2>Project Info</h2>
				</div>
				<div class="toggle-content1">
			<label class="toggle-button12 comment">&nbsp;<i class='fas fa-caret-right' style="color:#009EFF; "></i>Quote Info</label>
				<div class="toggle-content12">
					<h2>Quote Info</h2>
				</div>
					
			</div>	
			</div>
		</div>
	
	
	<div  class="toggle-bar ">
		<label class="toggle-button2 comment">&nbsp;<i class='fas fa-caret-right' style="color:#009EFF; "></i>Submit Quote</label>
		<div class="toggle-content2">
		<div class="prepare-quote" style="border: 1px solid black;margin-bottom: 2px;">
		<table class="SO" style="margin-left: 10px;">
			<tr>
				<td><label id="lqsa">Quote Submitted On<span style="color:red;font-weight:bold">*</span></label></td>
				<td><input class="border" readonly="readonly" id="datepicker-input" type="text" name='<portlet:namespace/>qsodate'><span id="calendericon">&#128197;</span><span id="qsaerror"></span></td>
				 
			</tr>
			<tr >
				<td><label id="lwinp">% Win Probability<span style="color:red;font-weight:bold">*</span></label></td>
				<td><input type="text" id="winp"  name='<portlet:namespace/>wp'> <span id="winperror"></span></td>
			</tr>
		</table>
		<br>
		</div>
	</div>	
	</div>
	<div  class="toggle-bar ">
		<label class="toggle-button3 comment">&nbsp;<i class='fas fa-caret-right' style="color:#009EFF; "></i> Comment History</label>
		<div class="toggle-content3">
		<%
			/* List<OFA> clist = OFALocalServiceUtil.getOFAs(-1, -1);
			for(OFA ofa: clist) */{
		%>
		
			<div class="timeline">
				<div class="timeline__component">Manish <br> Langhe</div>
				<div class="timeline__middle">
   					<div class="timeline__point"></div>
  				</div>
  			    <div class="timeline__component__right">
  			    	<%-- <p style="font-weight: bold;"><%= ofa.getCustomer_commitment_type()%> on <%= ofa.getSubmittedformdate()%> </p>
  			    	<p><%=ofa.getComments()%></p> --%>
  			    </div>
			</div>
			<%
			}
			%>
		</div>
		</div>
		<span style="color:red; font-size:12px">Please record what manner and when the Quote was submitted</span>
<label id="lcomments">Comments<span style="color:red;font-weight:bold">*</span></label>
<textarea name='<portlet:namespace/>comments' id="comment" onchange="settext()" class="border" rows="4" cols="400" style="width: 100%; max-width: 100%;" maxlength="20" required="required"></textarea>
	<br>
	<div class="flex-container">
			<button type="button" style="background-color: #a069c3; height: 35px; width:100px; color:white; border: none;">New Link</button>&nbsp;
			<button type="button" style="background-color: #a069c3; height: 35px; width:100px; color:white; border: none;">Link Project</button>&nbsp;
			<button type="button" style="background-color: #5BC0F8; height: 35px; width:50px; color:white; border: none;">Save</button>&nbsp;
			<button type="submit" onclick="validate()" style="background-color: #5BB318; height: 35px; width:50px; color:white; border: none;">Submit</button>&nbsp;
			<button type="reset" style="background-color: #E64848; height: 35px; width:52px; color:white; border: none;">Cancel</button>	
		</div><br>	
	<script type="text/javascript">
	$(document).ready(function() {
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
});	
	function validate(){
		
		 var datepicker = $('#datepicker-input').val();
		 var winp = $('#winp').val();
		 var flag = true;
		 
		 if(datepicker =="")
			{
				document.getElementById("qsaerror").innerHTML="*Customer Commitment Type is Mandatory";
				document.getElementById("qsaerror").style.color = 'red';
				document.getElementById("lqsa").style.color = 'red';
				flag=false;
			}
		 else{
			 
			 document.getElementById("qsaerror").innerHTML="";
			 
		 }
		 
		 if(winp =="")
			{
				document.getElementById("winperror").innerHTML="*This Field is Mandatory";
				document.getElementById("winperror").style.color = 'red';
				document.getElementById("lwinp").style.color = 'red';
				flag=false;
			}
		 else{
			 document.getElementById("winperror").innerHTML="";
		 } 
}
	</script>	
</body>
