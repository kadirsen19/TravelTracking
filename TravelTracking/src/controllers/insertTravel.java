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
import model.Employee;
import model.Travel;

@WebServlet("/insertTravel")
public class insertTravel extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeDAO dao= new EmployeeDAO();
		
		HttpSession sessionUser = req.getSession(true);
	    String name=(String)sessionUser.getAttribute("name");
	    
	    List<Travel> travelList= dao.getTravel(name);
		
	    req.setAttribute("allTravels", travelList);
	    
	    RequestDispatcher rd= req.getRequestDispatcher("/seyehatlerim.jsp");
	   
	    rd.forward(req, resp);
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeDAO dao= new EmployeeDAO();
		
		HttpSession sessionUser = req.getSession(true);
	    String name=(String)sessionUser.getAttribute("name");
		
		String startTravel= req.getParameter("departureDate");
		String finishTravel=req.getParameter("returnDate");
		String travelPlace= req.getParameter("place");
		String travelReason = req.getParameter("reason");
		
		Employee emp= dao.getEmployeeByUserName(name);
		dao.insertTravel(emp.geteName(), emp.geteSurname(), emp.geteDepartment(), emp.geteBoss(), startTravel, finishTravel, travelPlace, travelReason,emp.geteUserNAME());
		
		RequestDispatcher rd = req.getRequestDispatcher("/insertTravel.jsp");
		rd.forward(req, resp);
		
		
	}
	
}

