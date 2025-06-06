package com.game;

import java.util.Scanner;

public class UserInterface{

    Scanner continueDialogue = new Scanner(System.in);


    public void Introduction() {
        System.out.println("\nTip: Press 'ENTER' to continue dialogue throughout game");
        System.out.println();

        System.out.print("It's Dark...");
        continueDialogue.nextLine();
        System.out.println("\n");


        System.out.print("Where am I?");
        continueDialogue.nextLine();
        System.out.println("\n");

        System.out.println(" ");



    }


}
