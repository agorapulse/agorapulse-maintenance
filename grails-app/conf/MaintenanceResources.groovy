modules = {
    application {
        resource url: [dir: 'css/themes/agorapulse', file: "agorapulse.css"], attrs: [media: 'all'], disposition: 'head'
        resource url: [dir: 'css/themes/agorapulse', file: "agorapulse-responsive.css"], attrs: [media: 'all'], disposition: 'head'
        resource url: [dir: 'css', file: "maintenance.css"], attrs: [media: 'all'], disposition: 'head'
    }
}