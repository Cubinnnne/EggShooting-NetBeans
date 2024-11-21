package eggshooter;

import java.awt.image.BufferedImage;
import javax.swing.JLabel;
public class Sprite extends JLabel{
    // declare new object BufferedImage
    private BufferedImage image;
    
    /**
     * getter
     * @return 
     */
    public BufferedImage getImage() {
        return image;
    }
    /**
     * setter
     * @param image 
     */
    public void setImage(BufferedImage image) {
        this.image = image;
        repaint();
    }
    
}
