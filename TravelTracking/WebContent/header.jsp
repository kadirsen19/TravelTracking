<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav" style="width: auto; margin: 0px;">
    <li class="dropdown" id="profile-messages"><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user">
   </i>  <span class="text">${employeename}&nbsp;${employeesurname}</span></a>
      
    </li>
 <%
String userrole= (String)session.getAttribute("userRole");
if(userrole.equals("admin"))
{
	
%>
 <li class="dropdown"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Personel Talepleri</span>  <b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li><a class="sAdd" title="" href="allTravelList"> Seyahatlar</a></li>
        <li class="divider"></li>
        <li><a class="sInbox" title="" href=allPermission> İzinler</a></li>
		<li><a class="sInbox" title="" href="listEmployee"> Personeller</a></li>
        
      </ul>
    </li>
<%
}
%>
    <li class=""><a title="" href="login.jsp"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
    <%session.removeAttribute(userrole);%>
  </ul>
</div>