package game;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.entities.Creature;
import de.gurkenlabs.litiengine.entities.Spawnpoint;
import de.gurkenlabs.litiengine.graphics.Camera;
import de.gurkenlabs.litiengine.graphics.PositionLockCamera;
import de.gurkenlabs.litiengine.resources.Resources;
import player.Player;

/**
 * Klasse für Spiellogik
 */
public class GameLogic {

    /**
     * Logik initilaisieren
     */
    public static void init() {
        // we'll use a camera in our game that is locked to the location of the player
        Camera camera = new PositionLockCamera(Player.instance());
        camera.setClampToMap(true);
        Game.world().setCamera(camera);

        // add default game logic for when a level was loaded
        Game.world().onLoaded(e -> {
            spawnSomeFruits();

            // spawn the player instance on the spawn point with the name "enter"
            Spawnpoint enter = e.getSpawnpoint("start");
            if (enter != null) {
                enter.spawn(Player.instance());
            }
        });
    }

    private static void spawnSomeFruits() {

    }
}
