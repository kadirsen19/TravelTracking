package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import model.Permission;
@WebServlet("/allPermission")
public class ALLPermission extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeDAO dao = new EmployeeDAO();
		
		List<Permission> permissionList = dao.getEmployeePermission();
		
		req.setAttribute("permissionlist", permissionList);
		
		RequestDispatcher rd = req.getRequestDispatcher("/izinlerim.jsp");
		
		rd.forward(req, resp);
	}
}
