package webAppServlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/myFirst")
public class MyFirstServlet extends HttpServlet{
//
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		System.out.println("inside init method");
//		
//	}
//
//	@Override
//	public ServletConfig getServletConfig() {
//		System.out.println("inside servlet config");
//		return null;
//	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		System.out.println("inside service");
//		res.getWriter().write("Hello from servlet");
		res.sendRedirect("https://www.geeksforgeeks.org/servlet-sendredirect-method-with-example/");
		
	}

//	@Override
//	public String getServletInfo() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void destroy() {
//		System.out.println("inside destroy method");
//		
//	}

}
