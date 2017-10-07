package net.engl1tched.abyss.keyboard;

/**
 * Represents a keyboard action that can be executed.
 *
 * @author Aram
 */
public abstract class KeyboardAction {
    private final String name;

    public KeyboardAction(String name) {
        this.name = name;
    }

    public abstract void onReleased();

    public abstract void onPressed();

    public String getName() {
        return name;
    }
}
