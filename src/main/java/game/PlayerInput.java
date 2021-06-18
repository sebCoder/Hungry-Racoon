package game;

import de.gurkenlabs.litiengine.input.Input;

import java.awt.event.KeyEvent;

public final class PlayerInput {
    private PlayerInput() {
    }

    public static void init() {
        // Mit ESC das Spiel verlassen
        Input.keyboard().onKeyPressed(KeyEvent.VK_ESCAPE, e -> System.exit(0));
    }
}
