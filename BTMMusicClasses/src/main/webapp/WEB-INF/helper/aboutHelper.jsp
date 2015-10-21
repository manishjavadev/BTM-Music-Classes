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

	<!--/header-->
	<jsp:include page="/WEB-INF/pages/aboutUs.jsp" />
	<!--/#conatcat-info-->
	<jsp:include page="/WEB-INF/pages/footer.jsp" />
	<!--/#footer-->
	<jsp:include page="/WEB-INF/pages/footerStyle.jsp" />
	<!--/#footer-->