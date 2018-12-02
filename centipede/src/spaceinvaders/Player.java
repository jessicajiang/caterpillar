package spaceinvaders;

import java.awt.MouseInfo;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;

import javax.swing.ImageIcon;

public class Player extends Sprite implements Commons {

    private final int START_Y = 280;
    private final int START_X = 270;

    private final String playerImg = "src/images/octopus.png";
    private int width;

    public Player() {

        initPlayer();
    }

    private void initPlayer() {
        
        ImageIcon ii = new ImageIcon(playerImg);

        width = ii.getImage().getWidth(null);
        
        Point2D p = MouseInfo.getPointerInfo().getLocation();

        setImage(ii.getImage());
//        setX(START_X);
//        setY(START_Y);
        setX((int)p.getX());
        setY((int)p.getY());
    }

    public void act() {
        
        x += dx;
        
        if (x <= 2) {
            x = 2;
        }
        
        if (x >= BOARD_WIDTH - 2 * width) {
            x = BOARD_WIDTH - 2 * width;
        }
    }

//    public void keyPressed(KeyEvent e) {
//        
//        int key = e.getKeyCode();
//
//        if (key == KeyEvent.VK_LEFT) {
//        
//            dx = -2;
//        }
//
//        if (key == KeyEvent.VK_RIGHT) {
//        
//            dx = 2;
//        }
//    }
//
//    public void keyReleased(KeyEvent e) {
//        
//        int key = e.getKeyCode();
//
//        if (key == KeyEvent.VK_LEFT) {
//        
//            dx = 0;
//        }
//
//        if (key == KeyEvent.VK_RIGHT) {
//        
//            dx = 0;
//        }
//    }
}
