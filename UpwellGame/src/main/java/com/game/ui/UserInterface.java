package com.game.ui;

import com.game.entity.enemy.Entity;
import com.game.entity.enemy.Slime;
import com.game.entity.player.Player;
import com.game.weapons.Weapon;
import com.game.weapons.player.Bow;
import com.game.weapons.player.Sword;
import com.game.weapons.player.TwinDaggers;
import java.util.Scanner;

public class UserInterface {

    Scanner scanner = new Scanner(System.in);
    Colors colors = new Colors();
    Player player = new Player();
    Slime slime = new Slime();

    // Application Helper Methods
    public void addColor(String text, String color) {

        /**
         * addColor() Explanation
         * This Method is used to display In-Game Prompts with Color
         */

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


    // Application Class Main Methods
    public void printGameLogo() {
        addColor("""
                _____ _            _   _                   _ _       \s
                |_   _| |          | | | |                 | | |      \s
                  | | | |__   ___  | | | |_ ____      _____| | |      \s
                  | | | '_ \\ / _ \\ | | | | '_ \\ \\ /\\ / / _ \\ | |      \s
                  | | | | | |  __/ | |_| | |_) \\ V  V /  __/ | |      \s
                  \\_/ |_| |_|\\___|  \\___/| .__/ \\_/\\_/ \\___|_|_|      \s
                                         | |                          \s
                                         |_|                          \s
                 _   _ _     _              _____                     \s
                | | | (_)   | |            |  __ \\                    \s
                | | | |_  __| | ___  ___   | |  \\/ __ _ _ __ ___   ___\s
                | | | | |/ _` |/ _ \\/ _ \\  | | __ / _` | '_ ` _ \\ / _ \\
                \\ \\_/ / | (_| |  __/ (_) | | |_\\ \\ (_| | | | | | |  __/
                 \\___/|_|\\__,_|\\___|\\___/   \\____/\\__,_|_| |_| |_|\\___|
                                                                      \s
                """, Colors.PURPLE);
        addColor("================================================================", Colors.CYAN);
    }
    public void introduction() {

        wakeUpSequence();
        discoverStairsSequence();
        scrollInteraction();
        findTunnelSequence();
        slimeEncounterSequence();
        battleLoop(player, slime);
    }
    public void battleLoop(Player player, Entity entity) {

        battleIntroduction(entity);
        displayBattleHud();
        playerTurn();

    }

    // introduction() helper methods
    public void wakeUpSequence() {

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
    }
    public void discoverStairsSequence() {
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
    }
    public void scrollInteraction() {

        addColor("""
                Etched in faded ink are three figures:
                - One holds a bow, steady and focused.
                - One grips a massive sword, its blade gleaming in the dim light.
                - One shrouded in a hood, crouched with twin daggers in hand.
                """, Colors.RESET);
        waitForEnter();

        addColor("PLAYER TURN (Select Option Below)\n", Colors.BOLD);
        System.out.println("________________________________");
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

                switch (intWeaponChoice) {
                    case 1 -> {
                        addColor("\nYou have a Chosen: ", Colors.BOLD);
                        addColor("Bow & Arrow\n\n", Colors.PURPLE);
                        player.setStarterWeapon(new Bow("Bow", 15, 15));
                        deciding = false;
                    }
                    case 2 -> {
                        addColor("\nYou have a Chosen: ", Colors.BOLD);
                        addColor("A Giant Sword\n\n", Colors.PURPLE);
                        player.setStarterWeapon(new Sword("Sword", 10, 20));
                        deciding = false;
                    }
                    case 3 -> {
                        addColor("\nYou have a Chosen: ", Colors.BOLD);
                        addColor("Twin Daggers\n\n", Colors.PURPLE);
                        player.setStarterWeapon(new TwinDaggers("Twin Daggers", 20, 10));
                        deciding = false;
                    }
                    default -> System.err.print("❌ Incorrect Input. Please Try Again: ");
                }
            } else {
                scanner.nextLine(); // scanner eater
                System.err.print("❌ Invalid input. Please enter a number: ");
            }
        }

        addColor("Suddenly, the scroll bursts into flames!", Colors.RED);
        waitForEnter();

        addColor("The " + player.getStarterWeapon() + " appears for you to Grab.", Colors.BRIGHT_WHITE);
        waitForEnter();

        addColor("What...What is Happening Right Now?", Colors.BRIGHT_WHITE);
        waitForEnter();

        addColor("Press ENTER to pick up the " + player.getStarterWeapon(), Colors.CYAN);
        waitForEnter();

        addColor("""
                You grasp the weapon with both hands.
                It feels... right — as if it was meant for you.
                """, Colors.RESET);
        waitForEnter();

    }
    public void findTunnelSequence() {
        addColor("""
                Without hesitation, you begin to ascend the makeshift staircase.
                Your boots splash in shallow puddles as you climb higher and higher...
                """, Colors.RESET);
        waitForEnter();

        addColor("The air grows colder.", Colors.BRIGHT_WHITE);
        waitForEnter();

        addColor("""
                Suddenly, the stairs stop.
                Built into the brick wall is a wide, open tunnel — carved unnaturally into the side of the well.
                The stone surrounding it is cracked and darkened... like something burst through it.
                """, Colors.RESET);
        waitForEnter();

        addColor("[Press ENTER to step into the tunnel...]", Colors.CYAN);
        waitForEnter();

        addColor("""
                You slowly step inside, your weapon ready...
                
                """, Colors.BRIGHT_WHITE);
        waitForEnter();
    }
    public void slimeEncounterSequence() {
            addColor("It's completely dark... and silent.", Colors.GREY);
            waitForEnter();

            addColor("Then-", Colors.GREY);
            waitForEnter();

            addColor("*SCHLOOP!*", Colors.GREEN);
            waitForEnter();

            addColor("Something wet slaps against the tunnel floor ahead.", Colors.YELLOW);
            waitForEnter();

            addColor("""
                It's a SLIME — glowing green, gelatinous, and wobbling aggressively.
                You can see bones floating inside it... maybe human.
                It jiggles with fury and lunges toward you!
                """, Colors.RED);
            waitForEnter();

            addColor("---‼️ ‼️a GREEN SLIME has appeared ‼️‼️---", Colors.GREEN);
            waitForEnter();

            addColor("[BATTLE START]", Colors.BOLD);
            waitForEnter();
        }

    // battleLoop() helper methods
    public void battleIntroduction(Entity entity) {
        addColor("---‼️ ‼️a " + entity.getName() + " has appeared ‼️‼️---", Colors.GREEN);
        waitForEnter();

        addColor("[BATTLE START]", Colors.BOLD);
        waitForEnter();
    }
    public void displayBattleHud(Player player, Entity entity) {


        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                        BATTLE                              ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.println("ENEMY :   " + entity.getName());
        System.out.println("ENEMY HP: " + entity.);


        System.out.println(""" 
                ╔════════════════════════════════════════════════════════════╗
                ║ BATTLE                                                     ║
                ╠════════════════════════════════════════════════════════════╣
                ║ ENEMY : GREEN SLIME                                        ║
                ║ HP    : ▓▓▓▓▓▓▓░░░ 14/20                                   ║
                ║ INTENT: ATTACKING                                          ║
                ╠════════════════════════════════════════════════════════════╣
                ║ PLAYER: JACOB                                              ║
                ║ HP    : ▓▓▓▓▓▓▓▓▓▓ 30/30                                   ║
                ║ WEAPON: TWIN DAGGERS                                       ║
                ╚════════════════════════════════════════════════════════════╝
                
                [1] ATTACK
                [2] DEFEND
                [3] INVENTORY
                
                Choose Action ➜
                
                """);



    }
    public void playerTurn() {


    }

    // Unused Helper Methods
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

}