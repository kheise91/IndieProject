package com.kevinheise.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kevinheise.eventful.Event;
import com.kevinheise.eventful.EventItem;
import com.kevinheise.eventful.Events;
import com.kevinheise.eventful.Search;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/**
 * Class to get events from eventful api
 */
public class ServiceConsumer {

    /**
     * Gets events.
     *
     * @param url the url
     * @return the events
     */
    public List<EventItem> getEvents(String url) {
        final Logger logger = LogManager.getLogger(this.getClass());

        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/project.properties"));
        } catch (Exception exception) {
            logger.error(exception);
        }
        String appKey = properties.getProperty("app_key");

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url + appKey);
        String eventfulResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        try {
            Search results = mapper.readValue(eventfulResponse, Search.class);
            return results.getEvents().getEvent();
        } catch (Exception exception) {
            logger.error(exception);
        }

        return Collections.emptyList();
    }


    public Event getEvent(String url) throws IOException {
        final Logger logger = LogManager.getLogger(this.getClass());

        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/project.properties"));
        } catch (IOException e) {
            logger.error(e);
        }
        String appKey = properties.getProperty("app_key");

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url + appKey);
        String eventfulResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(eventfulResponse, Event.class);
    }

}
