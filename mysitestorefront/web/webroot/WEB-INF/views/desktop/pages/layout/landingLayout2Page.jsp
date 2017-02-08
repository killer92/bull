<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<template:page pageTitle="${pageTitle}">
	<div id="globalMessages">
		<common:globalMessages/>
	</div>

	<cms:pageSlot position="Section1" var="feature">
		<cms:component component="${feature}" element="div" class="section1 col-md-12 cms_disp-img_slot"/>
	</cms:pageSlot>

	<div class="section2">
		<cms:pageSlot position="Section2A" var="feature" element="div" class="col-md-4 zone_a thumbnail_detail">
			<cms:component component="${feature}" />
		</cms:pageSlot>

		<cms:pageSlot position="Section2B" var="feature" element="div" class="col-md-4 zone_b thumbnail_detail">
			<cms:component component="${feature}" />
		</cms:pageSlot>

		<cms:pageSlot position="Section2C" var="feature" element="div" class="col-md-4 zone_c cms_disp-img_slot last">
			<cms:component component="${feature}" element="div"/>
		</cms:pageSlot>
	</div>

	<cms:pageSlot position="Section3" var="feature" element="div" class="span-24 section3 cms_disp-img_slot">
		<cms:component component="${feature}" />
	</cms:pageSlot>

	<cms:pageSlot position="Section4" var="feature" element="div" >
		<cms:component component="${feature}" element="div" class="section4 small_detail ${(elementPos%4 == 3) ? 'last' : ''}"/>
	</cms:pageSlot>

	<cms:pageSlot position="Section5" var="feature" element="div" class="span-24 section5 cms_disp-img_slot">
		<cms:component component="${feature}" />
	</cms:pageSlot>

</template:page>