<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

<!--Header-part-->
<div id="header">
  <h1><a href="dashboard.html">Matrix Admin</a></h1>
</div>
<!--close-Header-part--> 
<jsp:include page="header.jsp" />
<!--top-Header-menu-->

<!--start-top-serch-->
<!--close-top-serch--> 

<!--sidebar-menu-->
<jsp:include page="sideBar.jsp" />
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" class="tip-bottom" data-original-title="Go to Home"><i class="icon-home"></i> Home</a> <a href="#" class="current">Tables</a> </div>
    <h1>Personellerim</h1>
  </div>
  <div class="container-fluid">
   <p align="right" ><a href="insertEmployee.jsp"class="btn btn-success" type="button"> Ekle</a></p>
   <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5>Personeller Listesi</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered table-striped">
              <thead>
                <tr>
                  <th>Adı</th>
                  <th>Soyadı</th>
                  <th>Kullanıcı Adı</th>
                  <th>Rolü</th>
                  <th>Bölümü</th>
				  <th>Bölüm Müdürü</th>
				  <th>İşlemler</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach var="employee" items="${allEmployee}">
                <tr class="odd gradeX">
                  <td><c:out value="${employee.eName}"/></td>
                  <td><c:out value="${employee.eSurname}"/></td>
                  <td><c:out value="${employee.eUserNAME}"/></td>
                  <td class="center"><c:out value="${employee.eRole}"/></td>
				  <td class="center"><c:out value="${employee.eDepartment}"/></td>
				  <td class="center"><c:out value="${employee.eBoss}"/></td>
				  <td><div class="article-post">
                  	  <div class="fr"> 
					  <a href="#" class="btn btn-success btn-mini">Güncelle</a> 
					  <a href="#" class="btn btn-danger btn-mini">Sil</a>
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