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
import model.Travel;
@WebServlet("/deleteTravel")
public class Travel_Delete extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeDAO dao = new EmployeeDAO();
		
		int id = Integer.parseInt(req.getParameter("travelId"));
		dao.deleteTravel(id);
		
		HttpSession sessionUser = req.getSession(true);
	    String name=(String)sessionUser.getAttribute("name");
	    
	    List<Travel> travelList= dao.getTravel(name);
		
	    req.setAttribute("allTravels", travelList);
	    
	    RequestDispatcher rd= req.getRequestDispatcher("/seyehatlerim.jsp");
	   
	    rd.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
	    
	}
	
	
}
