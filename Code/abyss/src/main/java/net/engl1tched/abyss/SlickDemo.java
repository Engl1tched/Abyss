package net.engl1tched.abyss;

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
        container.setTargetFrameRate(30);
        container.start();
    }

    public SlickDemo() {
        super("henlo");
    }

    @Override
    public void init(GameContainer container) throws SlickException {

    }

    @Override
    public void update(GameContainer container, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        g.drawString("xd", 50, 50);
    }
}
