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
        //listaActual.agregarElemento(3);
        //listaActual.agregarElemento(4);
        //listaActual.agregarElemento(23);
        //listaActual.agregarElemento(2);
        //listaActual.agregarElemento(1);
        //listaActual.agregarElemento(50);
        
        
        //System.out.println(listaActual.estaEnLista(3));
        //listaActual.listar();
        //listaActual.insertionSort();
        //System.out.println("");
        //listaActual.listar();
        
        //System.out.println(listaActual.eliminarElemento(3));
        //listaActual.listar();
        //listaActual.eliminar();
        //listaActual.listar();
        MainFrame ventanaPrincipal = new MainFrame(listaActual);
        ventanaPrincipal.setVisible(true);
  
        
    }
    
}
