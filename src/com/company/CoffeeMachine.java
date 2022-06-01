package com.company;

import java.util.Scanner;

public class CoffeeMachine {

    public static int water = 400;
    public static int milk = 540;
    public static int coffeeBeans = 120;
    public static int disposableCups = 9;
    public static int money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write action (buy, fill, take): ");
        String action = scanner.nextLine();
        boolean flag = true;
        while (flag) {
            switch (action) {
                case "buy" -> {
                    actionBuy();
                    System.out.println("Write action (buy, fill, take): ");
                    action = scanner.nextLine();
                }
                case "fill" -> {
                    actionFill();
                    System.out.println("Write action (buy, fill, take): ");
                    action = scanner.nextLine();
                }
                case "take" -> {
                    actionTakeMoney();
                    System.out.println("Write action (buy, fill, take): ");
                    action = scanner.nextLine();
                }
                case "remaining" -> {
                    statusCoffeeMachine();
                    System.out.println("Write action (buy, fill, take): ");
                    action = scanner.nextLine();
                }
                case "exit" -> flag = false;
            }

        }
    }

    private static void actionBuy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffeeType = scanner.nextLine();

        switch (coffeeType) {
            case "1" -> prepareEspresso();
            case "2" -> prepareLatte();
            case "3" -> prepareCappuccino();
        }


    }

    private static void actionFill() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        int waterAdd = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int milkAdd = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeBeansAdd = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int disposableCupsAdd = scanner.nextInt();
        water += waterAdd;
        milk += milkAdd;
        coffeeBeans += coffeeBeansAdd;
        disposableCups += disposableCupsAdd;

    }

    private static void actionTakeMoney() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("I gave you $%d%n", money);
        money -= money;

    }

    private static void prepareEspresso() {
        int waterNeed = 250;
        int coffeeBeansNeed = 16;
        int price = 4;
        int disposableCupsNeed = 1;

        if (waterNeed > water) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeansNeed > coffeeBeans) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (disposableCupsNeed > disposableCups) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            water -= waterNeed;
            coffeeBeans -= coffeeBeansNeed;
            money += price;
            disposableCups -= disposableCupsNeed;
        }

    }

    private static void prepareLatte() {
        int waterNeed = 350;
        int milkNeed = 75;
        int coffeeBeansNeed = 20;
        int price = 7;
        int disposableCupsNeed = 1;

        if (waterNeed > water) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeansNeed > coffeeBeans) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (milkNeed > milk){
            System.out.println("Sorry, not enough milk!");
        } else if (disposableCupsNeed > disposableCups) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            water -= waterNeed;
            milk -= milkNeed;
            coffeeBeans -= coffeeBeansNeed;
            money += price;
            disposableCups -= disposableCupsNeed;
        }

    }

    private static void prepareCappuccino() {
        int waterNeed = 200;
        int milkNeed = 100;
        int coffeeBeansNeed = 12;
        int price = 6;
        int disposableCupsNeed = 1;

        if (waterNeed > water) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeansNeed > coffeeBeans) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (milkNeed > milk){
            System.out.println("Sorry, not enough milk!");
        } else if (disposableCupsNeed > disposableCups) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            water -= waterNeed;
            milk -= milkNeed;
            coffeeBeans -= coffeeBeansNeed;
            money += price;
            disposableCups -= disposableCupsNeed;
        }

    }

    private static void statusCoffeeMachine() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", water);
        System.out.printf("%d ml of milk%n", milk);
        System.out.printf("%d g of coffee beans%n", coffeeBeans);
        System.out.printf("%d disposable cups%n", disposableCups);
        System.out.printf("%d of money%n", money);
    }
}
