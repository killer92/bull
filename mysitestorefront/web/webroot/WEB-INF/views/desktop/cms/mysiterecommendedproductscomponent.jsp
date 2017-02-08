<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<div class="col-md-12">
<div class="row" style="font-weight:bold;text-transform:uppercase;color:#030F82;letter-spacing:0pt;word-spacing:2pt;font-size:120%;text-align:center;font-family:lucida sans unicode, lucida grande, sans-serif;line-height:2;margin:0px;padding:0px;">
${Headline}
</div>
<div class="col-md-6 imgWrap" ><img style="width:100%;" title="${product1.name}" src="${product1.picture.URL}" /><div class="imgDescription"><product:productDetailsPromo product="${product1}"/></div></div>

<div class="col-md-6">

<div class="col-md-6 imgWrap"><img style="width:100%" title="${product2.name}" src="${product2.picture.URL}" /><div class="imgDescription"><product:productDetailsPromo product="${product2}"/></div></div>
<div class="col-md-6 imgWrap"><img style="width:100%" title="${product3.name}" src="${product3.picture.URL}" /><div class="imgDescription"><product:productDetailsPromo product="${product3}"/></div></div>

<div class="col-md-6 imgWrap"><img style="width:100%" title="${product4.name}" src="${product4.picture.URL}" /><div class="imgDescription"><product:productDetailsPromo product="${product4}"/></div></div>
<div class="col-md-6 imgWrap"><img style="width:100%" title="${product5.name}" src="${product5.picture.URL}" /><div class="imgDescription"><product:productDetailsPromo product="${product5}"/></div></div>

</div>
</div>