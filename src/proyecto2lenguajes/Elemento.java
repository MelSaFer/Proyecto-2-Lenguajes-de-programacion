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
    Elemento nodoSiguente;

    public Elemento(int valor, Elemento nodoSiguente) {
        this.valor = valor;
        this.nodoSiguente = nodoSiguente;
    }

    public Elemento() {
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

    @Override
    public String toString() {
        return "Elemento{" + "valor=" + valor + ", nodoSiguente=" + nodoSiguente + '}';
    }
    
    
    
}
