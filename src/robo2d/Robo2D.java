/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo2d;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author D1350
 */
public class Robo2D extends JPanel implements Runnable{
    
    Robo robo = new Robo();
    
    
    public Robo2D(){
        Thread processoGame = new Thread(this);
        processoGame.start();
    }

    @Override
    public void run() {
        while(true){
            update();
            repaint();
            dorme();
        }
    }

    private void update() {
        robo.update();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.setColor(Color.BLACK);
//        g.fillRect(10, 10, 100, 100);   
        
        robo.pintar(g);
        
    }

    private void dorme() {
        try {
            Thread.sleep(1000/60);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex + "Erro FPS");
        }
    }
    
    
    
    
    
}
