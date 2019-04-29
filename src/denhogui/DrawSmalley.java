/*
 *Exemplo do livro "Java como programar 8° edição"
 */
package denhogui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author claudinei
 */
public class DrawSmalley extends JPanel{
    public void paintComponent(Graphics g ){
        super.paintComponent(g);
        
        //Desenha o rosto na cor amarelo
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);
        
        //Desenha os olhos
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
        //Desenha a boca
        g.fillOval(50, 110, 120, 60);
        
        //Retoca a boca 
        g.setColor(Color.YELLOW);
        g.fillOval(50, 110, 120, 30);
        g.fillOval(50, 115, 125, 40);
    
    }
    
}
