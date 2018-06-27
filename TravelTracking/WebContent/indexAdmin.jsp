<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<title>Matrix Admin</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-responsive.min.css">
<link rel="stylesheet" href="css/fullcalendar.css">
<link rel="stylesheet" href="css/matrix-style.css">
<link rel="stylesheet" href="css/matrix-media.css">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet" href="css/jquery.gritter.css">
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,700,800" rel="stylesheet" type="text/css">
</head>
<body>
<%
String name = (String) session.getAttribute("userName");
String role = (String) session.getAttribute("userRole");
String pass = (String) session.getAttribute("userPassword");

String userName = null;
String sessionID = null;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("name")) 
		userName = cookie.getValue();
	if(cookie.getName().equals("role")) 
		sessionID = cookie.getValue();
	
	if(cookie.getName().equals("pass")) 
		sessionID = cookie.getValue();
}
}

%>
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
    
<!--End-Action boxes-->    

<!--Chart-box-->    
    
<!--End-Chart-box--> 
    <hr>
    
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