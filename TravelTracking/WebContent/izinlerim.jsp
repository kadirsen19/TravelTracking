<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en"><head>
<title>Matrix Admin</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-responsive.min.css">
<link rel="stylesheet" href="css/uniform.css">
<link rel="stylesheet" href="css/select2.css">
<link rel="stylesheet" href="css/matrix-style.css">
<link rel="stylesheet" href="css/matrix-media.css">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,700,800" rel="stylesheet" type="text/css">
</head>
<body>

<!--Header-part-->
<div id="header">
  <h1><a href="dashboard.html">Matrix Admin</a></h1>
</div>
<!--close-Header-part--> 

<!--top-Header-menu-->
<<jsp:include page="header.jsp" />
<!--start-top-serch-->
<!--sidebar-menu-->
<jsp:include page="sideBar.jsp" />
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" class="tip-bottom" data-original-title="Go to Home"><i class="icon-home"></i> Home</a> <a href="#" class="current">Tables</a> </div>
    <h1>İzin Formu</h1>
  </div>
  <div class="container-fluid">
    <hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5>İzin Bilgilendirme Formu</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered table-striped">
              <thead>
                <tr>
                  <th>Adı</th>
                  <th>Soyadı</th>
                  <th>Bölümü</th>
                  <th>Müdürü</th>
                  <th>İzin Nedeni</th>
                  <th>İzin Başlangıç</th>
                  <th>İzin Bitiş</th>
				  <th>İşlemler</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach var="permission" items="${permissionlist}">
                <tr class="odd gradeX">
                  <td><c:out value="${permission.name}"/></td>
                  <td><c:out value="${permission.surname}"/></td>
                  <td><c:out value="${permission.department}"/></td>
                  <td><c:out value="${permission.boss}"/></td>
                  <td width="250"><c:out value="${permission.reason}"/></td>
                  <td class="center"><c:out value="${permission.permissionStar}"/></td>
                  <td class="center"><c:out value="${permission.permissionFinish}"/></td>
				 <td><div class="article-post">
                  	  <div class="fr"> 
					  <a href="#" class="btn btn-success btn-mini">Güncelle</a> 
					  <a href="deletePermission?permissionId=${permission.idpermission}" class="btn btn-danger btn-mini">Sil</a>
				  </div>
                </div></td>
                </tr>
                </c:forEach>
              </tbody>
            </table>
          </div>
        </div> 
      </div>
    </div>
  </div>
</div>
<!--Footer-part-->
<div class="row-fluid">
  <div id="footer" class="span12"> 2013 © Matrix Admin. Brought to you by <a href="http://themedesigner.in">Themedesigner.in</a> </div>
</div>
<!--end-Footer-part-->
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.uniform.js"></script> 
<script src="js/select2.min.js"></script> 
<script src="js/jquery.dataTables.min.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.tables.js"></script>


<ul class="typeahead dropdown-menu"></ul></body></html>