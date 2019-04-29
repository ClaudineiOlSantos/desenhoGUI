/*
 *Desenha um alvo na tela
 */
package denhogui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author claudinei
 */
public class Alvo extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random color = new Random();
        int diametro = 300;
        int fator = 40;
        

        /**
         * Para desenhar o alvo fiz esta pequena formula matemática para encontrar
         * o diâmetro e as margens esqueda e superior do próximo circulo.
         * 
         * Variáveis: m = margem, d = diametro, f = fator de diminuição,c = circulo
         *
         * m = {d - [d - (f * c)]}/2
         */
        for (int i = 0; i < 12; i++) {
            //Seleciona uma cor aleatória
            g.setColor(new Color(color.nextInt(255), color.nextInt(255), color.nextInt(255)));

            //confihura o próximo circulo
            g.fillOval(
                    (diametro - (diametro - fator * i)) / 2,
                    (diametro - (diametro - fator * i)) / 2,
                     diametro - (fator * i),
                     diametro - (fator * i));
        }
    }
}
