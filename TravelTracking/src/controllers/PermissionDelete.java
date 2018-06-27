package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.EmployeeDAO;
import model.Permission;
@WebServlet("/deletePermission")
public class PermissionDelete extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeDAO dao = new EmployeeDAO();
		
		int id = Integer.parseInt(req.getParameter("permissionId"));
		dao.deletePermission(id);
		
		HttpSession sessionUser = req.getSession(true);
	    String name=(String)sessionUser.getAttribute("name");
		List<Permission> permissionList=dao.getPermission(name);
		
	    req.setAttribute("permissionlist", permissionList);
	    
	    RequestDispatcher rd = req.getRequestDispatcher("/izinlerim.jsp");
	    rd.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	}
}
