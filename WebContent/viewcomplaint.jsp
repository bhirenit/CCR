
<%@page import="java.util.List"%>
<%@page import="modal.Customer_infoDao"%>
<%@page import="modal.Customer_info"%>
<%@page import="modal.Basic_vehicle_service_infoDao"%>
<%@page import="modal.Basic_vehicle_service_info"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <title>Show</title>
<%@ include file="header.html" %>
		
<div class="container mt-5 w3-border w3-topbar w3-bottombar w3-leftbar w3-rightbar rounded">
		<div class="col">
			<h4 class="h4 text-center mt-5" style="font-weight:normal; font-variant:small-caps; font-size:25px; font-color:#001233">Completed Details</h4>
		</div>
			<div class="container col-sm-3 mt-5">
			</div>
			<div class="container col-sm">
		</div>
				<div class="container col-sm">
					<div class="form-row">
						<div class="md-form  col-sm">
							<span for="name"> Name: abc </span>
						</div>
						
						<div class="md-form col-sm-5">
								<span for="additionalcomplain">Complain : </span>
						</div>
					</div>
				</div>
				
				<div class="container col-sm">
					<div class="form-row">
						<div class="md-form col-sm">
							<span for="Customer_mobile_number">Contact Number: 9879422306 </span>
						</div>
						
						<div class="md-form col-sm-5">
								<span for="additionalcomplain">Complain type : </span>
						</div>
					
					</div>
				</div>

				<div class="container col-sm">
					<div class="form-row">
						<div class="md-form col-sm">
							<span for="emailid">Email-id: abc@gmail.com </span>
						</div>
						<div class="md-form col-sm-5">
								<span for="additionalcomplain">Complain Date: </span>
						</div>
						</div>
						</div>
						
						
						<div class="container col-sm">
					<div class="form-row">
						<div class="md-form col-sm">
							<span for="emailid">Aadhaar Card No:</span>
						</div>
						
						<div class="md-form col-sm-5">
								<span for="additionalcomplain">Status : </span>
						</div>
						</div>
						</div>
						
						
						<div class="container col-sm">
					<div class="form-row">
						<div class="md-form col-sm">
							<span for="emailid">Address :</span>
						</div>
						<div class="md-form col-sm-5">
								<span for="additionalcomplain">Complain desc : </span>
						</div>
						</div>
						</div>
					
					
					
					<div class="container col-sm">
						<div class="form-row">
							<div class="col-sm">
							</div>
							<div class="col-sm mb-5">

								<% out.print("<a href='edit_page.jsp?id class='my-btn-box' style='margin-left:80px;'>Apporoved</a>"); %>							
							</div>
							<div class="col-sm">

							</div>
						</div>
						<div class="container col-sm-3">
						</div>
						<div class="form-row">
							<div class="col-sm mb-5">
							
							</div>
						</div>
					</div>

</div>


</div>
</div>

<%@ include file="footer.html" %>