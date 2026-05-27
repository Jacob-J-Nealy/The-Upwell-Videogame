package com.game.app;


import com.game.ui.Colors;
import com.game.ui.UserInterface;

// 2. Make Dialogue After Slime Fight a Method
// 3. Plan and Battle Sequence with Words
// 4. Plan with Code
// 5. Code Battle Sequence Method

public class Application {

    public static void main(String[] args) {

        // Added Classes
        UserInterface ui = new UserInterface();
        Colors colors    = new Colors();

        ui.printGameLogo();
        ui.introduction();
    }
}
