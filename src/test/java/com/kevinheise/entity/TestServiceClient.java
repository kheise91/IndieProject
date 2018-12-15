package com.kevinheise.entity;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.kevinheise.eventful.EventItem;
import com.kevinheise.eventful.Events;
import com.kevinheise.eventful.SearchResults;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.json.Json;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    private final Logger logger = LogManager.getLogger(this.getClass());

    Properties properties;
    String url;
    String app_key;

    @BeforeEach
    public void setUp() {
        properties = new Properties();
        url = "http://api.eventful.com/json/events/search?location=Madison&category=music&sort_order=date&app_key=";
        try {
            properties.load(this.getClass().getResourceAsStream("/project.properties"));
        } catch(IOException e) {
            logger.debug(e);
        }
        app_key = properties.getProperty("api_key");
    }

    @Test
    public void testEventfulApi() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(url + app_key);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        assertEquals("???", response);
    }

    @Test
    public void testJSONDecoding() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(url + app_key);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        SearchResults results = mapper.readValue(response, SearchResults.class);

        Events testEvents = new Events();
        EventItem testEvent = new EventItem();
        Events events = results.getEvents();
        EventItem event = events.getEvent().get(0);

        assertEquals("???", event.getTitle());
    }

}
