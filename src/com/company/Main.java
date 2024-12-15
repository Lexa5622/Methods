package com.company;

import java.time.LocalDate;

public class Main {

    public static void printTestLeapYear(int numYear) {
        if(numYear >= 1584 && ((numYear % 4 == 0 && numYear % 100 != 0) || (numYear % 400 == 0))){
            System.out.println(numYear + " год является високосным");
        } else{
            System.out.println(numYear + " год не является високосным");
        }
    }

    public static void printVersionOSToPhone(int ver, int year) {
        String OS = "IOS";
        int currentYear = LocalDate.now().getYear();
        if(ver == 0 && year < currentYear){
            System.out.println("Установите облегченную версию приложения для " + OS + " по ссылке");
        } else if (ver == 1 && year < currentYear){
            OS = "Android";
            System.out.println("Установите облегченную версию приложения для " + OS + " по ссылке");
        } else if (ver == 0){
            System.out.println("Установите версию приложения для " + OS + " по ссылке");
        } else {
            OS = "Android";
            System.out.println("Установите версию приложения для " + OS + " по ссылке");
        }
    }

    public static int chekDaysToDelivery(int distance) {
        int days = 1;
        if (distance <= 20) {
            return days;
        } else if (distance <= 60) {
            return (++days);
        } else if (distance <= 100) {
            return (days + 2);
        } else {
            throw new RuntimeException(" Доставки нет");
        }
    }


    public static void main(String[] args) {
        int version = 1;
        int year = 2015;
        int clientDeviceYear = 2015;
        int deliveryDistance = 61;
        System.out.println("Задание 1");
        printTestLeapYear(year);

        System.out.println("Задание 2");
        printVersionOSToPhone(version, clientDeviceYear);

        System.out.println("Задание 3");
        int days = chekDaysToDelivery(deliveryDistance);
        System.out.println(days);


    }
}


