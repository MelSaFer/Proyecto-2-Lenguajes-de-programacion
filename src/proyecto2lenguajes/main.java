/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2lenguajes;

import Vista.MainFrame;

/**
 *
 * @author melan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista listaActual = new Lista();
        
        MainFrame ventanaPrincipal = new MainFrame(listaActual);
        ventanaPrincipal.setVisible(true);
  
        
    }
    
}
