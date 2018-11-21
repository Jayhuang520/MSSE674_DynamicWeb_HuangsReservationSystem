package com.huangsreservationsystem.controller.servlet.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huangsreservationsystem.business.LoginManager;
import com.huangsreservationsystem.model.domain.CustomerBean;
import com.huangsreservationsystem.model.domain.LoginBean;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8095282046652575492L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
	}


	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		LoginBean loginBean = new LoginBean();
		
		
		String userName = req.getParameter("username");
		String password = req.getParameter("password");

		loginBean.setUserName(userName);
		loginBean.setPassword(password);
		
		CustomerBean customer = LoginManager.authenticateLogin(loginBean);
		
		// process the data
		//Put the customer bean into the request mode
		//req.setAttribute("customer", customer);
		
		//Place the customer object in the session mode
//		HttpSession session = req.getSession();
//		session.setAttribute("customer", loginBean);
//		
//		req.getSession().setAttribute("customer", loginBean);
		
		// generate a response
		if(customer != null) {
//			res.sendRedirect("welcome.html");
			
			req.setAttribute("customer", customer);
			
			getServletContext().getRequestDispatcher("/welcome").forward(req, res);
			
//			res.sendRedirect("welcome.html");
		}else {
			getServletContext().getRequestDispatcher("/error").forward(req, res);
			//res.sendRedirect("loginError.html");
		}
	}
	
}