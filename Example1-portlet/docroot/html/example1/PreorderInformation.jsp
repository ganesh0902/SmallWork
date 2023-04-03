	<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:actionURL var="addfile" name="addfile"></portlet:actionURL>
<portlet:defineObjects />

<html>
<head>
	<title>Prepare to quote</title>
	
     <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css" />
    <link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css" rel="stylesheet" type="text/css" />
    <link href="/Content/demo.css" rel="stylesheet" type="text/css" />
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js" type="text/javascript"></script> 
    <script src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/dropzone.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/5.9.3/dropzone.min.js" integrity="sha512-U2WE1ktpMTuRBPoCFDzomoIorbOyUv0sP8B+INA3EzNAhehbzED1rOJg6bCqPf/Tuposxb5ja/MAUnC8THSbLQ==" 
crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/dropzone.css" rel="stylesheet"/>
<link href="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/basic.css" rel="stylesheet"/>
 <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
    <!-- 	 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script> -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js">
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/xlsx/0.8.0/jszip.js"> </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/xlsx/0.8.0/xlsx.js"> </script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js">
        </script>
	<script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
	<style type="text/css">
	
th,td {
  text-align: center;
  padding: 10px;
}
.table {
	width:100%;
	text-align: center;
  	padding: 5px;
}

/ The Close Button /
.close {
  color: #aaaaaa;
  float: right;
  font-size: 28px;
  font-weight: bold;
}
.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}
.model{
		position: absolute;
		background-color: white;
		bottom: 0;
		width: 25%;
		height: 25%;
		z-index: 1040;
		border: 1 px solid black;
}
.model-header{
	background-color: #edebeb;
	height: 40px;
	border: 1 px solid #76dde9;
}
.modeltable td{
	padding: 0px;
}
.model-content{
	margin: 20px 30px;
}
.flex-button{
	height: 40px;
	display: flex;
	flex-direction: row;
	justify-content: flex-end;
}
.bidmodel{
		position: absolute;
		background-color: white;
		top:25%;
		right:15%;
		width: 25%;
		height: 20%;
		border: 1 px solid black;
		z-index: 1040;
}
.ui-widget-overlay{
	background: rgba(0, 0, 0, 0.25);
	Opacity: 1;
	z-index: 1040;
}
		
	</style>
	
</head>
<body>
			<div  style="background-color: #307ecc; color: white; margin-left: 40px; height: 30px; width: 90%; font-weight: bold; padding: 3px;" ><p>Pre-Order Information</p></div>
			<table id="myTable" style="width:90%; margin-left: 40px; border: 1px solid white; margin-bottom: 15px; border-spacing: 10px; ">
				<thead style="background-color: #edebeb;">
					<tr>			
						<th>Date</th>
						<th>Comments</th>
						<th>Document</th>
						<th>Action</th>
					</tr>
				</thead>
			</table>
			<span id="modalbtn" style="background-color: #a069c3; color: white; font-weight: bold; margin-left: 30px; margin-bottom: 30px;">&nbsp;+&nbsp;</span> Add New
			 <div class="model" id="mymodal">
				<div class="model-header"><small style="margin: 20px 20px; color: rgb(71, 143, 202); ">Add Equipment Schedule <span class="close">&times;</span></small></div>
				<div class="model-content">
				<table class="modeltable">
				<tr>
					<td><label>Type <span style="color:red;font-weight:bold"> *</span></label></td>
					<td><input type="text" id="type" style="width: 70%"></td>
				</tr>
				<tr>
					<td><label>Description <span style="color:red;font-weight:bold"> *</span></label></td>
					<td><textarea rows="3" id="description" cols="" style="width: 80%"></textarea></td>
				</tr>
					<tr>
					<td><label>Quantity <span style="color:red;font-weight:bold">*</span></label></td>
					<td><textarea rows="3" cols="" id="quantity" style="width: 80%"></textarea></td>
				<tr>
					<td><label>Comments</label></td>
					<td><textarea rows="3" cols="" id="comments" style="width: 80%"></textarea></td>
				</tr>	
				</table> 
				<div class="flex-button"><br>
					<button onclick="addform()" type="button" style="background-color: #62CDFF; height: 30px; width:40px; color:white; border: none;">Save</button>&nbsp;&nbsp;&nbsp;&nbsp;
					<button id="cancel" type="button" style="background-color: #62CDFF; height: 30px; width:50px; color:white; border: none;">Cancel</button>
				</div>	
				</div>
			</div>
			
			<script type="text/javascript">
			
			  $(".ui-widget-overlay").hide();
			  $("#mymodal").hide(); 
			  $(".bidmodel").hide(); 
		  // Open the modal when the button is clicked
	 	$("#modalbtn").click(function() {
	 			 $(".ui-widget-overlay").show();
	   			$("#mymodal").show();
	   			
		  });
	 	$("#addbid").click(function() { 
	 		 $(".ui-widget-overlay").show();
		    $(".bidmodel").show(); 
		  });
			  
		  // Close the modal when the close button is clicked
	 $(".close,#cancel").click(function() { 
		    $("#mymodal").hide();
		    $(".bidmodel").hide();
		    $(".ui-widget-overlay").hide();	
		  });
			</script>
			
	</body>
	</html>	