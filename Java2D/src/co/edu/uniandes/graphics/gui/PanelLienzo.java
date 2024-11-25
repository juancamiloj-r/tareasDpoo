package co.edu.uniandes.graphics.gui;

import javax.swing.*;
import java.awt.*;

public class PanelLienzo extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public PanelLienzo() {
        setPreferredSize(new Dimension(700, 700));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        Color gris = Color.GRAY;
        Color negro = Color.BLACK;

        // 1. Rectángulo base (gris)
        g2d.setColor(gris);
        g2d.fillRect(0, 0, 400, 400);

        // 2. Elipse (negro)
        g2d.setColor(negro);
        g2d.fillOval(350, 30, 100, 100);

        // 3. Rectángulo (negro)
        g2d.fillRect(390, 130, 20, 40);

        // 4. Rectángulo redondeado (negro)
        g2d.fillRoundRect(320, 170, 25, 180, 20, 20);

        // 5. Rectángulo redondeado (negro)
        g2d.fillRoundRect(455, 170, 25, 180, 20, 20);

        // 6. Rectángulo (negro)
        g2d.fillRect(335, 170, 130, 40);

        // 7. Rectángulo redondeado (gris)
        g2d.setColor(gris);
        g2d.fillRoundRect(345, 200, 15, 40, 20, 20);

        // 8. Rectángulo redondeado (gris)
        g2d.fillRoundRect(440, 200, 15, 40, 20, 20);

        // 9. Rectángulo (negro)
        g2d.setColor(negro);
        g2d.fillRect(360, 170, 80, 180);

        // 10. Rectángulo redondeado (negro)
        g2d.fillRoundRect(360, 330, 35, 180, 20, 20);

        // 11. Rectángulo redondeado (negro)
        g2d.fillRoundRect(405, 330, 35, 180, 20, 20);
        
        // Dibujar el polígono
        int[] xPoints = {230, 250, 550, 570};
        int[] yPoints = {550, 500, 500, 550};
        g2d.setColor(Color.BLACK);
        g2d.fillPolygon(xPoints, yPoints, 4);
    }
}