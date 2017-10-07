package net.engl1tched.abyss.keyboard;

import net.engl1tched.abyss.keyboard.actions.ExitKeyboardAction;

import java.io.File;
import java.util.*;

import static org.lwjgl.input.Keyboard.KEY_ESCAPE;

/**
 * The keyboard mapping utility.
 *
 * @author Aram
 */
public class KeyboardMap {
    private static final List<KeyboardAction> actions = new ArrayList<>();
    private static final Map<String, Integer> keyMap = new HashMap<>();

    /**
     * Registers or overrides a keyboard action with the given key code.
     *
     * @param action  the keyboard action instance
     * @param keyCode the key code
     */
    public static void register(KeyboardAction action, Integer keyCode) {
        if (keyMap.containsKey(action.getName())) {
            keyMap.replace(action.getName(), keyCode);
        } else {
            actions.add(action);
            keyMap.put(action.getName(), keyCode);
        }
    }

    public static void onPress(Integer keyCode) {
        keyMap.entrySet().stream().filter(e -> Objects.equals(e.getValue(), keyCode)).forEach(e -> {
            Optional<KeyboardAction> action = getAction(e.getKey());
            action.ifPresent(KeyboardAction::onPressed);
        });
    }

    /**
     * Gets a keyboard action instance from its unique name.
     *
     * @param name the unique name of the keyboard action
     * @return the instance of the keyboard action, or no value if it does not exist
     */
    public static Optional<KeyboardAction> getAction(String name) {
        return actions.stream().filter(a -> a.getName().equals(name)).findFirst();
    }

    public static void onRelease(Integer keyCode) {
        keyMap.entrySet().stream().filter(e -> Objects.equals(e.getValue(), keyCode)).forEach(e -> {
            Optional<KeyboardAction> action = getAction(e.getKey());
            action.ifPresent(KeyboardAction::onReleased);
        });
    }

    /**
     * Loads mappings from a given text file.
     *
     * @param file the file to read the mappings from.
     */
    public static void loadMappings(File file) {
        // TODO: Implement this.
    }

    static {
        // Register defaults
        register(new ExitKeyboardAction(), KEY_ESCAPE);
    }
}
