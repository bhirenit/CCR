package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modal.Customer_info;
import modal.Vehicle_infoDao;
import modal.Vehicle_lubricant_detailsDao;
import modal.Vehicle_part_detailsDao;
import modal.Vehicle_service_detailsDao;
import modal.Basic_vehicle_service_info;
import modal.Basic_vehicle_service_infoDao;

/**
 * Servlet implementation class VehicleServiceServlet
 */
@WebServlet("/VehicleServiceServlet")
public class VehicleServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehicleServiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        HttpSession session = request.getSession();
	        String running_km=request.getParameter("running_km");
	        String mechanic_id = request.getParameter("mechanic_id");
	        String additional_complain_about_vehicle=request.getParameter("additional_complain_about_vehicle");
	        int estimate_budget=Integer.parseInt(request.getParameter("estimate_budget"));
	        String delivery_time=request.getParameter("delivery_time");
	        int advance_payment=Integer.parseInt(request.getParameter("advance_payment"));
	        int final_amount = estimate_budget - advance_payment;
	        String status ="pending";
	        int sms =Integer.parseInt(request.getParameter("sms"));
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	        LocalDateTime now = LocalDateTime.now();
	        String arrival_time = dtf.format(now);
	        String vehicle_number = (String) session.getAttribute("vehicle_number");
	        
	        String model_varient_id = Vehicle_infoDao.getVarientByNumber(vehicle_number);
	        List<String> partList = Vehicle_part_detailsDao.getPartList(model_varient_id);
	        Iterator<String> itr = partList.iterator();
	        String parts = null;
			while (itr.hasNext()) {
				String part = itr.next();
				String tmpart = request.getParameter(part);
				if(tmpart!=null)
				{
					if(parts!=null)
					{
						parts = parts + "," +tmpart;
					}else{
						parts = tmpart ;
					}
				}
			}
			 List<String> serviceList = Vehicle_service_detailsDao.getServiceList(model_varient_id);
		        Iterator<String> itr1 = serviceList.iterator();
		        String services = null;
				while (itr1.hasNext()) {
					String service = itr1.next();
					String tmservice = request.getParameter(service);
					if(tmservice!=null)
					{
						if(services!=null)
						{
							services = services + "," +tmservice;
						}else{
							services = tmservice ;
						}
					}
				}
				 List<String> lubricantList = Vehicle_lubricant_detailsDao.getLubricantList(model_varient_id);
			        Iterator<String> itr2 = lubricantList.iterator();
			        String lubricants = null;
					while (itr2.hasNext()) {
						String lubricant = itr2.next();
						String tmlubricant = request.getParameter(lubricant);
						if(tmlubricant!=null)
						{
							if(lubricants!=null)
							{
								lubricants = lubricants + "," +tmlubricant;
							}else{
								lubricants = tmlubricant ;
							}
						}
					}
	        
	        Basic_vehicle_service_info bvsi=new Basic_vehicle_service_info();  
	        bvsi.setArrival_time(arrival_time);
	        bvsi.setMechanic_id(mechanic_id);
	        bvsi.setSms(sms);
	        bvsi.setRunning_km(running_km);
	        bvsi.setLubricant_id(lubricants);
	        bvsi.setAdditional_complain_about_vehicle(additional_complain_about_vehicle);
	        bvsi.setServices(services);
	        bvsi.setParts(parts);
	        bvsi.setEstimate_budget(estimate_budget);
	        bvsi.setDelivery_time(delivery_time);
	        bvsi.setAdvance_payment(advance_payment);
	        bvsi.setFinal_amount(final_amount);
	        bvsi.setStatus(status);
	        bvsi.setVehicle_number(vehicle_number);
	        int status1 = Basic_vehicle_service_infoDao.save(bvsi);
	        if(status1>0){  
	            request.getRequestDispatcher("jobcardlist.jsp").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        out.close(); 
	    
	}

}
