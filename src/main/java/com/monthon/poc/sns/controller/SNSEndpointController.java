package com.monthon.poc.sns.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.aws.messaging.config.annotation.NotificationMessage;
import org.springframework.cloud.aws.messaging.config.annotation.NotificationSubject;
import org.springframework.cloud.aws.messaging.endpoint.NotificationStatus;
import org.springframework.cloud.aws.messaging.endpoint.annotation.NotificationMessageMapping;
import org.springframework.cloud.aws.messaging.endpoint.annotation.NotificationSubscriptionMapping;
import org.springframework.cloud.aws.messaging.endpoint.annotation.NotificationUnsubscribeConfirmationMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/topic-subscriber")
public class SNSEndpointController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SNSEndpointController.class);

    @NotificationSubscriptionMapping
    public void confirmSubsctibeMessage(NotificationStatus notificationStatus) {
        notificationStatus.confirmSubscription();
    }

    @NotificationMessageMapping
    public void receiveNotification(@NotificationMessage String message, @NotificationSubject String subject) {
        LOGGER.info("Received subject:" + subject);
        LOGGER.info("REceived message:" + message);
    }

    @NotificationUnsubscribeConfirmationMapping
    public void confirmUnsubscribeMessage(NotificationStatus notificationStatus) {
        notificationStatus.confirmSubscription();
    }
 }
