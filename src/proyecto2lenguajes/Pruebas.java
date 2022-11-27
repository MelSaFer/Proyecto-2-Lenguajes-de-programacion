/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2lenguajes;

/**
 *
 * @author melan
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista listaActual = new Lista();
        listaActual.agregarElemento(1);
        listaActual.agregarElemento(2);
        listaActual.agregarElemento(3);
        listaActual.agregarElemento(5);
        listaActual.agregarElemento(10);
        listaActual.agregarElemento(13);
        
       
        System.out.println(listaActual.binarySearch(5));
        
        
;
        
        
    }
    
}
