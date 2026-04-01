package com.neha.spring.annotation.paymentsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AlertService {
    private NotificationSender notificationSender;

    @Autowired
    public AlertService(@Qualifier("pushNotification") NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void setNotificationSender(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendAlert() {
        notificationSender.sendNotification();
    }
}
