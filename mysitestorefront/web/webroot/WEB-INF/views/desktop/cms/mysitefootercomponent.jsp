<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.footerTile{
padding:10px;
}
</style>
<div style="background-color:#001941;color:#fff;"> 
<div class="row" style="text-align:center;">
	<div class="col-md-4 footerTile"><i class="fa fa-usd fa-lg">&nbsp;&nbsp;</i>${text1}</div>
	<div class="col-md-4 footerTile"><i class="fa fa-plane fa-lg">&nbsp;&nbsp;</i>${text2}</div>
	<div class="col-md-4 footerTile"><i class="fa fa-exchange fa-lg">&nbsp;&nbsp;</i>${text3}</div>
</div>

<div class="row" style="margin-left:8.5%;margin-top:2%;margin-right:9.5%;">

<div class="col-md-5" style="text-align:left;">
<h4 class="siteFont">Sign up for our newsletter and receive a $10 voucher</h4>
<form action="">
<input type="email" placeholder="Email address*" class="col-md-10 emailSubscribe" style="background-color:#0d1f49;"/>
<input type="Submit" value="GO" class="col-md-2 emailSubscribe" style="background-color:#203776;"></input>
</form>
<div class="notice">* Your address will only be used for the designated purpose.<br>
You can unsubscribe at any time with a simple mouse-click.</div>
</div>
<div class="col-md-3">&nbsp;</div>
<div class="col-md-4" style="text-align:right;">
Free service hotline<br>
<a class="siteFont" style="color:inherit;text-decoration:none;" href="tel:00800 55 22 22 22"><h4>00800 55 22 22 22</h4></a>
<br><br>
<a href="https://twitter.com/redbullshop" target="_blank" class="siteFont" style="color:inherit;text-decoration:none;"><h4>Follow us on the move <i class="fa fa-twitter fa-lg"></i></h4></a>
</div>
</div>

<div class="row" style="margin-left:8.5%;margin-top:2%;margin-right:9.5%;">
<div id="nodes" style="display: flex;">
		<c:forEach items="${navigationNodes}" var="node">
				<c:if test="${node.visible}">
					<div class="listitem" style="flex: 1;">
					<a style="color:inherit;text-decoration:none;" href="${node.links[0].url}">${node.title}</a>
					</div>
				</c:if>
		</c:forEach>
</div>
<div class="copyright">${notice}</div>
</div>
</div>
