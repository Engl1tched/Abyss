package net.engl1tched.abyss;

import net.engl1tched.abyss.keyboard.KeyboardMap;
import org.newdawn.slick.*;

/**
 * A demo Slick2D app.
 *
 * @author Simon
 * @author Aram
 */
public class SlickDemo extends BasicGame {

    public static void main(String[] args) throws SlickException {
        AppGameContainer container = new AppGameContainer(new SlickDemo());
        container.setDisplayMode(container.getScreenWidth(), container.getScreenHeight(), true);
        container.setTargetFrameRate(60);
        container.start();
    }

    public SlickDemo() {
        super("Abyss");
    }

    @Override
    public void keyReleased(int key, char c) {
        // TODO: Handle text-boxes to ignore game-level presses
        KeyboardMap.onRelease(key);
    }

    @Override
    public void keyPressed(int key, char c) {
        // TODO: Handle text-boxes to ignore game-level presses
        KeyboardMap.onPress(key);
    }

    @Override
    public void init(GameContainer container) throws SlickException {

    }

    @Override
    public void update(GameContainer container, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        g.drawString("Abyss", 50, 50);
    }
}
