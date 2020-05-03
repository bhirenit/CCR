package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Customer_infoDao {
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ccr","root","");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
	  public static int save(Customer_info ci){  
		  
	        int status=0;  	
	        try{  
	            Connection con=Customer_infoDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into customer_details(customer_name,customer_mobile,customer_email,customer_username,customer_password,customer_aadhaar,customer_address) values (?,?,?,?,?,?,?)");  
	         
	            ps.setString(1,ci.getCustomer_name());  
	            ps.setString(2,ci.getCustomer_mobile());  
	            ps.setString(3,ci.getCustomer_email());  	
	            ps.setString(4, ci.getCustomer_username());
	            ps.setString(5, ci.getCustomer_password());
	            ps.setString(6, ci.getCustomer_aadhaar()); 
	            ps.setString(7, ci.getCustomer_address());
	            
	            status=ps.executeUpdate();   
	            System.out.println(status);
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }
	  
	  
	  public static boolean check(String customer_username ,String customer_password){  
		  
		  boolean status=false;	
	        try{
				 Connection con=Customer_infoDao.getConnection();  
		         PreparedStatement ps=con.prepareStatement("select * from customer_details where  customer_username=? ,customer_password=? ");
		         ps.setString(1,customer_username);  
		         ps.setString(2,customer_password);  
		         ResultSet rs = ps.executeQuery();
		         status=rs.next();  
		         System.out.println(status);
				}catch(Exception e){e.printStackTrace();}
	          
	        return status;  
	    }

//	public static String getNameByNumber(String vehicle_number) {
//			String customer_name = null;
//			try{
//			 Connection con=Vehicle_companyDao.getConnection();  
//	         PreparedStatement ps=con.prepareStatement("select customer_name from customer_info where vehicle_number ='"+vehicle_number+"'");
//	         ResultSet rs = ps.executeQuery();
//	         while(rs.next())
//	         {
//	         customer_name = rs.getString("customer_name");
//	         }
//			}catch(Exception e){e.printStackTrace();}
//		return customer_name;
//	}  
//	public static Customer_info getByNumber(String vehicle_number)
//	{
//		Customer_info ci = new Customer_info();
//		try{
//			 Connection con=Vehicle_companyDao.getConnection();  
//	         PreparedStatement ps=con.prepareStatement("select * from customer_info where vehicle_number ='"+vehicle_number+"'");
//	         ResultSet rs = ps.executeQuery();
//	         while(rs.next())
//	         {
//	         	ci.setCustomer_name(rs.getString(1));
//	         	ci.setCustomer_mobile_number(rs.getString(2));
//	         	ci.setCustomer_email(rs.getString(3));
//	         	ci.setVehicle_number(vehicle_number);
//	         	ci.setCustomer_id(rs.getInt(5));
//	         }
//			}catch(Exception e){e.printStackTrace();}
//		return ci;
//	}
}
