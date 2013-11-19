package agorapulse.maintenance

class MaintenanceController {

    static final List CAMPAIGN_TYPES = ['contest', 'coupon', 'fanVotes', 'instantWin', 'quiz', 'sweepstake', 'personalityTest']
    static final List CONTENT_TYPES = ['document', 'flash', 'html', 'image', 'petition', 'presentation', 'topFans', 'video']
    static final List APPS_LAYOUT = ['app', 'mobile', 'tab']
    static final List LOGO_HIDDEN_PATH_STARTS = (['go', 'publisher'] + APPS_LAYOUT + CONTENT_TYPES + CAMPAIGN_TYPES).flatten()

    def index() {
        String currentPath = request.forwardURI - request.contextPath
        String currentPathStart = ''
        if (currentPath.tokenize('/')) {
            currentPathStart = currentPath.tokenize('/')?.first()
        }
        [
                logoHidden: currentPathStart in LOGO_HIDDEN_PATH_STARTS
        ]
    }

}
