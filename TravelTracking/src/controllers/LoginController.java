package controllers;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import connection.MysqlConnection;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	public static final String LOGIN = "SELECT * FROM employee where userName= ? and userPassword= ?";

	MysqlConnection conn = new MysqlConnection();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String employeeName = null, employeeSurname=null, u=null, p=null, r=null;

		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		RequestDispatcher dispatcher = null;
		Connection baglanti = conn.DBConnection();
		try {
			PreparedStatement ps = (PreparedStatement) baglanti.prepareStatement(LOGIN);
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				employeeName = resultSet.getString("employeeName");
				employeeSurname = resultSet.getString("employeeSurname");
				u = resultSet.getString("userName");
				p = resultSet.getString("userPassword");
				r = resultSet.getString("userRole");
			}
			if(u==null || p==null){

				dispatcher = req.getRequestDispatcher("/login.jsp");
				dispatcher.forward(req, resp);

			}
			else if (u.equals(user) && p.equals(pass)) {

				HttpSession session = req.getSession();
				session.setAttribute("userPassword", p);
				session.setAttribute("userRole", r);
				session.setAttribute("name", u);
				session.setAttribute("employeename", employeeName);
				session.setAttribute("employeesurname", employeeSurname);

				dispatcher = req.getRequestDispatcher("/indexAdmin.jsp");
				dispatcher.forward(req, resp);

			}

			

		} catch (SQLException e) {
			System.out.println("Kiþi bilgileri alýnýrken Hata oluþtu" + e);

		}

	}
}
