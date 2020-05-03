package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HistoryDao {

	public static int save(History h){  
        int status=0;  
        try{  
            Connection con=Vehicle_companyDao.getConnection();
            PreparedStatement ps=con.prepareStatement(  
                         "insert into history(vehicle_number,services,parts,arrival_time,delivery_time,mechanic_id,total_amount,advance_payment,final_amount,status,running_km,lubricant_id,additional_complain_about_vehicle) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");  
            ps.setString(1,h.getVehicle_number());
            ps.setString(2, h.getServices());
            ps.setString(3, h.getParts()); 
            ps.setString(4, h.getArrival_time()); 
            ps.setString(5,h.getDelivery_time()); 
            ps.setString(6, h.getMechanic_id());
            ps.setInt(7, h.getTotal_amount());
            ps.setInt(8,h.getAdvance_payment());
            ps.setInt(9,h.getFinal_amount());
            ps.setString(10,h.getStatus());
            ps.setString(11, h.getRunning_km());
            ps.setString(12,h.getLubricant_id());
            ps.setString(13,h.getAdditional_complain_about_vehicle());
            status=ps.executeUpdate();      
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
	public static List<History> getAll(){
		 List<History> list=new ArrayList<History>();  
	        try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps = con.prepareStatement("select * from history") ;
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){  
	            	History h = new History();
	            	h.setVehicle_number(rs.getString(1));
	            	h.setServices(rs.getString(2));
	            	h.setParts(rs.getString(3));
	            	h.setArrival_time(rs.getString(4));
	            	h.setDelivery_time(rs.getString(5));
	            	h.setMechanic_id(rs.getString(6));
	            	h.setTotal_amount(rs.getInt(7));
	            	h.setAdvance_payment(rs.getInt(8));
	            	h.setFinal_amount(rs.getInt(9));
	            	h.setStatus(rs.getString(10));
	            	h.setRunning_km(rs.getString(11));
	            	h.setLubricant_id(rs.getString(12));
	            	h.setAdditional_complain_about_vehicle(rs.getString(13));
	            	list.add(h);
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}   
		 return list;
	 }
	public static List<History> getAllByNumber(String vehicle_number){
		 List<History> list=new ArrayList<History>();  
	        try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps = con.prepareStatement("select * from history where vehicle_number='"+vehicle_number+"' order by arrival_time desc") ;
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){  
	            	History h = new History();
	            	h.setVehicle_number(rs.getString(1));
	            	h.setServices(rs.getString(2));
	            	h.setParts(rs.getString(3));
	            	h.setArrival_time(rs.getString(4));
	            	h.setDelivery_time(rs.getString(5));
	            	h.setMechanic_id(rs.getString(6));
	            	h.setTotal_amount(rs.getInt(7));
	            	h.setAdvance_payment(rs.getInt(8));
	            	h.setFinal_amount(rs.getInt(9));
	            	h.setStatus(rs.getString(10));
	            	h.setRunning_km(rs.getString(11));
	            	h.setLubricant_id(rs.getString(12));
	            	h.setAdditional_complain_about_vehicle(rs.getString(13));
	            	list.add(h);
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}   
		 return list;
	 }
	 public static History getByNumber(String vehicle_number)
	 {
		History h = new History();  
	        try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps = con.prepareStatement("select * from history where vehicle_number='"+vehicle_number+"'") ;
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){  
	            	h.setVehicle_number(rs.getString(1));
	            	h.setServices(rs.getString(2));
	            	h.setParts(rs.getString(3));
	            	h.setArrival_time(rs.getString(4));
	            	h.setDelivery_time(rs.getString(5));
	            	h.setMechanic_id(rs.getString(6));
	            	h.setTotal_amount(rs.getInt(7));
	            	h.setAdvance_payment(rs.getInt(8));
	            	h.setFinal_amount(rs.getInt(9));
	            	h.setStatus(rs.getString(10));
	            	h.setRunning_km(rs.getString(11));
	            	h.setLubricant_id(rs.getString(12));
	            	h.setAdditional_complain_about_vehicle(rs.getString(13));
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}   
		 return h;
	 }
	 public static int getTotalClosedCars() { 
			int count=0;
			try{  
			            Connection con=Vehicle_companyDao.getConnection();  
			            PreparedStatement ps = con.prepareStatement("select count(*) from history ") ;
			            ResultSet rs = ps.executeQuery();
			            while(rs.next()){  
			            	  count=rs.getInt(1);
			            }  
			            con.close();  
			        }catch(Exception e){e.printStackTrace();}
					return count;
				}
	 public static int getTotalRevenueAll() 
	 {
		 int total = 0;
		 try{  
	            Connection con=Vehicle_companyDao.getConnection();  
	            PreparedStatement ps = con.prepareStatement("select sum(final_amount) from history") ;
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){  
	            	total = rs.getInt(1);
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}
		 
		 return total;
	 }
}
