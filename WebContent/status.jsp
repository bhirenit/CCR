
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<title>Job Cart list</title>
	 <%@ include file="header.html"%>
<div class="row">
	<div class=""col-md-4" align="center" style="margin-left:50px;">
	 
			<button class="btn btn-primary" id="pending-button" onclick="pendingClicked()">Pending</button>
	
	</div>
	<div class=""col-md-4"  align="center" style="margin-left:550px;">
		
			<button class="btn btn-primary" id="completed-button" onclick="completedClicked()">Completed</button>
		
	</div>
	<div class=""col-md-4"  align="right" style="margin-left:520px;">
		
			<button class="btn btn-primary" id="closed-button" onclick="closedClicked()">Closed</button>
		
	</div>
</div>

<div class="table-responsive" >
<div class="col-md-12" id="pending-content">
	<center><h3>Pending Problem Details</h3></center>
	<table style="border: 1px;" class="table table-hover">
		<thead style="background-color: #e6e6e6; font-weight: bolder;">
			<tr>
				<td>Complain Id</td>
				<td>Customer Name</td>
				<td>Date</td>
				<td>Complain Type</td>
				<td>Details</td>
			</tr>
		</thead>
		<tbody>
			
		</tbody>
	</table>
</div>
</div>
<div class="table-responsive">
<div class="col-md-12" id="completed-content">
	<center><h3>Approved Problem Details</h3></center>
	<table style="border: 1px;" class="table table-hover">
		<thead style="background-color: #e6e6e6; font-weight: bolder;">
			<tr>
				<td>Complain Id</td>
				<td>Customer Name</td>
				<td>Date</td>
				<td>Complain Type</td>
				<td>Details</td>
			</tr>
		</thead>
		<tbody>
			
			</tbody>
		</table>
	</div>
</div>
<div class="table-responsive">
<div class="col-md-12" id="closed-content">
	<center><h3>Solve Problem Details</h3></center>
	<table style="border: 1px;" class="table table-hover">
		<thead style="background-color: #e6e6e6; font-weight: bolder;">
		<tr>
			<td>Complain Id</td>
				<td>Customer Name</td>
				<td>Date</td>
				<td>Complain Type</td>
				<td>Details</td>
		</tr>
	</thead>
	<tbody>
			
			</tbody>
		</table>
		</div>
</div>

<script>
	var pc = document.getElementById('pending-content');
	var comc = document.getElementById('completed-content');
	var cloc = document.getElementById('closed-content');
	
	pc.style.display = 'block';
	comc.style.display = cloc.style.display = 'none';
	
	function pendingClicked() {
		pc.style.display = 'block';
		comc.style.display = 'none';
		cloc.style.display = 'none';
	}
	function completedClicked() {
		pc.style.display = 'none';
		comc.style.display = 'block';
		cloc.style.display = 'none';
	}
	function closedClicked() {
		pc.style.display = 'none';
		comc.style.display = 'none';
		cloc.style.display = 'block';
	}
</script>	

<%@ include file="footer.html"%>