
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a Company Profile</title>
<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
</head>
<body>
	<jsp:include page="/pages/back-office-user.jsp"/>
	<div class="offset-md-4 container-fluid">
	<h3>${isNew?"New":"Edit" } Company</h3>
		<div class="row">
			<div class="col-md-4">
				<form:form action="/company/${isNew?'add':'update' }" 
				method="POST" modelAttribute="company" class="form">
				<div class="form-control-group">
					<form:errors path="*"/>				
				</div>
				<div class="form-control-group">
					<form:label path="companyCode" class="form-control-label">Company Code</form:label>
					<form:input path="companyCode" class="form-control" type="number"/>
				</div>
				<div class="form-control-group">
					<form:label path="companyTitle" class="form-control-label">Company Title</form:label>
					<form:input path="companyTitle" class="form-control" type="text"/>
				</div>
				<div class="form-control-group">
					<form:label path="companyOperations" class="form-control-label">Company Operations</form:label>
					<form:input path="companyOperations" class="form-control" type="text"/>
				</div>
				<div class="form-control-group">
					<form:label path="currency" class="form-control-label">Currency</form:label>
					<form:input path="currency" class="form-control" type="text"/>
				</div> 
				<div class="form-control-group">
					<form:label path="openSharePrice" class="form-control-label">Open share Price</form:label>
					<form:input path="openSharePrice" class="form-control" type="decimal"/>
				</div>
				<div class="form-control-group">
					<form:label path="sector" class="form-control-label">Sector</form:label>
					<form:select path="sector" class="form-control">
							<option value="">Select one</option>
							<option value="Agriculture">Agriculture</option>
							<option value="Pharmaceutical">Pharmaceutical</option>
							<option value="Finance">Finance</option>
							<option value="IT">IT</option>
							<option value="Telecommunications">Telecommunications</option>
					</form:select>
				</div>
				<div class="form-control-group">
					<form:label path="shareCount" class="form-control-label">Share Count</form:label>
					<form:input path="shareCount" class="form-control" type="number"/>
				</div>
				<div class="form-control-group">
					<form:label path="turnover" class="form-control-label">Turnover</form:label>
					<form:input path="turnover" class="form-control" type="number"/>
				</div>
				 
				<div class="form-control-group">
					<button class="btn btn-primary">SAVE</button>
				</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>