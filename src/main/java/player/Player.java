package player;

import de.gurkenlabs.litiengine.IUpdateable;
import de.gurkenlabs.litiengine.entities.*;
import de.gurkenlabs.litiengine.physics.IMovementController;

@EntityInfo(width = 18, height = 18)
@MovementInfo(velocity = 150)
@CollisionInfo(collisionBoxWidth = 8, collisionBoxHeight = 16, collision = true)
public class Player extends Creature implements IUpdateable {
    private static Player instance;

    private Player(){
        super("Dean");
    }

    public static Player instance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    @Override
    public void update() {

    }

    @Override
    protected IMovementController createMovementController() {
        // Ermöglicht die Steuerung des Players
        return new PlayerMovementController<>(this);
    }
}
