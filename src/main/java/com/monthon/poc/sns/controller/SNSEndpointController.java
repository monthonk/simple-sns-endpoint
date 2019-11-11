package com.monthon.poc.sns.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.config.annotation.NotificationMessage;
import org.springframework.cloud.aws.messaging.config.annotation.NotificationSubject;
import org.springframework.cloud.aws.messaging.endpoint.NotificationStatus;
import org.springframework.cloud.aws.messaging.endpoint.annotation.NotificationMessageMapping;
import org.springframework.cloud.aws.messaging.endpoint.annotation.NotificationSubscriptionMapping;
import org.springframework.cloud.aws.messaging.endpoint.annotation.NotificationUnsubscribeConfirmationMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/topic-subscriber")
public class SNSEndpointController {

    @NotificationSubscriptionMapping
    public void confirmSubscribeMessage(NotificationStatus notificationStatus) {
        notificationStatus.confirmSubscription();
    }

    @NotificationMessageMapping
    public void receiveNotification(@NotificationMessage String message, @NotificationSubject String subject) {
        log.info("Received subject:{}", subject);
        log.info("Received message:{}", message);
    }

    @NotificationUnsubscribeConfirmationMapping
    public void confirmUnsubscribeMessage(NotificationStatus notificationStatus) {
        notificationStatus.confirmSubscription();
    }
 }
