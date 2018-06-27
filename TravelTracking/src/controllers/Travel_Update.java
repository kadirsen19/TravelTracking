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
import model.Travel;

@WebServlet("/updateTravel")
public class Travel_Update extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeDAO dao= new EmployeeDAO();
		
		HttpSession session = req.getSession();
		
		int id = (int) session.getAttribute("travelId");
		String userName = (String) session.getAttribute("name");
		
		String travelPlace = req.getParameter("place");
		String reason = req.getParameter("reason");
		String departureDate = req.getParameter("departureDate");
		String returnDate = req.getParameter("returnDate");
		
		dao.updateTravel(id, travelPlace, reason, departureDate, returnDate);
		
		session.removeAttribute("travelId");
		
		List<Travel> travelList = dao.getTravel(userName);
		req.setAttribute("allTravels", travelList);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/seyehatlerim.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeDAO dao = new EmployeeDAO();
		
		int id = Integer.parseInt(req.getParameter("travelId"));
		Travel travel =dao.findTravelById(id);
		HttpSession session = req.getSession();
		session.setAttribute("travelId", travel.getIdtavel());
		req.setAttribute("travels", travel);
	    
	    RequestDispatcher rd= req.getRequestDispatcher("/updateSeyehatFormu.jsp");
	   
	    rd.forward(req, resp);
	}
}
