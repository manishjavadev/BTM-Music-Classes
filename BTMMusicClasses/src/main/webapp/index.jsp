<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<jsp:include page="/WEB-INF/pages/mainSlider.jsp" />
	<!--/#main-slider-->
	<jsp:include page="/WEB-INF/pages/feature.jsp" />
	<!--/#feature-->
	<jsp:include page="/WEB-INF/pages/recentWorks.jsp" />
	<!--/#recent-works-->
	<jsp:include page="/WEB-INF/pages/services.jsp" />
	<!--/#services-->
	<jsp:include page="/WEB-INF/pages/middle.jsp" />
	<!--/#middle-->
	<jsp:include page="/WEB-INF/pages/content.jsp" />
	<!--/#content-->
	<jsp:include page="/WEB-INF/pages/partner.jsp" />
	<!--/#partner-->
	<jsp:include page="/WEB-INF/pages/conatcatInfo.jsp" />
	<!--/#conatcat-info-->
	<jsp:include page="/WEB-INF/pages/footer.jsp" />
	<!--/#footer-->
	<jsp:include page="/WEB-INF/pages/footerStyle.jsp" />
	<!--/#footer-->