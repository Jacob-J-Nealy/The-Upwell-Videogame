package com.game;

import java.util.Scanner;

public class UserInterface {

    Scanner continueDialogue = new Scanner(System.in);
    Colors colors = new Colors();

    // Helper Methods
    /**
     * gameTextWriter() Explanation
     * This Method is used to display In-Game Prompts letter by letter
     * similarly to the game UnderTale.
     */
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

    public void waitForEnter() {

        while (true) {
            String input = continueDialogue.nextLine();

            if (input.isEmpty()) {
                System.out.println();
                break;
            } else {
                System.err.println("PLEASE PRESS 'ENTER' TO CONTINUE");
            }
        }
    }

    public void introduction() {
        System.out.println("\nTip: Press 'ENTER' to continue dialogue throughout game");
        waitForEnter();

        System.out.print("It's Dark...");
        waitForEnter();


        System.out.print("Where am I?");
        waitForEnter();

        System.out.print(""" 
                You wake up lying in a pool of shallow, cold water.
                Your clothes cling to your body, completely drenched.
                The air is damp and heavy, and the stench of mildew rises from your soaked shirt.
                """);
        waitForEnter();
    }





}