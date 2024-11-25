package co.edu.uniandes.graphics.gui;

import javax.swing.*;

public class InterfazPrincipal extends JFrame {
    private static final long serialVersionUID = 1L;
    
    private PanelLienzo lienzo;

    public InterfazPrincipal() {
        setTitle("Mi Aplicación");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lienzo = new PanelLienzo();
        add(lienzo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }
}