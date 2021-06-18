package game;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.resources.Resources;

public class Start {
    public static void main(String[] args) {
        Game.info().setName("Hungry Racoon");
        Game.info().setDescription("Hungry Racoon is allways hungry.");
        Game.info().setVersion("0.0.1");
        Game.info().setDevelopers("Seb");

        Game.init(args);

        Game.graphics().setBaseRenderScale(3.001f);

        Resources.load("src/main/resources/racoon.litidata");

        GameLogic.init();
        PlayerInput.init();

        // add the screens that will help you organize the different states of your game
        Game.screens().add(new IngameScreen());

        // load the first level (resources for the map were implicitly loaded from the game file)
        Game.world().loadEnvironment("wiese2");

        Game.start();
    }
}
