package com.game.app;


import com.game.entity.enemy.Entity;
import com.game.entity.enemy.Slime;
import com.game.entity.player.Player;
import com.game.ui.Colors;
import com.game.ui.UserInterface;

/** What's Next 05.30.26
 *  ✅ Turn battleLoop() Method into an actual loop with checking of death status
 *  🚧 Add HP Bars for Player and Enemies
 *  -> Add attack messages of weapons
 *  -> Add damage logic for other weapons
 *  -> Build Slime AI
 *  6.2
 *  🚧 Battle Loop ends for some reason after first attack
 *  🚧 Player has 25 HP? Should be 100
 *  6.1
 *  -> Add Colors for Enemies, Players and Attacks
 *  5.31
 *  ✅ Fix repetition of starter weapon choice
 *  ✅ Make Battle more battle Ui more compact
 *  ✅ Make Attack Screen UI more compact
 *  ✅ Loop doesn't end fight when slime dies
 */

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
