package agorapulse.maintenance

class UrlMappings {

	static mappings = {
        "/monitor"(controller: "monitor")

       	// Catch all mapping
        "/**"(controller: "maintenance")
        "500"(view:'/error')
	}
}
