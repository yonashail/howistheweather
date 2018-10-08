package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer=scanner.nextLine();

        if (answer.equals("rain")){
            System.out.println("Take your umbrella");
        }
        else if (answer.equals("snow")){
            System.out.println("Wear a coat and take a shovel!");
        }
        else if (answer.equals("windy")){
            System.out.println("wear your jacket");
        }
        else if (answer.equals("stormy")){
            System.out.println("you should stay inside");
        }
        else
            System.out.println("Enjoy your day!!");


    }
}
