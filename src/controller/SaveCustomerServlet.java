package controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modal.Customer_info;
import modal.Customer_infoDao;


/**
 * Servlet implementation class SaveCustomerServlet
 */
@WebServlet("/SaveCustomerServlet")
public class SaveCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        String customer_name=request.getParameter("customer_name");  
	        String customer_mobile=request.getParameter("customer_mobile");  
	        String customer_email=request.getParameter("customer_email");  
	        String customer_username=request.getParameter("customer_username");  
	        String customer_password=request.getParameter("customer_password");  
	        String customer_aadhaar=request.getParameter("customer_aadhaar");
	        String customer_address=request.getParameter("customer_address"); 
	        	
	        
	        Customer_info ci=new Customer_info();  
	       ci.setCustomer_name(customer_name);
	       ci.setCustomer_mobile(customer_mobile);
	       ci.setCustomer_email(customer_email);
	      ci.setCustomer_username(customer_username);
	      ci.setCustomer_password(customer_password);
	      ci.setCustomer_aadhaar(customer_aadhaar);
	      ci.setCustomer_address(customer_address);
	       
	       
	        int status=Customer_infoDao.save(ci);  
	        if(status>0){  
	        HttpSession session = request.getSession();
  	      // 	session.setAttribute("username", );
  	       //	session.setAttribute("customer_name", customer_name);
	            out.print("<p>Record saved successfully!</p>");  
	            response.sendRedirect("addcomplaint.jsp");  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        out.close();  
	}

}
