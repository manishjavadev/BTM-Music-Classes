
<div class="container">

	<!-- <div class="page-header">
		<h1>
			<small> Registration form BTM Music Class</small>
		</h1>
	</div> -->
	<br />
	<!-- Registration form - START -->
	<div class="container">
		<div class="row">
			<form role="form" action="register.htm" method="post">
				<div class="col-lg-6">
					<div class="well well-sm">
						<strong><span class="glyphicon glyphicon-asterisk"></span>Required
							Field</strong>
					</div>
					<div class="form-group">
						<label for="userName">Enter Name</label>
						<div class="input-group">
							<input type="text" class="form-control" name="userName"
								id="userName" placeholder="Enter Name" required> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>
					<div class="form-group">
						<label for="userEmail">Enter Email</label>
						<div class="input-group">
							<input type="email" class="form-control" id="userEmail"
								name="userEmail" placeholder="Enter Email" required> <span
								class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>
					<div class="form-group">
						<label for="confirmEmail">Confirm Email</label>
						<div class="input-group">
							<input type="email" class="form-control" id="confirmEmail"
								name="confirmEmail" placeholder="Confirm Email" required>
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-asterisk"></span></span>
						</div>
					</div>
					<div class="form-group">
						<label for="confirmEmail">Course Type</label>
						<div class="input-group">
							<label class="checkbox-inline"><input type="checkbox"
								value="">Guitar</label> <label class="checkbox-inline"><input
								type="checkbox" value="">Violin</label> <label
								class="checkbox-inline"><input type="checkbox" value="">Piano</label>
						</div>
					</div>
					<div class="form-group">
						<label for="confirmEmail">Batch Type</label>
						<div class="input-group">
							<label class="radio-inline"> <input type="radio"
								name="optradio">Weekdays
							</label> <label class="radio-inline"> <input type="radio"
								name="optradio">Weekend
							</label>
						</div>
					</div>

					<input type="submit" name="submit" id="submit" value="Submit"
						class="btn btn-info pull-right">
				</div>
			</form>
			<div class="col-lg-5 col-md-push-1">
				<div class="col-md-12">
					<div class="alert alert-success">
						<strong><span class="glyphicon glyphicon-ok"></span>
							Success! Message sent.</strong>
					</div>
					<div class="alert alert-danger">
						<span class="glyphicon glyphicon-remove"></span><strong>
							Error! Please check all page inputs.</strong>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Registration form - END -->

</div>

<hr />
