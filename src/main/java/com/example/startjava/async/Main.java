package com.example.startjava.async;

import com.example.startjava.async.service.MessageService;
import com.example.startjava.async.service.MessageService1;
import com.example.startjava.async.service.MessageService2;
import com.example.startjava.async.service.MessageService3;

public class Main {

    public static void main(String[] args) throws InterruptedException  {
        msgService3();
    }

    public static void msgService() {
        MessageService messageService = new MessageService();

        for (int i = 1; i <= 100; i++) {
            messageService.print(i + "");
        }
    }

    public static void msgService1() {
        MessageService1 messageService = new MessageService1();

        for (int i = 1; i <= 100; i++) {
            messageService.print(i + "");
        }
    }

    public static void msgService2() {
        MessageService2 messageService = new MessageService2();

        for (int i = 1; i <= 100; i++) {
            messageService.print(i + "");
        }
    }

    public static void msgService3() throws InterruptedException {
        MessageService3 messageService = new MessageService3();

        for (int i = 1; i <= 100; i++) {
            messageService.print(i + "");
        }
    }
}
