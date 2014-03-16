<g:if test="${!logoHidden}">
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
        <header>
            <h1>Under maintenance</h1>
            <p class="lead">
                We're sorry, this app is undergoing maintenance.<br />
                Thanks for your patience, please come back later...
            </p>
            <g:if test="${!logoHidden}">
                <p>
                    <g:render template="status"/>
                </p>
            </g:if>
        </header>
        <footer>
            <hr/>
        </footer>
    </div>
</div>