package com.kevinheise.entity;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.kevinheise.controller.SMSMessenger;
import com.kevinheise.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.GeneratedValue;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSMSMessenger {

    private final Logger logger = LogManager.getLogger(this.getClass());
    Properties properties;
    String access_id;
    String access_key;

    @BeforeEach
    public void setUp() {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/project.properties"));
            access_id = properties.getProperty("access_key_id");
            access_key = properties.getProperty("secret_access_key");
        } catch(IOException e) {
            logger.debug(e);
        }
    }

    @Test
    void sendMessageTest() {
            AWSCredentials awsCredentials = new BasicAWSCredentials(properties.getProperty("access_key_id"), properties.getProperty("secret_access_key"));
            final AmazonSNSClient client = new AmazonSNSClient(awsCredentials);
            client.setRegion(Region.getRegion(Regions.US_EAST_1));

            AmazonSNSClient snsClient = new AmazonSNSClient(awsCredentials);
            String message = "My SMS message";
            String phoneNumber = "+16086179434";
            Map<String, MessageAttributeValue> smsAttributes =
                    new HashMap<String, MessageAttributeValue>();
            //<set SMS attributes>
            sendSMSMessage(snsClient, message, phoneNumber, smsAttributes);
    }

    @Test
    void SMSMessengerTest() {
        SMSMessenger messenger = new SMSMessenger();
        GenericDao dao = new GenericDao(User.class);
        User user = (User) dao.getByPropertyEqual("username", "kheise").get(0);
        messenger.sendMessageToUser(user, "Testing Message");

        assertEquals("+16086179434", user.getPhoneNumber());
    }


    public static PublishResult sendSMSMessage(AmazonSNSClient snsClient, String message,
                                      String phoneNumber, Map<String, MessageAttributeValue> smsAttributes) {
        PublishResult result = snsClient.publish(new PublishRequest()
                .withMessage(message)
                .withPhoneNumber(phoneNumber)
                .withMessageAttributes(smsAttributes));
        return result;
    }
}
