package com.kevinheise.entity;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.json.Json;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    private final Logger logger = LogManager.getLogger(this.getClass());

    Properties properties;

    @BeforeEach
    public void setUp() {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/project.properties"));
        } catch(IOException e) {
            logger.debug(e);
        }
    }

    @Test
    public void testEventfulApi() throws Exception {
        String api_key = properties.getProperty("api_key");
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://api.eventful.com/json/events/search?category=music_electronic&page_size=1&app_key=" + api_key);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        assertEquals("???", response);
    }

}
