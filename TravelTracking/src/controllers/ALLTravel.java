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
import model.Travel;
@WebServlet("/allTravelList")
public class ALLTravel extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeDAO dao = new EmployeeDAO();
		
		List<Travel> travelList =dao.getEmployeeTravel();
		
		req.setAttribute("allTravels", travelList);
		
		RequestDispatcher rd = req.getRequestDispatcher("/seyehatlerim.jsp");
		
		rd.forward(req, resp);
		
	}
}
