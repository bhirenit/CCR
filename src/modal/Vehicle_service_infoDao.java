package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Vehicle_service_infoDao {
	  public static int save(Vehicle_service_info vs){  
	        int status=0;  
	        try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into basic_vehicle_service_info(running_km,oil,additional_complain_about_vehicle,estimate_budget,delivery_time,advance_payment,vehicle_number) values (?,?,?,?,?,?,?)");  
	            ps.setString(1,vs.getRunning_km()); 
	            ps.setString(2,vs.getOil());
	            ps.setString(3,vs.getAdditional_complain_about_vehicle());  
	            ps.setString(4,vs.getEstimate_budget());  
	            ps.setString(5,vs.getDelivery_time());  
	            ps.setString(6,vs.getAdvance_payment());
	            ps.setString(7,vs.getVehicle_number());
	              
	            status=ps.executeUpdate();      
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
}
