/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaimc;

import Componentes.MisComponentes;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Omar
 */
public class Ventana {
    
    static JLabel lblPeso, lblEstatura, lblImc, lblResultado, lblDieta, lblDieta1, lblDieta2, lblDieta3;
    static JTextField txtPeso, txtEstatura;
    static JButton btnImc;
    
    Ventana() {
        
        JFrame f = new JFrame("IMC");
        
        JPanel p = new JPanel();
        
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints restricciones = new GridBagConstraints();
        
        MisComponentes c = new MisComponentes();
        
        p.setLayout(gridBagLayout);
        f.setSize(400, 350);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblPeso = c.getLabel("Ingresa tu peso (Kg): ");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblPeso, restricciones);
        
        p.add(lblPeso);
        
        txtPeso = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtPeso, restricciones);
        
        p.add(txtPeso);
        
        lblEstatura = c.getLabel("Ingresa tu estatura (m): ");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblEstatura, restricciones);
        
        p.add(lblEstatura);
        
        txtEstatura = c.getField(10);
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtEstatura, restricciones);
        
        p.add(txtEstatura);
        
        lblImc = c.getLabel("Su Indice de Masa Corporal es de: ");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblImc, restricciones);
        
        p.add(lblImc);
        
        lblResultado = c.getLabel("");
        lblResultado.setVisible(false);
        
        restricciones.fill = GridBagConstraints.CENTER;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblResultado, restricciones);
        
        p.add(lblResultado);
        
        btnImc = c.getButton("Obtener IMC");
        btnImc.addActionListener(new Eventos());
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(btnImc, restricciones);
        
        p.add(btnImc);
        
        lblDieta = c.getLabel("Tu dieta es la siguiente: ");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblDieta, restricciones);
        
        p.add(lblDieta);
        
        lblDieta1 = c.getLabel("");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblDieta1, restricciones);
        
        p.add(lblDieta1);
        
        lblDieta2 = c.getLabel("");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblDieta2, restricciones);
        
        p.add(lblDieta2);
        
        lblDieta3 = c.getLabel("");
        
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.weightx = 0.0;
        restricciones.gridwidth = 2;
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblDieta3, restricciones);
        
        p.add(lblDieta3);
        
        f.add(p);
        
        f.setVisible(true);
        
    }
    
}
