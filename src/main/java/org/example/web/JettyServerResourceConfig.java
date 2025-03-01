package org.example.web;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

@ApplicationPath("/api")
public class JettyServerResourceConfig extends ResourceConfig {

    public JettyServerResourceConfig() {
        packages("org.example.endpoints");
        register(RolesAllowedDynamicFeature.class);
        //register(AuthenticationFilter.class);
    }
}
