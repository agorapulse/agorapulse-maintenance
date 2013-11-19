class UrlMappings {

	static mappings = {
        "/monitor"(controller: "monitor")

        // Apps - Redirect mappings
        /*"/$base/**"(view:"/index") {
        	constraints {
                base matches: /(app|mobile|tab|web)/
            }
            logoHidden = true
        }
        "/go/**"(view:"/index") {
            logoHidden = true
        }

        // Apps
        "/contest/**"(view:"/index") {
            logoHidden = true
        }
        "/$base/contest/**"(view:"/index") {
            constraints {
                base matches: /(app|mobile|tab|web)/
            }
            logoHidden = true
        }
        "/contest/**"(view:"/index") {
            logoHidden = true
        }
        "/coupon/**"(view:"/index") {
            logoHidden = true
        }
        "/document/**"(view:"/index") {
            logoHidden = true
        }
        "/fanVotes/**"(view:"/index") {
            logoHidden = true
        }
        "/flash/**"(view:"/index") {
            logoHidden = true
        }
        "/html/**"(view:"/index") {
            logoHidden = true
        }
        "/image/**"(view:"/index") {
            logoHidden = true
        }
        "/instantWin/**"(view:"/index") {
            logoHidden = true
        }
        "/personalityTest/**"(view:"/index") {
            logoHidden = true
        }
        "/petition/**"(view:"/index") {
            logoHidden = true
        }
        "/presentation/**"(view:"/index") {
            logoHidden = true
        }
        "/publisher/**"(view:"/index") {
            logoHidden = true
        }
        "/quiz/**"(view:"/index") {
            logoHidden = true
        }
        "/sweepstake/**"(view:"/index") {
            logoHidden = true
        }
        "/topFans/**"(view:"/index") {
            logoHidden = true
        }
        "/userInfo/**"(view:"/index") {
            logoHidden = true
        }
        "/video/**"(view:"/index") {
            logoHidden = true
        }*/

       	// Catch all mapping
        "/**"(controller: "maintenance")
        "500"(view:'/error')
	}
}
