package com.kevinheise.controller;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.kevinheise.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * The type Sms messenger.
 */
public class SMSMessenger {

    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     *  Builds the SMS notification to be sent
     *
     * @param user         the user
     * @param messageInput the message input
     */
    public void sendMessageToUser(User user, String messageInput) {
            Properties properties = new Properties();
            try {
                properties.load(this.getClass().getResourceAsStream("/project.properties"));
            } catch(IOException e) {
                logger.debug(e);
            }

            AWSCredentials awsCredentials = new BasicAWSCredentials(properties.getProperty("access_key_id"), properties.getProperty("secret_access_key"));
            final AmazonSNSClient client = new AmazonSNSClient(awsCredentials);
            client.setRegion(Region.getRegion(Regions.US_EAST_1));

            AmazonSNSClient snsClient = new AmazonSNSClient(awsCredentials);
            String message = messageInput;
            String phoneNumber = user.getPhoneNumber();
            Map<String, MessageAttributeValue> smsAttributes =
                    new HashMap<String, MessageAttributeValue>();
            //<set SMS attributes>

            logger.info("sending SMS message");
            sendSMSMessage(snsClient, message, phoneNumber, smsAttributes);
        }

    /**
     * Sends the SMS notification
     *
     * @param snsClient     the sns client
     * @param message       the message
     * @param phoneNumber   the phone number
     * @param smsAttributes the sms attributes
     */
    public void sendSMSMessage(AmazonSNSClient snsClient, String message,
                                          String phoneNumber, Map<String, MessageAttributeValue> smsAttributes) {
            PublishResult result = snsClient.publish(new PublishRequest()
                    .withMessage(message)
                    .withPhoneNumber(phoneNumber)
                    .withMessageAttributes(smsAttributes));
            logger.info(result);

        }
}
