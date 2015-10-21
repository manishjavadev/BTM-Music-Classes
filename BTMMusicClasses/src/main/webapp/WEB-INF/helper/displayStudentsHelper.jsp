<%@page import="org.springframework.context.annotation.Import"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.manish.javadev.constant.BTMConstantAttribute"%>
<%@taglib uri="http://manish.javadev.com/tags" prefix="mtags"%>

<jsp:include page="/WEB-INF/pages/headerStyle.jsp" />
<body class="homepage">

	<jstl:if test="${USER_TO.userType eq 'admin'}">
		<jsp:include page="/WEB-INF/pages/aheader.jsp" />
	</jstl:if>
	<jstl:if test="${USER_TO.userType eq 'user'}">
		<jsp:include page="/WEB-INF/pages/uheader.jsp" />
	</jstl:if>
	<jstl:if test="${USER_TO.userType eq null}">
		<jsp:include page="/WEB-INF/pages/header.jsp" />
	</jstl:if>

	<table class="table table-responsive">
		<caption>BTM Music Students</caption>
		<tr class="warning">
			<td align="left"><a href="previous.htm"><span
					class="label label label-info">Previous</span> </a></td>
			<td colspan="4"></td>
			<td align="right"><a href="next.htm"><span
					class="label label label-info">Next</span> </a></td>
		</tr>
	</table>

	<table class="table table-responsive">
		<thead>
			<tr>
				<th>S.No</th>
				<th>Name</th>
				<th>Mobile</th>
				<th>Course</th>
				<th>Timings</th>
				<th>Status</th>
			</tr>
		</thead>
		<tbody>
			<tr class="active">
				<td>1</td>
				<td>Manish</td>
				<td>8123917941</td>
				<td>Guitar</td>
				<td>Evening</td>
				<td>Active</td>
			</tr>
			<tr class="success">
				<td>2</td>
				<td>Bhumika</td>
				<td>8123917941</td>
				<td>Guitar</td>
				<td>Evening</td>
				<td>Active</td>
			</tr>
			<tr class="warning">
				<td>3</td>
				<td>Raju</td>
				<td>8123917941</td>
				<td>Guitar</td>
				<td>Evening</td>
				<td>Active</td>
			</tr>
			<tr class="danger">
				<td>4</td>
				<td>Pawan</td>
				<td>8123917941</td>
				<td>Guitar</td>
				<td>Evening</td>
				<td>Active</td>
			</tr>

			<tr class="warning">
				<td align="left"><a href="previous.htm"><span
						class="label label label-info">Previous</span> </a></td>
				<td colspan="4"></td>
				<td align="right"><a href="next.htm"><span
						class="label label label-info">Next</span> </a></td>
			</tr>

		</tbody>
	</table>

	<!-- Action of information -->
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4 text-center">
				<form class="form-horizontal" role="form" action="sendSms.htm">
					<input type="submit"
						class="btn btn-primary custom-button-width .navbar-right"
						value="Send Timings SMS" />
				</form>
			</div>
			<div class="col-md-4 text-center">
				<form class="form-horizontal" role="form" action="sendSms.htm">
					<input type="submit"
						class="btn btn-primary custom-button-width .navbar-right"
						value="Send Timings Mail" />
				</form>
			</div>
		</div>
	</div>





	<!--/header-->
	<jsp:include page="/WEB-INF/pages/aboutUs.jsp" />
	<!--/#conatcat-info-->
	<jsp:include page="/WEB-INF/pages/footer.jsp" />
	<!--/#footer-->
	<jsp:include page="/WEB-INF/pages/footerStyle.jsp" />
	<!--/#footer-->