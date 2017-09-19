package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstName,secondName,lastName;
        double c1=0.07,c2=0.1,totalPrice=0;
        int km=10;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your First name:");
        firstName = input.nextLine();

        System.out.print("Please Enter your Initial name:");
        secondName = input.nextLine();

        System.out.print("Please Enter your Surname name:");
        lastName = input.nextLine();

        System.out.print("Your name is "+ firstName + secondName + lastName);

        System.out.print("\n\nHow many KM are you cycling?");
        totalPrice = input.nextDouble();
        if (km <=10)
            totalPrice =km*c1;
            System.out.print("\n\nYour total rate is:"+totalPrice);
        else (km >10)
            totalPrice =km*c2;
            System.out.print("\n\nYour total rate is:"+totalPrice);
    }
}
