package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Customer_complaintDao {

	
	 public static int save(Customer_complaint cc){  
		  
	        int status=0;  	
	        try{  
	            Connection con=Customer_infoDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into customer_complaint(complaint_name,complaint_type,complaint_desc,complaint_image,date) values (?,?,?,?,?)");  
	         
	            ps.setString(1,cc.getComplaint_name());  
	            ps.setString(2,cc.getComplaint_type());  
	            ps.setString(3,cc.getComplaint_desc());  	
	            ps.setString(4,cc.getComplaint_image());
	            ps.setString(5,cc.getDate());
	                 
	            status=ps.executeUpdate();   
	            System.out.println(status);
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }
	
	 
	 public static int view(String customer_id){  
		  
	        int status=0;  	
	        try{  
	            Connection con=Customer_infoDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from customer_complaint where customer_id='"+customer_id+"'");  
	         
	            		 ResultSet rs = ps.executeQuery();
	            		 while(rs.next())
	        	         {
	        	            String complaint_name=rs.getString("complaint_name");
	        	            String complaint_type=rs.getString("complaint_type");
	        	            String complaint_desc=rs.getString("complaint_desc");
	        	            String complaint_date=rs.getString("date");
	        	            String complaint_image=rs.getString("complaint_image");
	        	         }
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }
}
