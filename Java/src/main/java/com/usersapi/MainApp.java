package com.usersapi;
/**
 *
 * @author Romel
 */
import org.glassfish.jersey.server.ResourceConfig;

public class MainApp extends ResourceConfig {

    public MainApp() {
        packages("com.usersapi.controller");
    }
}
