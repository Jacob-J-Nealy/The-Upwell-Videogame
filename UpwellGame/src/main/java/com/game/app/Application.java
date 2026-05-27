package com.game.app;


import com.game.entity.enemy.Entity;
import com.game.entity.enemy.Slime;
import com.game.entity.player.Player;
import com.game.ui.Colors;
import com.game.ui.UserInterface;

// 1. Finish Battle Loop
// 2. Move Battle Loop to main()

public class Application {

    public static void main(String[] args) {

        // Added Classes
        UserInterface ui = new UserInterface();
        Player player = new Player();
        Slime slime = new Slime();

        ui.printGameLogo();
        ui.introduction(player);
        ui.battleLoop(player, slime);
    }
}
