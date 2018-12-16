package com.kevinheise.entity;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kevinheise.eventful.*;
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
        url = "http://api.eventful.com/json/events/search?c=music_electronic&l=Madison&within=50&sort_order=date&app_key=";
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/project.properties"));
            app_key = properties.getProperty("app_key");
        } catch(IOException e) {
            logger.debug(e);
        }


    }

    @Test
    void testEventfulApi() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url + app_key);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        assertEquals("???", response);
    }

    @Test
     void testGetListOfEvents() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url + app_key);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        Search results = mapper.readValue(response, Search.class);

        Events events = results.getEvents();
        List<EventItem> eventList = events.getEvent();

        assertEquals("???", eventList);
    }

    @Test
    void testGetImage() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url + app_key);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        Search results = mapper.readValue(response, Search.class);

        Events events = results.getEvents();
        List<EventItem> eventList = events.getEvent();
        String eventImage = eventList.get(4).getImage().getUrl();

        assertEquals("???", eventImage);
    }

    @Test
    void testGetDate() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url + app_key);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        Search results = mapper.readValue(response, Search.class);

        Events events = results.getEvents();
    }

}
