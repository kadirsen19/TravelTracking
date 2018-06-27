<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Dashboard</a>
  <ul style="display: block;">
<%
String userrole= (String)session.getAttribute("userRole");
//String username=(String)session.getAttribute("name");
if(userrole.equals("admin"))
{
	
%> <li class="active"><a href="insertTravel.jsp"><i class="icon icon-home"></i> <span>Seyehat Formu</span></a> </li>
    <li> <a href="izinFormu.jsp"><i class="icon icon-signal"></i> <span>İzin Formu</span></a> </li>
    <li> <a href="insertPermission"><i class="icon icon-inbox"></i> <span>İzinlerim</span></a> </li>
    <li><a href="insertTravel"><i class="icon icon-th"></i> <span>Seyehatlarım</span></a></li>
	<li><a href="insertEmployee.jsp"><i class="icon icon-th"></i> <span>Personel Ekle</span></a></li>	
<%
}
else{
%>

    <li class="active"><a href="insertTravel.jsp"><i class="icon icon-home"></i> <span>Seyehat Formu</span></a> </li>
    <li> <a href="izinFormu.jsp"><i class="icon icon-signal"></i> <span>İzin Formu</span></a> </li>
    <li> <a href="insertPermission"><i class="icon icon-inbox"></i> <span>İzinlerim</span></a> </li>
    <li><a href="insertTravel"><i class="icon icon-th"></i> <span>Seyehatlarım</span></a></li>
	
<% 
}%>
  </ul>
</div>