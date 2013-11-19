<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title><g:layoutTitle default="Under maintenance..."/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <g:layoutHead />
    <r:require module="application"/>
    <r:layoutResources/>
</head>

<body class="controller-auth www-layout">

<g:if test="${!params.logoHidden}">
	<%-- Hide logo if run inside FB --%>
	<div id="navBar" class="navbar">
	    <div class="navbar-inner">
	        <div class="navbar-container">
	            <a href="http://www.agorapulse.com"><div class="logo"></div></a>
	        </div>
	    </div>
	</div>
</g:if>

<div id="wrap">
    <div class="container">
   		<g:layoutBody/>
    </div>
</div>

<r:layoutResources />
</body>
</html>