package com.example.geektrust; 

import java.time.LocalDate;

import com.example.geektrust.*;
import com.example.geektrust.services.SubscriptionService;

public class Main {
    public static void main(String[] args) {
        /*
        Sample code to read from file passed as command line argument
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
               //Add your code here to process input commands
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
        }
        */    	

        SubscriptionService subscriptionService = new SubscriptionService();
        LocalDate startDate = LocalDate.parse("2022-02-20");
        subscriptionService.startSubscription(startDate);
        subscriptionService.addSubscription("MUSIC", "PERSONAL");
        subscriptionService.printRenewDetails();
    }
}
