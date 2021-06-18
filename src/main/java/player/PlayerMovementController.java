package player;

import de.gurkenlabs.litiengine.entities.IMobileEntity;
import de.gurkenlabs.litiengine.input.KeyboardEntityController;

/**
 *
 * @param <T>
 */
public class PlayerMovementController<T extends IMobileEntity> extends KeyboardEntityController {
    public PlayerMovementController(IMobileEntity entity) {
        super(entity);
    }

    public PlayerMovementController(IMobileEntity entity, int up, int down, int left, int right) {
        super(entity, up, down, left, right);
    }
}
