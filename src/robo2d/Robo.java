package robo2d;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import modelos.robo;

/**
 *
 * @author D1350
 */
public class Robo extends robo {

    robo r = new robo();

    private BufferedImage roboIdle[];

    public Robo() {

        // Robo iddle              
        roboIdle = new BufferedImage[10];
        for (int i = 0; i < 10; i++) {
            String idle = "src/Sprites/Idle (" + (1 + 1) + ").png";
            try {
                roboIdle[i] = ImageIO.read(new File(idle));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex + "Imagens iddle não carregadas");
            }
        }

    }
    
    public void pintar(Graphics g){
        
        g.drawImage(roboIdle[r.getIdleAtual()], r.getPosX(), r.getPosY(), r.getPosX() + r.getLargura(), r.getPosY() + r.getAltura(), 0, 0, roboIdle[r.getIdleAtual()].getWidth(), roboIdle[r.getIdleAtual()].getHeight(), null );
        
    }
        

}
