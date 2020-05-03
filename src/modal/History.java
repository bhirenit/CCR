package modal;

public class History {
	private String delivery_time,vehicle_number,services,parts,status,mechanic_id,arrival_time,additional_complain_about_vehicle,lubricant_id,running_km;
	private int total_amount,advance_payment,final_amount;
	public String getAdditional_complain_about_vehicle() {
		return additional_complain_about_vehicle;
	}
	public void setAdditional_complain_about_vehicle(String additional_complain_about_vehicle) {
		this.additional_complain_about_vehicle = additional_complain_about_vehicle;
	}
	public String getLubricant_id() {
		return lubricant_id;
	}
	public void setLubricant_id(String lubricant_id) {
		this.lubricant_id = lubricant_id;
	}
	public String getDelivery_time() {
		return delivery_time;
	}
	public String getRunning_km() {
		return running_km;
	}
	public void setRunning_km(String running_km) {
		this.running_km = running_km;
	}
	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}
	public String getVehicle_number() {
		return vehicle_number;
	}
	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getParts() {
		return parts;
	}
	public void setParts(String parts) {
		this.parts = parts;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMechanic_id() {
		return mechanic_id;
	}
	public void setMechanic_id(String mechanic_id) {
		this.mechanic_id = mechanic_id;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	public int getAdvance_payment() {
		return advance_payment;
	}
	public void setAdvance_payment(int advance_payment) {
		this.advance_payment = advance_payment;
	}
	public int getFinal_amount() {
		return final_amount;
	}
	public void setFinal_amount(int final_amount) {
		this.final_amount = final_amount;
	}
	
}
