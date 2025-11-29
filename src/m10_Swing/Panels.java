package m10_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panels extends JFrame {
    private JPanel panel;
    private JLabel label;

    public Panels() {
        setTitle("Ejemplo con JPanel y JButton");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Label donde mostraremos el texto
        label = new JLabel("Pulsa un botón", SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);

        // Panel inferior para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());

        // Botón 1
        JButton boton1 = new JButton("Botón 1");
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Has pulsado el Botón 1");
            }
        });

        // Botón 2
        JButton boton2 = new JButton("Botón 2");
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Has pulsado el Botón 2");
            }
        });

        // Añadir botones al panel
        panelBotones.add(boton1);
        panelBotones.add(boton2);

        panel.add(panelBotones, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Panels();
    }
}
