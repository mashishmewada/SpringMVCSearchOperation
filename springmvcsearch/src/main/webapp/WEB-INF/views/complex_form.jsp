<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello User</title>
</head>
<body class="" style="background: #e2e2e2;">

	<div class="container mt-4">

		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex form</h3>
						
						<div class="alert alert-danger" role="alert">
						<form:errors path="student.*" />
						</div>
							
						<form action="handle" method="POST">

							<div class="form-group">
								<label for="exampleFormControlInput1">Your name</label> <input
									name="name" type="text" class="form-control"
									id="exampleFormControlInput1" placeholder="Enter your name">
							</div>

							<div class="form-group">
								<label for="exampleFormControlInput1">Email address</label> <input
									name="email" type="email" class="form-control"
									id="exampleFormControlInput1" placeholder="name@example.com">
							</div>

							<div class="form-group">
								<label for="exampleFormControlInput1">Enter your ID</label> <input
									name="id" type="text" class="form-control"
									id="exampleFormControlInput1" placeholder="Enter ID">
							</div>

							<p>Your address</p>
							<div class="card">
								<div class="card-body form-row">
									<div class="col-md-4 mb-3">
										<label for="exampleFormControlInput1"></label><input
											name="address.street" type="text" class="form-control"
											placeholder="Street" required>
									</div>
									<div class="col-md-4 mb-3">
										<label for="exampleFormControlInput1"></label><input
											name="address.city" type="text" class="form-control"
											placeholder="City" required>
									</div>

									<div class="col-md-4 mb-3">
										<label for="exampleFormControlInput1"></label><input
											name="address.state" type="text" class="form-control"
											placeholder="State" required>
									</div>

									<div class="col-md-4 mb-3">
										<label for="exampleFormControlInput1"></label><input
											name="address.zip" type="text" class="form-control"
											placeholder="Zip" required>
									</div>

								</div>

							</div>

							<div class="form-group">
								<label for="exampleFormControlInput1">Enter your DOB</label> <input
									name="dob" type="date" class="form-control"
									id="exampleFormControlInput1">
							</div>

							<div class="form-group">
								<label for="exampleFormControlSelect1">Select Courses</label> <select
									name="courses" class="form-control"
									id="exampleFormControlSelect1" multiple="multiple">
									<option selected disabled="disabled">Select Course</option>
									<option>C</option>
									<option>C++</option>
									<option>Java</option>
									<option>Python</option>
									<option>Spring Framework</option>
									<option>Spring MVC</option>
									<option>Spring Boot</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Select Gender</span>

								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="exampleRadios1" value="male"> <label
										class="form-check-label" for="inlineRadios1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="exampleRadios2" value="female"> <label
										class="form-check-label" for="exampleRadios2">Female</label>
								</div>

							</div>

							<div class="form-group">
								<label for="">Select Type</label> <select id="inputState"
									class="form-control" name="type">
									<option selected disabled="disabled">Select Student</option>
									<option value="oldstudent">Old Student</option>
									<option value="currentstudent">Current Student</option>
									<option value="newstudent">New Student</option>
								</select>
							</div>

							<div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>

						</form>

					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

</body>
</html>