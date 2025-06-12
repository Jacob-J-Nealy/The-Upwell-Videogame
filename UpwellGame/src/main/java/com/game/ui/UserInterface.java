package com.game.ui;

import java.util.Scanner;

public class UserInterface {

    Scanner scanner = new Scanner(System.in);
    Colors colors = new Colors();

    // Helper Methods
    public void slowTextWriter(String text, int delay, String color) {
        System.out.print(color);

        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Colors.RESET);
        System.out.println();
    }

    /**
     * addColor() Explanation
     * This Method is used to display In-Game Prompts with Color
     */
    public void addColor(String text, String color) {
        System.out.print(color + text + Colors.RESET);

    }

    public void waitForEnter() {

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println();
                break;
            } else {
                System.err.println("PLEASE PRESS 'ENTER' TO CONTINUE");
            }
        }
    }
    public void waitForInput_3choice() {

        while (true) {
            int input = scanner.nextInt();

            if (input == 1 || input == 2 || input == 3) {
                System.out.println();
                break;
            } else {
                System.err.println("PLEASE ENTER A VALID OPTION");
            }
        }
    }
    public void starterWeaponChoice() {

    }

    public void introduction() {
        addColor(
                "\nTip: Press 'ENTER' to continue dialogue throughout game.",
                Colors.BOLD);
        waitForEnter();

        addColor(
                "It's dark...",
                Colors.BRIGHT_WHITE);
        waitForEnter();

        addColor(
                "Where am I?",
                Colors.BRIGHT_WHITE);
        waitForEnter();

        addColor("""
        You wake up lying in a pool of shallow, cold water.
        Your clothes cling to your body, completely drenched.
        The air is damp and heavy, and the stench of mildew rises from your soaked shirt.
        """, Colors.RESET);
        waitForEnter();

        addColor(
                "Was I... unconscious?",
                Colors.BRIGHT_WHITE);
        waitForEnter();

        addColor("""
        As your eyes adjust, you take in your surroundings:
        You’re inside a massive, circular chamber—like the bottom of a well.
        Ancient bricks stack upward, perfectly uniform, disappearing into darkness.
        The floor is flooded, water sloshing around your ankles.
        """, Colors.RESET);
        waitForEnter();

        addColor(
                "Then you see it...",
                Colors.YELLOW);
        waitForEnter();

        addColor("""
        Far above you, a faint glow — a light shining from the very top of the well.""",
                Colors.BRIGHT_WHITE);
        waitForEnter();

        addColor("I need to get out of here.", Colors.BRIGHT_WHITE);
        waitForEnter();

        addColor("""
        You look around. Carved bricks extend out from the wall, 
        staggered like makeshift stairs spiraling toward the light.
        """, Colors.RESET);
        waitForEnter();

        addColor("[Press ENTER to approach the stairs...]", Colors.CYAN);
        waitForEnter();

        addColor("As you walk toward the stairs, something catches your eye...", Colors.RESET);
        waitForEnter();

        addColor("A weathered scroll lies on the first step.", Colors.YELLOW);
        waitForEnter();

        addColor("[Press ENTER to pick up the scroll...]", Colors.CYAN);
        waitForEnter();

        addColor("""
        Etched in faded ink are three figures:
        - One holds a bow, steady and focused.
        - One grips a massive sword, its blade gleaming in the dim light.
        - One shrouded in a hood, crouched with twin daggers in hand.
        """, Colors.RESET);
        waitForEnter();

        addColor("PLAYER TURN", Colors.BOLD);
        System.out.println("[1] What is that- An Archer?");
        System.out.println("[2] Is that a...A Swordsman?");
        System.out.println("[3] It looks sneaky, is it a Thief?");
        addColor("Please SELECT a SPEAKING Option by Pressing the Corresponding Key Here ➡ ", Colors.CYAN);


        boolean deciding = true;
        int intWeaponChoice = -1;

        while (deciding) {

            if (scanner.hasNextInt()) {
                intWeaponChoice = scanner.nextInt();
                scanner.nextLine(); // scanner eater
            }

            addColor("\nYou have a Chosen: ", Colors.BOLD);

            switch (intWeaponChoice) {
                case 1  -> {addColor("Bow & Arrow\n\n",   Colors.PURPLE);   deciding = false; }
                case 2  -> {addColor("A Giant Sword\n\n", Colors.PURPLE); deciding = false; }
                case 3  -> {addColor("Twin Daggers\n\n",  Colors.PURPLE);  deciding = false; }
                default -> addColor("❌ Incorrect Input. Please Try Again: ", Colors.RED);
            }
        }

        addColor("Suddenly, the scroll bursts into flames!", Colors.RED);
        waitForEnter();

        addColor("In its place — three weapons lie before you.", Colors.RESET);
        waitForEnter();

        addColor("[Choose your weapon]", Colors.YELLOW);
        waitForEnter();
    }


}