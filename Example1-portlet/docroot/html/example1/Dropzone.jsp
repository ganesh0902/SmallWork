<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:actionURL var="dataAction" name="dataAction"></portlet:actionURL>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    <script src="https://unpkg.com/dropzone@6.0.0-beta.1/dist/dropzone-min.js"></script>
<link href="https://unpkg.com/dropzone@6.0.0-beta.1/dist/dropzone.css" rel="stylesheet" type="text/css" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js" integrity="sha512-STof4xm1wgkfm7heWqFJVn58Hm3EtS31XFaagaa8VMReCXAkQnJZ+jEy8PCC/iT18dFy95WcExNHFTqLyp72eQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer"/>
<style>
html, body {
  height: 100%;
}
#actions {
  margin: 2em 0;
}
.drag-area {
    border: 2px dashed #fff;
    height: 100px;
    width: 200px;
    border-radius: 5px;
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    margin: 10px;
    cursor: pointer;
}

.drag-area.active {
    border: 2px solid #000;
}

.drag-area .icon {
    font-size: 25px;
    color: #000;
}

.drag-area header {
    font-size: 15px;
    font-weight: 500;
    color: #000;
}

.drag-area span {
    font-size: 13px;
    font-weight: 500;
    color: #000;
     / margin: 10px 0 15px 0;  /
}

.drag-area .file-upload {
    padding: 10px 25px;
    font-size: 16px;
    font-weight: 500;
    border: 1px solid #146da9;
    outline: none;
    background: #fff;
    color: #0870b5;
    border-radius: 5px;
    cursor: pointer;
}

 / Mimic table appearance  /
 div.table {
  display: table;
  table-layout: fixed;
}
div.table .file-row {
  display: table-row;
}
div.table .file-row > div {
  display: table-cell;
  vertical-align: top;
  border-top: 1px solid #ddd;
  padding: 8px;
}
div.table .file-row:nth-child(odd) {
  background: #f9f9f9;
} 



 / The total progress gets shown by event listeners  /
/* #total-progress {
  opacity: 0;
  transition: opacity 0.3s linear;
} */

  / Hide the progress bar when finished  /
#previews .file-row.dz-success .progress {
  opacity: 0;
  transition: opacity 0.3s linear;
}

   / Hide the delete button initially  /
#previews .file-row .delete {
  display: none;
}

 / Hide the start and cancel buttons and show the delete button  /

#previews .file-row.dz-success .start,
#previews .file-row.dz-success .cancel {
  display: none;
}
#previews .file-row.dz-success .delete {
  display: block;
}


</style>
</head>
<body>
    <div class="container">
        <!-- HTML heavily inspired by https://blueimp.github.io/jQuery-File-Upload/ -->
        <div id="actions" class="row"  >
            <div class="col-lg-7" style="border: 1px solid gray;">
                <div class="col-lg-4" >
                    <!-- The fileinput-button span is used to style the file input field as button -->
                    <!-- <span class="btn btn-success fileinput-button dz-clickable">
                        <i class="glyphicon glyphicon-plus"></i>
                        <span>Add files...</span>
                    </span> -->
                    <div class="table table-striped files" id="previews">
                      <div id="template" class="file-row dz-image-preview" style="color: #6fb3e0;">
                          <!-- This is used as the file preview template -->
                          <div style=" white-space: nowrap; overflow: hidden; text-overflow: ellipsis;">
                              <p class="name" data-dz-name></p>
                              <strong class="error text-danger" data-dz-errormessage></strong>
                          </div>
                          <div>
                             
                              <button data-dz-remove class="cancel" style="border: none; background-color: #f9f9f9;" >
                                  <i class="bi bi-trash3"></i>
                              </button>
                              
                          </div>
                      </div>
                  </div>
                  </div>       
             
               
                  <div class="col-lg-5" style="border-left:1px solid #6d6969; border-right:1px solid #6d6969;">
                   
                      <div class="drag-area dz-clickable fileinput-button" style="margin-left: 25px ;" >
                          <div class="icon"><i class="fa-sharp fa-solid fa-cloud"></i></div>
                          <header style="color: #746d6d;"> <b>Drop  files here</b></header>
                          <span style="color: #746d6d;"><b>or</b></span>
                          <input  for="file-upload" class="file-upload"  name="<portlet:namespace/>file"    label ="Browser"  value="Browser files">

                      </div>
                  </div>
                  <div class="col-lg-3" style="align-items: center; margin-top: 30px;  ">
                      <button style="width: 120px; color: #fff; background-color: #9585bf !important; border-color: #9585bf;" >
                          Link to File
                      </button>
                      <button style="margin-top: 12px;  width: 120px; background-color: #9585bf !important; border-color: #9585bf; color: #fff;">
                        Link to Dropbox
                    </button>
        
                  </div>
              </div>
        
            </div>
            <div class="col-lg-5"></div>
        
        </div>
    <script>
    // Get the template HTML and remove it from the doumenthe template HTML and remove it from the doument
    var previewNode = document.querySelector("#template");
    previewNode.id = "";
    var previewTemplate = previewNode.parentNode.innerHTML;
    previewNode.parentNode.removeChild(previewNode);

    var myDropzone = new Dropzone(".container", { // Make the whole body a dropzone
    url: "/upload", // Set the url
    thumbnailWidth: 80,
    thumbnailHeight: 80,
    parallelUploads: 20,
    previewTemplate: previewTemplate,
    autoQueue: false, // Make sure the files aren't queued until manually added
    previewsContainer: "#previews", // Define the container to display the previews
    clickable: ".fileinput-button" // Define the element that should be used as click trigger to select files.
    });

    myDropzone.on("addedfile", function(file) {
    // Hookup the start button
    file.previewElement.querySelector(".start").onclick = function() { myDropzone.enqueueFile(file); };
    });

    // Update the total progress bar
    myDropzone.on("totaluploadprogress", function(progress) {
    document.querySelector("#total-progress .progress-bar").style.width = progress + "%";
    });
    myDropzone.on("sending", function(file) {
    // Show the total progress bar when upload starts
    document.querySelector("#total-progress").style.opacity = "1";
    // And disable the start button
    file.previewElement.querySelector(".start").setAttribute("disabled", "disabled");
    });

    // // Hide the total progress bar when nothing's uploading anymore
    // myDropzone.on("queuecomplete", function(progress) {
    // document.querySelector("#total-progress").style.opacity = "0";
    // });

    // Setup the buttons for all transfers
    // The "add files" button doesn't need to be setup because the config
    // `clickable` has already been specified.
    document.querySelector("#actions .start").onclick = function() {
    myDropzone.enqueueFiles(myDropzone.getFilesWithStatus(Dropzone.ADDED));
    };
    document.querySelector("#actions .cancel").onclick = function() {
    myDropzone.removeAllFiles(true);
    };

    </script>

</body>
</html>