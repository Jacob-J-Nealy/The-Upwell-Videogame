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
    public void gameTextWriter(String text, int delay, String color) {
        System.out.print(color);

        for (char c : text.toCharArray()) {
            System.out.print(c);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Colors.RESET);
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
        gameTextWriter(
                "\nTip: Press 'ENTER' to continue dialogue throughout game.",
                20, Colors.BOLD);
        waitForEnter();

        gameTextWriter(
                "It's Dark...",
                100, Colors.BRIGHT_WHITE);
        waitForEnter();


        gameTextWriter(
                "Where am I?",
                100, Colors.RESET);
        waitForEnter();

        gameTextWriter("""
                You wake up lying in a pool of shallow, cold water.
                Your clothes cling to your body, completely drenched.
                The air is damp and heavy, and the stench of mildew rises from your soaked shirt.""",
                40, Colors.RESET);
        waitForEnter();

        
    }





}