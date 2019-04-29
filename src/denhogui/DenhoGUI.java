package denhogui;

import javax.swing.JFrame;

/**
 *
 * @author claudinei
 */
public class DenhoGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DrawSmalley rosto = new DrawSmalley();
        Alvo alvo = new Alvo();

        //Desenha o rosto
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(rosto);
        application.setSize(230, 250);

        application.setVisible(true);

        //Desenha um alvo com sores aleatórias
        JFrame alvoApplication = new JFrame();

        alvoApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        alvoApplication.add(alvo);
        alvoApplication.setSize(300, 300);

        alvoApplication.setVisible(true);

    }

}
