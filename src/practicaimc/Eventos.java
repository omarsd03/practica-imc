/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaimc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static practicaimc.Ventana.btnImc;

/**
 *
 * @author Omar
 */
public class Eventos implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(btnImc)) {
            new Metodos().CalculaImc();
        }
        
    }
    
}
