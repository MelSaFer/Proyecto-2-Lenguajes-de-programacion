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
public class Elemento {
    int valor;
    Elemento nodoSiguiente;

    public Elemento(int valor, Elemento nodoSiguiente) {
        this.valor = valor;
        this.nodoSiguiente = nodoSiguiente;
    }

    public Elemento() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Elemento getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Elemento nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
    
}
