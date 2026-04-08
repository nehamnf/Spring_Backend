package com.neha.spring.annotation.paymentsystem;

import org.springframework.stereotype.Component;

@Component
public class SmsNotification implements NotificationSender{

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification...");
    }
}
