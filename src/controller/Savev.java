package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modal.Customer_infoDao;

/**
 * Servlet implementation class Savev
 */
@WebServlet("/Savev")
public class Savev extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Savev() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		 response.setContentType("text/html");  
		 HttpSession session = request.getSession();
	        PrintWriter out=response.getWriter();  
	      
	        String username=request.getParameter("customer_username");
	        String password=request.getParameter("customer_password");
	        
	       boolean status=Customer_infoDao.check(username,password);
	       System.out.println(status);
	        if(status)
	        {	
	        	response.sendRedirect("addcomplaint.jsp");
	        }else{
	        request.getRequestDispatcher("customerinfo.jsp").forward(request, response); 
	        }
	}

}
