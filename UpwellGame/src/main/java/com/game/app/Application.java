package com.game.app;


import com.game.ui.Colors;
import com.game.ui.UserInterface;

// 1. Finish Battle Loop
// 2. Move Battle Loop to main()

public class Application {

    public static void main(String[] args) {

        // Added Classes
        UserInterface ui = new UserInterface();

        ui.printGameLogo();
        ui.introduction();
    }
}
