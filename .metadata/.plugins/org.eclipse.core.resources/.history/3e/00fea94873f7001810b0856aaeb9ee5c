package spaceinvaders;

import javax.swing.ImageIcon;

public class Mushroom extends Sprite {

	private final String mushroomImg = "src/images/moon.png";
	private final String oneLeftImg = "src/images/oneLeft.png";
	private final String twoLeftImg = "src/images/twoLeft.png";
	private boolean destroyed;
	private int lives = 3;

    public Mushroom(int x, int y) {

        initMushroom(x, y);
    }

    private void initMushroom(int x, int y) {

        this.x = x;
        this.y = y;

        ImageIcon ii = new ImageIcon(mushroomImg);
        setImage(ii.getImage());
    }
    
    public void setDestroyed(boolean destroyed) {
        
        this.destroyed = destroyed;
    }

    public boolean isDestroyed() {
    
        return destroyed;
    }
    
    public int getLives() {
    	return this.lives;
    }
    
    public void isShot() {
    	this.lives--;
    	if (this.lives == 0) {
    		setDestroyed(true);
    	} else if (this.lives == 1) {
    		ImageIcon ii = new ImageIcon(oneLeftImg);
    		setImage(ii.getImage());
    	} else if (this.lives == 2) {
    		ImageIcon i2 = new ImageIcon(twoLeftImg);
    		setImage(i2.getImage());
    	} else {
    		System.out.println("Error");
    	}
    }
}
