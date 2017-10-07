package net.engl1tched.abyss.keyboard.actions;

import net.engl1tched.abyss.keyboard.KeyboardAction;

/**
 * A demo keyboard action that closes the application when the associated key is released.
 *
 * @author Aram
 */
public class ExitKeyboardAction extends KeyboardAction {
    public ExitKeyboardAction() {
        super("keyboard.application.exit");
    }

    @Override
    public void onReleased() {
        // Exit the application
        System.exit(0);
    }

    @Override
    public void onPressed() {
    }
}
