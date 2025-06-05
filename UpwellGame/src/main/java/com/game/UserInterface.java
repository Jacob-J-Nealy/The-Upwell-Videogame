package com.game;

import java.util.Scanner;

public class UserInterface{

    Scanner continueScanner = new Scanner(System.in);


    public void Introduction() {
        System.out.println("Tip: Press 'ENTER' to continue dialogue throughout game");
        System.out.println("\n");

        System.out.print("It's Dark...");
        continueScanner.nextLine();
        System.out.println("\n");


        System.out.println("Where am I?");
        continueScanner.nextLine();
        System.out.println("\n");



    }


}
