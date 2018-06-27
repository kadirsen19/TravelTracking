<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Matrix Admin</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-responsive.min.css">
<link rel="stylesheet" href="css/datepicker.css" />
<link rel="stylesheet" href="css/fullcalendar.css">
<link rel="stylesheet" href="css/matrix-style.css">
<link rel="stylesheet" href="css/matrix-media.css">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet" href="css/jquery.gritter.css">
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,700,800" rel="stylesheet" type="text/css">
<!--ek linkler -->

</head>
<body>
<!--Header-part-->
<div id="header">
  <!-- <h1><a href="dashboard.html">Matrix Admin</a></h1> -->
</div>
<!--close-Header-part--> 


<!--top-Header-menu-->
<jsp:include page="header.jsp" />
<!--close-top-Header-menu-->
<!--start-top-serch-->

<!--close-top-serch-->
<!--sidebar-menu-->
<jsp:include page="sideBar.jsp" />
<!--sidebar-menu-->
<!--main-container-part-->
<div id="content">
<!--breadcrumbs-->
  <div id="content-header">
    <div id="breadcrumb"> <a href="taslak.html" class="tip-bottom" data-original-title="Go to Home"><i class="icon-home"></i> Home</a></div>
  </div>
<!--End-breadcrumbs-->
<!--Action boxes-->
  <div class="container-fluid">
    <hr>
	<div class="row-fluid">
    <div class="span12">
      <div class="widget-box">
        <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
          <h5>Personel Ekleme Formu</h5>
        </div>
        <div class="widget-content nopadding">
          <form action="addEmployee" method="post" class="form-horizontal">
            <div class="control-group">
              <label class="control-label">Adı :</label>
              <div class="controls">
                <input type="text" name="name" class="span11" placeholder="Adı" />
              </div>
            </div>
			<div class="control-group">
              <label class="control-label">Soyadı :</label>
              <div class="controls">
                <input type="text" name="surname" class="span11" placeholder="Soyadı" />
              </div>
            </div>
			<div class="control-group">
              <label class="control-label">Kullanıcı Adı :</label>
              <div class="controls">
                <input type="text" name="username" class="span11" placeholder="Kullanıcı Adı" />
              </div>
            </div>
			<div class="control-group">
              <label class="control-label">Şifre :</label>
              <div class="controls">
                <input type="text" name="password" class="span11" placeholder="Şifre" />
              </div>
            </div>
			<div class="control-group">
              <label class="control-label">Rolü :</label>
              <div class="controls">
                <input type="text" name="role" class="span11" placeholder="Rolü" />
              </div>
            </div>
			<div class="control-group">
              <label class="control-label">Bölümü :</label>
              <div class="controls">
                <input type="text" name="department" class="span11" placeholder="Bölümü" />
              </div>
            </div>
			<div class="control-group">
              <label class="control-label">Bölüm Müdürü :</label>
              <div class="controls">
                <input type="text" name="boss" class="span11" placeholder="Bölüm Müdürü" />
              </div>
            </div>
            <div class="form-actions">
             <button id="submit" type="submit" value="submit" class="btn btn-success">Kaydet</button>
            </div>
		
          </form>
        </div>
  </div>
</div>
<!--end-main-container-part-->
<!--Footer-part-->
<!--end-Footer-part-->
<script src="js/excanvas.min.js"></script> 
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.flot.min.js"></script> 
<script src="js/jquery.flot.resize.min.js"></script> 
<script src="js/jquery.peity.min.js"></script> 
<script src="js/fullcalendar.min.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.dashboard.js"></script> 
<script src="js/jquery.gritter.min.js"></script> 
<script src="js/matrix.interface.js"></script> 
<script src="js/matrix.chat.js"></script> 
<script src="js/jquery.validate.js"></script> 
<script src="js/matrix.form_validation.js"></script> 
<script src="js/jquery.wizard.js"></script> 
<script src="js/jquery.uniform.js"></script> 
<script src="js/select2.min.js"></script> 
<script src="js/matrix.popover.js"></script> 
<script src="js/jquery.dataTables.min.js"></script> 
<script src="js/matrix.tables.js"></script> 
<!-- ek scripler-->
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/bootstrap-colorpicker.js"></script> 
<script src="js/bootstrap-datepicker.js"></script> 
<script src="js/jquery.toggle.buttons.js"></script> 
<script src="js/masked.js"></script> 
<script src="js/jquery.uniform.js"></script> 
<script src="js/select2.min.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.form_common.js"></script> 
<script src="js/wysihtml5-0.3.0.js"></script> 
<script src="js/jquery.peity.min.js"></script> 
<script src="js/bootstrap-wysihtml5.js"></script> 
<script>
	$('.textarea_editor').wysihtml5();
</script>
<script type="text/javascript">
  // This function is called from the pop-up menus to transfer to
  // a different page. Ignore if the value returned is a null string:
  function goPage (newURL) {

      // if url is empty, skip the menu dividers and reset the menu selection to default
      if (newURL != "") {
      
          // if url is "-", it is this page -- reset the menu:
          if (newURL == "-" ) {
              resetMenu();            
          } 
          // else, send page to designated URL            
          else {  
            document.location.href = newURL;
          }
      }
  }

// resets the menu selection upon entry to this page:
function resetMenu() {
   document.gomenu.selector.selectedIndex = 2;
}
</script>


<ul class="typeahead dropdown-menu" style="display: none;"></ul>
</body></html>