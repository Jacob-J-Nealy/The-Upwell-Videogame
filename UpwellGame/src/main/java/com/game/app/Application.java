package com.game.app;


import com.game.ui.Colors;
import com.game.ui.UserInterface;

public class Application {

    public static void main(String[] args) {

        // Added Classes
        UserInterface ui = new UserInterface();
        Colors colors    = new Colors();

        ui.printGameLogo();
        ui.introduction();
    }
}
