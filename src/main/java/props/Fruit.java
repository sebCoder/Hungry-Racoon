package props;

import de.gurkenlabs.litiengine.attributes.Attribute;
import de.gurkenlabs.litiengine.entities.EntityInfo;
import de.gurkenlabs.litiengine.entities.IMobileEntity;
import de.gurkenlabs.litiengine.entities.Prop;
import de.gurkenlabs.litiengine.physics.IMovementController;

@EntityInfo(width = 32, height = 32)
public class Fruit extends Prop implements IMobileEntity {
    public Fruit(String spritesheetName) {
        super(spritesheetName);
    }

    @Override
    public void onMoved(EntityMovedListener listener) {

    }

    @Override
    public void removeMovedListener(EntityMovedListener listener) {

    }

    @Override
    public int getAcceleration() {
        return 0;
    }

    @Override
    public int getDeceleration() {
        return 0;
    }

    @Override
    public Attribute<Float> getVelocity() {
        return new Attribute<Float>(150F);
    }

    @Override
    public float getTickVelocity() {
        return 0;
    }

    @Override
    public IMovementController movement() {
        return null;
    }

    @Override
    public void setAcceleration(int acceleration) {

    }

    @Override
    public void setDeceleration(int deceleration) {

    }

    @Override
    public void setTurnOnMove(boolean turn) {

    }

    @Override
    public void setVelocity(float velocity) {

    }

    @Override
    public boolean turnOnMove() {
        return false;
    }
}
