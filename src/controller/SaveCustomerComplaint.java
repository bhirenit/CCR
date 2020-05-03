package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modal.Customer_complaint;
import modal.Customer_complaintDao;

/**
 * Servlet implementation class SaveCustomerComplaint
 */
@WebServlet("/SaveCustomerComplaint")
public class SaveCustomerComplaint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveCustomerComplaint() {
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
	        PrintWriter out=response.getWriter();  
	        String complaint_name=request.getParameter("complaint_name");  
	        String complaint_type=request.getParameter("complaint_type"); 
	        String complaint_desc=request.getParameter("complaint_desc"); 
	        String complaint_date=request.getParameter("complaint_date"); 
	        String complaint_image=request.getParameter("complaint_image"); 
	        
	        
	       Customer_complaint cc=new Customer_complaint();
	    		   cc.setComplaint_name(complaint_name);
	    		   cc.setComplaint_type(complaint_type);
	    		   cc.setComplaint_desc(complaint_desc);
	    		   cc.setDate(complaint_date);
	    		   cc.setComplaint_image(complaint_image);
	    		   
	    		   int status=Customer_complaintDao.save(cc);
	    		   if(status>0){  
	    		            out.print("<p>Record saved successfully!</p>");  
	    		            response.sendRedirect("status.jsp");  
	    		        }else{  
	    		            out.println("Sorry! unable to save record");  
	    		        }  		   
	        
	
		
	}

}
