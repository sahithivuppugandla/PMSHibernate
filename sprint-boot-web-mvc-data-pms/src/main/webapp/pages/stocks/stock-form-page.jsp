
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
	<h3>${isNew?"New":"Edit" } Stock</h3>
		<div class="row">
			<div class="col-md-4">
				<form:form action="/stocks/${isNew?'add':'update' }" 
				method="POST" modelAttribute="stock" class="form">
				<div class="form-control-group">
					<form:errors path="*"/>				
				</div>
				<div class="form-control-group">
					<form:label path="stockId" class="form-control-label">Stock Id</form:label>
					<form:input path="stockId" class="form-control" type="number"/>
				</div>
				<div class="form-control-group">
					<form:label path="stockExchange" class="form-control-label">Stock Exchange</form:label>
					<form:input path="stockExchange" class="form-control" type="text"/>
				</div>
				<div class="form-control-group">
					<form:label path="currentPrice" class="form-control-label">Curren Price</form:label>
					<form:input path="currentPrice" class="form-control" type="number"/>
				</div>
				<div class="form-control-group">
					<form:label path="date" class="form-control-label">Updated date</form:label>
					<form:input path="date" class="form-control" type="date"/>
				</div> 
				<div class="form-control-group">
					<form:label path="time" class="form-control-label">Updated time</form:label>
					<form:input path="time" class="form-control" type="time"/>
				</div>
				<div class="form-control-group">
					<form:label path="company.companyCode" class="form-control-label">Company </form:label>
					<form:select path="company.companyCode" class="form-control">						
						<form:options items="${companies }" itemLabel="companyTitle" itemValue="companyCode"/>
					</form:select>
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