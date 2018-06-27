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
import model.Employee;
@WebServlet("/addEmployee")
public class EmployeeController extends HttpServlet {

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String name= req.getParameter("name");
		String surname=req.getParameter("surname");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String role = req.getParameter("role");
		String department=req.getParameter("department");
		String boss= req.getParameter("boss");
		EmployeeDAO insert=new EmployeeDAO();
		insert.insertEmployee(name, surname, username, password, role, department, boss);
		
		RequestDispatcher rd = req.getRequestDispatcher("/insertEmployee.jsp");
		rd.forward(req, resp);
		
		
		
	}
}
