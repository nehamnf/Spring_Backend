package com.neha.spring.annotation.paymentsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AlertService {
//    private NotificationSender notificationSender;
//
//    @Autowired
//    public AlertService(@Qualifier("pushNotification") NotificationSender notificationSender) {
//        this.notificationSender = notificationSender;
//    }


    @Autowired
    Map<String, NotificationSender> notificationSenders = new HashMap<>();

    public void sendAlert() {
       for(var notification : notificationSenders.entrySet()){
           notification.getValue().sendNotification();
       }
    }
}
