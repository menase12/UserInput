package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstInitial, lastName, streetName, streetType, cityName;
        int houseNumber;
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Enter your first initial, last name, street name,street type and your house number: ");
        firstInitial=keyboard.next();
        lastName=keyboard.next();
        streetName=keyboard.next();
        streetType=keyboard.next();
        cityName=keyboard.next();
        houseNumber=keyboard.nextInt();
        System.out.print(firstInitial+ " " +lastName+ " " + houseNumber +" ");
        System.out.println(streetName + " " + streetType + " " +cityName);

    }
}
