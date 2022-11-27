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
public class Lista {
    Elemento nodoSiguiente;

    public Lista(Elemento nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public Lista() {
    }

    public Elemento getNodoSiguente() {
        return nodoSiguiente;
    }

    public void setNodoSiguente(Elemento nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
    
    public void agregarElemento(int valor) {
        
    }
    
    public void eliminarElemento( Elemento nuevoElemento) {
        
    }
    
    public void eliminar() {
        
    }
    
    public void insertionSort() {
        
    }
    
    public boolean binarySearch( int numeroBuscar) {
        Elemento ultimoElemento = null;
        Elemento primerElemento = this.nodoSiguiente;
        Elemento mitad;
        
        do{
            mitad = encontrarMedio(primerElemento, ultimoElemento);
            if(mitad == null ){
                return false;
            } 
            if (mitad.getValor() == numeroBuscar){
                return true;
            } 
            
            if (mitad.getNodoSiguiente() == null && mitad.getValor() != numeroBuscar){
                return false;
            }
            
            if (mitad.getValor() > numeroBuscar){
                ultimoElemento = mitad;
                
            } else if (mitad.getValor() < numeroBuscar){
                primerElemento = mitad;
            }
        }while(ultimoElemento == null || ultimoElemento != primerElemento);
        
        return false;         
    }
    
    public Elemento encontrarMedio( Elemento primerElemento, Elemento ultimoElemento){
        
        if (primerElemento == null){
            return null;
        }
        
        Elemento punteroLento = primerElemento;
        Elemento punteroRapido = primerElemento;
        
        while (punteroRapido != ultimoElemento){
            
            punteroRapido = punteroRapido.getNodoSiguiente();
            
            if(punteroRapido != ultimoElemento){
                punteroRapido = punteroRapido.getNodoSiguiente();
                punteroLento = punteroLento.getNodoSiguiente();
            } else{
                break;
            }
            
        }
        return punteroLento;
    }
    
}
