<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <title>Index</title>
<%@ include file="header.html" %>
<div class="container mt-5 w3-border w3-topbar w3-bottombar w3-leftbar w3-rightbar rounded">
    <div class="col">
        <h4 class="h4 text-center sm-5" style="font-weight:normal; font-variant:small-caps; font-size:25px; font-color:#001233">Login</h4>
    </div>
<form method="post" action="Savev">
<div class="container col-sm-3 mt-5">
<div class="form-row">
                <div class="col-sm-3">
                </div>
      	<div class="md-form col col-sm">
              <i class="fa fa-user prefix my-colour float-left" style="font-size: 25px;"></i>
                <input type="text" name="customer_username" class="form-control"  required="required">
                <label for="Customer_id">User Name<span style="color: red">*</span></label>
            </div>
        </div>
        <div class="form-row">
                <div class="col-sm-3">
                </div>
        <div class="md-form col col-sm">
              <i class="fa fa-user prefix my-colour float-left" style="font-size: 25px;"></i>
                <input type="password" name="customer_password" class="form-control"  required="required">
                <label for="Customer_password">Password<span style="color: red">*</span></label>
            </div>
        </div>
        
        <div class="form-row">
                <div class="col-sm-5">
                </div>
                <div class="col-sm mb-5">
                  <input type="submit" value="Submit" class="my-btn-box" name="register" id="register">
              </div>
           
              <div class="form-row">
              <br><br>
                <div class="col-sm">
                </div>
        		<div class="md-form col col-sm">
              <!-- <i class="fa fa-user prefix my-colour float-left" style="font-size: 25px;"></i> -->
                <a href="customerinfo.jsp" class="form-control">New Registration</a>
            </div>
        </div>
              
              
              
            <!--   <div class="form-row">
             <div class="md-form col col-sm">
                 <div class="col-sm-5">
                </div>
                <a href="customerinfo.jsp" class="form-control">New Registration</a>
                </i>
                </div>
                </div> -->
              <div class="col-sm">
              </div>
          </div>
          <div class="container col-sm-3">
          </div>
      </div>
  </form>
<%@ include file="footer.html" %>
