<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Form</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
<style type="text/css">
body {
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100px;
	background-color: white;
	border-color: black;	
}
</style>
</head>
<body>

<form action="Apply" method="post">
<h1 class="text-center">Student Application</h1>

<div class="mb-3">
<label class="form-label">Name</label><br>
<input type="text" class="form-control" name="name" required="required">
</div>
<div class="mb-3">
<label class="form-label">Email</label><br>
<input type="email" class="form-control" name="email" required="required">
</div>
<div class="mb-3">
<label class="form-label">Password</label><br>
<input type="password" class="form-control" name="password" required="required">
</div>
<div class="mb-3">
<label class="form-label">Confirm Password</label><br>
<input type="password" class="form-control" name="confirmPassword" required="required">
</div>
<div class="mb-3">
<label class="form-label">Contact No</label><br>
<input type="text" class="form-control" name="contactNo" required="required">
</div>
<div class="mb-3">
<label class="form-label">Address</label><br>
<input type="text"class="form-control" name="address" required="required">
</div>
<div class="mb-3" >
<input type="submit" class="form-control" value="Apply" style="color:blue">
</div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>