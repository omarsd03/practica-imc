/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaimc;

import static practicaimc.Ventana.lblDieta1;
import static practicaimc.Ventana.lblDieta2;
import static practicaimc.Ventana.lblDieta3;
import static practicaimc.Ventana.lblImc;
import static practicaimc.Ventana.lblResultado;
import static practicaimc.Ventana.txtEstatura;
import static practicaimc.Ventana.txtPeso;

/**
 *
 * @author Omar
 */
public class Metodos {
    
    public void CalculaImc() {
        
        double peso = Double.parseDouble(txtPeso.getText());
        double estatura = Double.parseDouble(txtEstatura.getText());
        double imc;
        
        imc = peso/(estatura * estatura);
        
        lblImc.setText(String.valueOf("Su Indice de Masa Corporal es de: " + imc));
        lblResultado.setVisible(true);
        
        if (imc < 18.5) {
            lblResultado.setText("Usted tiene bajo peso");
            lblDieta1.setText("Comer frutas y legumbres");
            lblDieta2.setText("Comer carnes para obtener proteina");
            lblDieta3.setText("Beber suplementos alimenticios");
        }
        
        if (imc >= 18.5 && imc <= 24.9) {
            lblResultado.setText("Su peso es normal");
            lblDieta1.setText("Comer proteinas, frutas y verduras");
            lblDieta2.setText("Hacer 30 minutos al dia de ejercicio");
            lblDieta3.setText("Dormir 8 horas");
        }
        
        if (imc >= 25 && imc <= 29.9) {
            lblResultado.setText("Usted tiene sobrepeso");
            lblDieta1.setText("Hacer ejercicio 1 hora al dia");
            lblDieta2.setText("Comer cereales como avena");
            lblDieta3.setText("Evitar grasas saturadas");
        }
        
        if (imc >= 30) {
            lblResultado.setText("Usted tiene obesidad");
            lblDieta1.setText("Practicar algun deporte 1 hora al dia");
            lblDieta2.setText("Evitar comida rapida");
            lblDieta3.setText("Comer legumbres, frutas y cereales");
        }
        
    }
    
}
