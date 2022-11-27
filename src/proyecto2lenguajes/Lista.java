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
    int valor;
    Elemento nodoSiguente;

    public Lista(int valor, Elemento nodoSiguente) {
        this.valor = valor;
        this.nodoSiguente = nodoSiguente;
    }

    public Lista() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Elemento getNodoSiguente() {
        return nodoSiguente;
    }

    public void setNodoSiguente(Elemento nodoSiguente) {
        this.nodoSiguente = nodoSiguente;
    }
    
    public void agregarElemento( Elemento nuevoElemento) {
        
    }
    
    public void eliminarElemento( Elemento nuevoElemento) {
        
    }
    
    public void eliminar() {
        
    }
    
    public void insertionSort() {
        
    }
    
    public void binarySearch( int numeroBuscar) {
        
    }

    @Override
    public String toString() {
        return "Lista{" + "valor=" + valor + ", nodoSiguente=" + nodoSiguente + '}';
    }
    
}
