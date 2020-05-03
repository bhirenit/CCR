<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <title>Index</title>
<%@ include file="header.html" %>
<div class="container mt-5 w3-border w3-topbar w3-bottombar w3-leftbar w3-rightbar rounded">
	<form action="SaveCustomerServlet" method="POST">
        <div class="container col-sm-3 mt-5">
        </div>
        <div>
	        <div class="container col-sm-6">
            	<div class="form-row">
                    <div class="col-sm-2">
	
	                </div>
	                <div class="md-form col col-sm">
	                  <i class="fa fa-user-circle prefix my-colour float-left" style="font-size: 25px;"></i>
	                    <input type="text" name="vehicle_number" class="form-control" required="required" >
	                    <label for="company">Company<span style="color: red">*</span></label>
	                </div>
	                <div class="col-sm-2">
	
	                </div>
	        	</div>
	        </div>
	        <div class="container col-sm-6">
            	<div class="form-row">
                    <div class="col-sm-2">
	
	                </div>
	                <div class="md-form col col-sm">
	                  <i class="fa fa-user-circle prefix my-colour float-left" style="font-size: 25px;"></i>
	                    <input type="text" name="model" class="form-control" required="required" >
	                    <label for="model">Model<span style="color: red">*</span></label>
	                </div>
	                <div class="col-sm-2">
	
	                </div>
	        	</div>
	        </div>
	                <div class="container col-sm-6">
            	<div class="form-row">
                    <div class="col-sm-2">
	
	                </div>
	                <div class="md-form col col-sm">
	                  <i class="fa fa-user-circle prefix my-colour float-left" style="font-size: 25px;"></i>
	                    <input type="text" name="varient" class="form-control" required="required" >
	                    <label for="varient">Varient<span style="color: red">*</span></label>
	                </div>
	                <div class="col-sm-2">
	
	                </div>
	        	</div>
	        </div>
	                <div class="container col-sm-6">
            	<div class="form-row">
                    <div class="col-sm-2">
	
	                </div>
	                <div class="md-form col col-sm">
	                  <i class="fa fa-user-circle prefix my-colour float-left" style="font-size: 25px;"></i>
	                    <input type="text" name="jobs" class="form-control" required="required" >
	                    <label for="jobs">Jobs<span style="color: red">*</span></label>
	                </div>
	                <div class="col-sm-2">
	
	                </div>
	        	</div>
	        </div>
	                <div class="container col-sm-6">
            	<div class="form-row">
                    <div class="col-sm-2">
	
	                </div>
	                <div class="md-form col col-sm">
	                  <i class="fa fa-user-circle prefix my-colour float-left" style="font-size: 25px;"></i>
	                    <input type="text" name="spareparts" class="form-control" required="required" >
	                    <label for="spareparts">SpareParts<span style="color: red">*</span></label>
	                </div>
	                <div class="col-sm-2">
	
	                </div>
	        	</div>
	        </div>
	                <div class="container col-sm-6">
            	<div class="form-row">
                    <div class="col-sm-2">
	
	                </div>
	                <div class="md-form col col-sm">
	                  <i class="fa fa-user-circle prefix my-colour float-left" style="font-size: 25px;"></i>
	                    <input type="text" name="oil" class="form-control" required="required" >
	                    <label for="oil">Oil<span style="color: red">*</span></label>
	                </div>
	                <div class="col-sm-2">
	
	                </div>
	        	</div>
	        </div>
        </div>
         <div class="form-row">
                <div class="col-sm-5">
                </div>
                <div class="col-sm mb-5">
                  <input type="submit" value="Submit" class="my-btn-box" name="register" id="register">
              </div>
              <div class="col-sm">
              </div>
          </div>
          <div class="container col-sm-3">
          </div>
      </div>
  </form>
                

</div>
<%@ include file="footer.html" %>





