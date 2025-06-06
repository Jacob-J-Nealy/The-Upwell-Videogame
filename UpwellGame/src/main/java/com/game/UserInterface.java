package com.game;

import java.util.Scanner;

public class UserInterface{

    Scanner continueDialogue = new Scanner(System.in);
    Colors colors = new Colors();


    public void introduction() {
        System.out.println("\nTip: Press 'ENTER' to continue dialogue throughout game");
        System.out.println();

        System.out.print("It's Dark...");
        continueDialogue.nextLine();
        System.out.println("\n");


        System.out.print("Where am I?");
        continueDialogue.nextLine();
        System.out.println("\n");

        System.out.print(""" 
                You wake up lying in a pool of shallow, cold water.
                Your clothes cling to your body, completely drenched.
                The air is damp and heavy, and the stench of mildew rises from your soaked shirt.
                """);
        continueDialogue.nextLine();
        System.out.println("\n");



    }

    /** gameTextWriter() Explanation
     * This Method is used to display In-Game Prompts letter by letter
     * similarly to the game UnderTale. */
    public void gameTextWriter(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.println(c);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }




}
