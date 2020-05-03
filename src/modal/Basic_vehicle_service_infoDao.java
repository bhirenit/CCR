package modal;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Basic_vehicle_service_infoDao {
	  public static int save(Basic_vehicle_service_info bvsi){  
	        int status=0;  
	        try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into basic_vehicle_service_info(vehicle_number,mechanic_id,running_km,lubricant_id,additional_complain_about_vehicle,services,parts,estimate_budget,delivery_time,advance_payment,final_amount,sms,status,arrival_time) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  
	            ps.setString(1,bvsi.getVehicle_number());
	            ps.setString(2, bvsi.getMechanic_id());
	            ps.setString(3,bvsi.getRunning_km()); 	
	            ps.setString(4,bvsi.getLubricant_id());
	            ps.setString(5,bvsi.getAdditional_complain_about_vehicle()); 
	            ps.setString(6,bvsi.getServices());
	            ps.setString(7,bvsi.getParts());
	            ps.setInt(8,bvsi.getEstimate_budget());  
	            ps.setString(9,bvsi.getDelivery_time());  
	            ps.setInt(10,bvsi.getAdvance_payment());
	            ps.setInt(11,bvsi.getFinal_amount());
	            ps.setInt(12,bvsi.getSms());
	            ps.setString(13,bvsi.getStatus());
	            ps.setString(14,bvsi.getArrival_time());
	          
	            status=ps.executeUpdate();      
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    } 
	 public static List<Basic_vehicle_service_info> getPendingDetails()
	 {
		 List<Basic_vehicle_service_info> list=new ArrayList<Basic_vehicle_service_info>();  
	        try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps = con.prepareStatement("select * from basic_vehicle_service_info where status='pending'") ;
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){  
	            	Basic_vehicle_service_info bvsi = new Basic_vehicle_service_info();
	            	bvsi.setVehicle_number(rs.getString(1));
	            	bvsi.setMechanic_id(rs.getString(2));
	            	bvsi.setRunning_km(rs.getString(3));
	            	bvsi.setLubricant_id(rs.getString(4));
	            	bvsi.setAdditional_complain_about_vehicle(rs.getString(5));
	            	bvsi.setServices(rs.getString(6));
	            	bvsi.setParts(rs.getString(7));
	            	bvsi.setEstimate_budget(rs.getInt(8));
	            	bvsi.setDelivery_time(rs.getString(9));
	            	bvsi.setAdvance_payment(rs.getInt(10));
	            	bvsi.setFinal_amount(rs.getInt(11));
	            	bvsi.setSms(rs.getInt(12));
	            	bvsi.setStatus(rs.getString(13));
	            	bvsi.setArrival_time(rs.getString(14));
	            	list.add(bvsi);
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}   
		 return list;
	 }
	 public static List<Basic_vehicle_service_info> getCompletedDetails()
	 {
		 List<Basic_vehicle_service_info> list=new ArrayList<Basic_vehicle_service_info>();  
	        try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps = con.prepareStatement("select * from basic_vehicle_service_info where status='completed'") ;
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){  
	            	Basic_vehicle_service_info bvsi = new Basic_vehicle_service_info();
	            	bvsi.setVehicle_number(rs.getString(1));
	            	bvsi.setMechanic_id(rs.getString(2));
	            	bvsi.setRunning_km(rs.getString(3));
	            	bvsi.setLubricant_id(rs.getString(4));
	            	bvsi.setAdditional_complain_about_vehicle(rs.getString(5));
	            	bvsi.setServices(rs.getString(6));
	            	bvsi.setParts(rs.getString(7));
	            	bvsi.setEstimate_budget(rs.getInt(8));
	            	bvsi.setDelivery_time(rs.getString(9));
	            	bvsi.setAdvance_payment(rs.getInt(10));
	            	bvsi.setFinal_amount(rs.getInt(11));
	            	bvsi.setSms(rs.getInt(12));
	            	bvsi.setStatus(rs.getString(13));
	            	bvsi.setArrival_time(rs.getString(14));
	            	list.add(bvsi);
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}   
		 return list;
	 }
	 public static Basic_vehicle_service_info getByNumber(String vehicle_number)
	 {
		Basic_vehicle_service_info bvsi=new Basic_vehicle_service_info();  
	        try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps = con.prepareStatement("select * from basic_vehicle_service_info where vehicle_number='"+vehicle_number+"'") ;
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){  
	            	bvsi.setVehicle_number(rs.getString(1));
	            	bvsi.setMechanic_id(rs.getString(2));
	            	bvsi.setRunning_km(rs.getString(3));
	            	bvsi.setLubricant_id(rs.getString(4));
	            	bvsi.setAdditional_complain_about_vehicle(rs.getString(5));
	            	bvsi.setServices(rs.getString(6));
	            	bvsi.setParts(rs.getString(7));
	            	bvsi.setEstimate_budget(rs.getInt(8));
	            	bvsi.setDelivery_time(rs.getString(9));
	            	bvsi.setAdvance_payment(rs.getInt(10));
	            	bvsi.setFinal_amount(rs.getInt(11));
	            	bvsi.setSms(rs.getInt(12));
	            	bvsi.setStatus(rs.getString(13));
	            	bvsi.setArrival_time(rs.getString(14));
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}   
		 return bvsi;
	 }
	public static void updateSetCompletedByNumber(String vehicle_number) {
		 try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps = con.prepareStatement("update basic_vehicle_service_info set status = 'completed' where vehicle_number='"+vehicle_number+"'") ;
	            int i = ps.executeUpdate();
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}   
	}
	public static void deleteRowByNumber(String vehicle_number) {
		 try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps = con.prepareStatement("delete from basic_vehicle_service_info where vehicle_number='"+vehicle_number+"'") ;
	            int i = ps.executeUpdate();
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}
	}
	
	public static List<String> getTokenizerString(String demo)
	 {
		 List<String> list=new ArrayList<>();
		 StringTokenizer st = new StringTokenizer(demo);  
	     while (st.hasMoreTokens()) {  
	    	 String token = st.nextToken(",");
	         list.add(token);
	     }
	     return list;
	 }
	public static int update(Basic_vehicle_service_info bvsi) {
		 int status=0;  
	        try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "update  basic_vehicle_service_info set mechanic_id='"+bvsi.getMechanic_id()+"' , lubricant_id = '"+bvsi.getLubricant_id()+"' , services = '"+bvsi.getServices()+"' , parts = '"+bvsi.getParts()+"' , estimate_budget = '"+bvsi.getEstimate_budget()+"' , delivery_time = '"+bvsi.getDelivery_time()+"' , final_amount = '"+bvsi.getFinal_amount()+"' , status = 'pending' , arrival_time = '"+bvsi.getArrival_time()+"' where vehicle_number = '"+bvsi.getVehicle_number()+"'");  
	            status=ps.executeUpdate();      
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status; 
	}
	public static int getTotalPendingCars() { 
		int count=0;
		try{  
		            Connection con=Vehicle_companyDao.getConnection();  
		            PreparedStatement ps = con.prepareStatement("select count(*) from basic_vehicle_service_info where status = 'pending'") ;
		            ResultSet rs = ps.executeQuery();
		            while(rs.next()){  
		            	  count=rs.getInt(1);
		            }  
		            con.close();  
		        }catch(Exception e){e.printStackTrace();}
				return count;
			}
	public static int getTotalCompletedCars() { 
		int count1=0;
		try{  
		            Connection con=Vehicle_companyDao.getConnection();  
		            PreparedStatement ps = con.prepareStatement("select count(*) from basic_vehicle_service_info where status = 'completed'") ;
		            ResultSet rs = ps.executeQuery();
		            while(rs.next()){  
		            	  count1=rs.getInt(1);
		            }  
		            con.close();  
		        }catch(Exception e){e.printStackTrace();}
				return count1;
			}
	public static List<Basic_vehicle_service_info> getRevenueByDate()
	 {
		 List<Basic_vehicle_service_info> list=new ArrayList<Basic_vehicle_service_info>();  
	        try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps = con.prepareStatement("SELECT DATE(`delivery_time`) AS date,COUNT(DATE(`delivery_time`)) as count, SUM(`final_amount`) as total FROM `history` GROUP BY (DATE(`delivery_time`)) ORDER BY DATE(`delivery_time`) DESC") ;
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){  
	            	Basic_vehicle_service_info bvsi = new Basic_vehicle_service_info();
	            	bvsi.setDelivery_time(rs.getString(1));
	            	bvsi.setEstimate_budget(rs.getInt(2));
	            	bvsi.setFinal_amount(rs.getInt(3));
	            	list.add(bvsi);
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}   
		 return list;
	 }
}


