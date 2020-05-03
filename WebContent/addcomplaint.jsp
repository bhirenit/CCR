<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <title>Add Compliant</title>
<%@ include file="header.html"%>
<div id="my" class="container mt-5 w3-border w3-topbar w3-bottombar w3-leftbar w3-rightbar rounded">
    <div class="col">
        <h4 class="h4 text-center mt-5" style="font-weight:normal; font-variant:small-caps; font-size:25px; font-color:#001233">Add Compliant</h4>
    </div>
    <form action="SaveComplaintServlet" method="POST">
        <div class="container col-sm-3 mt-5">
        </div>
        <div class="container col-sm"> 
            <div class="form-row">
             <div class="md-form col col-sm">
                 <i class="fa fa-mobile prefix my-colour float-left" style="font-size: 25px;"></i>
                  <input type="text" name="compliant_name" class="form-control" required="required">
                  <label for="running_km">Complaint Name<span style="color: red">*</span></label>
              </div>
            <div class="col-sm-1">
              </div>
              
              <div class="md-form col-sm text-center">
 
              <br>
                <select class="select-style" name="compliant_type" required="required">
                    <option value="" disabled hidden selected="">Compliant Type</option>
                 
                       <option value="cyberstalking" >Cyber Stalking</option> 
                        <option value="identity_theft">Identity Theft</option> 
                       <option value="chid_pronography">Child Pronography</option>
                        <option value="internet_fraud">Internet Fraud</option> 
                </select>
              </div>
              <div class="col-sm-1">
              </div>
          </div>
          <div class="col-sm-1">
              </div>
            <div class="md-form col col-sm">
              <i class="fa fa-mobile prefix my-colour float-left" style="font-size: 25px;"></i>
              <input type="text" name="complaint_desc" class="form-control" required="required">
              <label for="additional_complain_about_vehicle">Complain Description<span style="color: red">*</span></label>
            </div>
          </div>

          <div class="form-row">
            <div class="md-form col col-sm">
              <div class="row">
                <div class="md-form col col-sm-3">
                  <label for="Time">Date & Time:<span style="color: red">*</span></label>
                </div>
                <div class="md-form col col-sm-9">
                  <input type="datetime-local" name="complaint_date" class="form-control" required="required" >
                </div>
              </div>
            </div>
            <div class="col-sm-1">

            </div>
            <div class="md-form col col-sm">
            	Complain-image:
              
                <input type="file" name="complaint_image" class="form-control">
               
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