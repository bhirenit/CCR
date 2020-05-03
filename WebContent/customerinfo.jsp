<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<title>Customer Info</title>	
<%@ include file="header.html" %>

<div class="container mt-5 w3-border w3-topbar w3-bottombar w3-leftbar w3-rightbar rounded">
    <div class="col">
        <h4 class="h4 text-center mt-5" style="font-weight:normal; font-variant:small-caps; font-size:25px; font-color:#001233">Registration</h4>
    </div>

    <form action="SaveCustomerServlet" method="POST">
        <div class="container col-sm-3 mt-5">
        </div>
        <div class="container col-sm-6">
            
                <div class="col-sm-1">

                </div>
                <div class="md-form col col-sm">
                  <i class="fa fa-user prefix my-colour float-left" style="font-size: 25px;"></i>
                    <input type="text" name="customer_name" class="form-control" required="required">
                    <label for="customername">Customer Name<span style="color: red">*</span></label>
                </div>
            </div>
            <div class="form-row">
                <div class="md-form col col-sm">
                   <i class="fa fa-mobile prefix my-colour float-left" style="font-size: 25px;"></i>
                    <input type="number" name="customer_mobile" class="form-control" required="required" pattern="[0-9]{10}" maxlength="10" minlength="10">
                    <label for="contact_no">Contact Number<span style="color: red">*</span></label>
                </div>
                <div class="col-sm-1">

                </div>
                <div class="md-form col col-sm">
                  <i class="fa fa-envelope-square prefix my-colour float-left" style="font-size: 25px;"></i>
                    <input type="text" name="customer_email" class="form-control" required="required" pattern="[a-z0-9]{1,30}[@]+[a-z]{1,10}[.]+[a-z.]{1,10}" maxlength="35">
                    <label for="emailid">Email-ID<span style="color: red">*</span></label>
                </div>
            </div>
            
            <div class="form-row">
                <div class="md-form col col-sm">
                  <i class="fa fa-user-circle prefix my-colour float-left" style="font-size: 25px;"></i>
                    <input type="text" name="customer_username" class="form-control" value="" required="required" >
                    <label for="customer_id">User Name<span style="color: red">*</span></label>
                </div>
                <div class="col-sm-1">

                </div>
                <div class="md-form col col-sm">
                  <i class="fa fa-user-circle prefix my-colour float-left" style="font-size: 25px;"></i>
                    <input type="password"  name="customer_password" class="form-control" value="" required="required" >
                    <label for="password">password<span style="color: red">*</span></label>
                </div>
           </div>
            <div class="form-row">
                <div class="md-form col col-sm">
                   <i class="fa fa-mobile prefix my-colour float-left" style="font-size: 25px;"></i>
                    <input type="text" name="customer_address" class="form-control" required="required">
                    <label for="address">Address<span style="color: red">*</span></label>
                </div>
                <div class="col-sm-1">

                </div>
                <div class="md-form col col-sm">
                  <i class="fa fa-envelope-square prefix my-colour float-left" style="font-size: 25px;"></i>
                    <input type="number" name="customer_aadhaar" class="form-control" required="required"  maxlength="12">
                    <label for="aadhaar">Aadhaar Card Number<span style="color: red">*</span></label>
                </div>
            </div>
            
           
            <div class="form-row">
                <div class="col col-sm text-center">
                    <span style="color: red">*</span><small style="color: red;text-align: center;"> Fields are mandatory</small>
                </div>
            </div><br>
            <div class="form-row">
                <div class="col-sm-5">
                </div>
                <div class="col-sm mb-5">
                  <input type="submit" value="REGISTER" class="my-btn-box" name="register" id="register">
              </div>
              <div class="col-sm">
              </div>
          </div>
          <div class="container col-sm-3">
          </div>
      </div>
  </form>
</div>
<div class="container col-sm-1">
</div>
</div>
<%@ include file="footer.html" %>