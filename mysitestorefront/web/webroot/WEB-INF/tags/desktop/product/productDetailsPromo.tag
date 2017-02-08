<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="product" required="true" type="de.hybris.platform.core.model.product.ProductModel" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<style>
.recomDetails{
text-align:center;
margin-top:10%;
font-family:FuturaW01-Bold,sans-serif !important;
font-weight:bold;
    letter-spacing: 0.02em;
    word-spacing: 0.02em;
    padding:10%;
}
.recomDetails .gender{
font-size:x-large;
}
.recomDetails .name{
font-size:xx-large;
text-transform: uppercase;
}
</style>

<div class="recomDetails">
                <div class="gender">Unisex</div>
                <div class="name">${product.name}</div>
</div>