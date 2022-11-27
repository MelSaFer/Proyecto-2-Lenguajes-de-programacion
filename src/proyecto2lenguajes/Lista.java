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
    
    // agrega el numero al final de la lista
    public void agregarElemento(int valor_) {
        Elemento nuevoElemento = new Elemento();
        nuevoElemento.setValor(valor_);
        // esta vacia la lista
        if(nodoSiguiente == null){
            nodoSiguiente = nuevoElemento;
        }
        else{
            Elemento recorrer = nodoSiguiente;
            while(recorrer.getNodoSiguiente() != null){
                recorrer = recorrer.getNodoSiguiente();
            }
            recorrer.setNodoSiguiente(nuevoElemento);
        }        
    }
    
    // agrega el numero al inicio de la lista
    public void agregarElementoI(int valor_) {
        Elemento nuevoElemento = new Elemento();
        nuevoElemento.setValor(valor_);
        nuevoElemento.setNodoSiguiente(nodoSiguiente);
        nodoSiguiente = nuevoElemento;
    }
    
    // retorna true en caso de que se encuentre el numero en la lista
    public boolean estaEnLista (int valor){
        Elemento elementoAux = nodoSiguiente;
        boolean esta = false;
        while(elementoAux != null && !esta){
            if(elementoAux.getValor() == valor){
                esta = true;
            }
            else{
                elementoAux = elementoAux.getNodoSiguiente();
            }
        }
        return esta;
    }
    
    // elimina la primera apacicion del elemento seleccionado
    // retorna 1 en caso de que se borre
    public int eliminarElemento(int valorEliminar) {
        // la lista tiene elementos
        if(nodoSiguiente != null){
            
            // el elemento esta en la lista
            if(estaEnLista(valorEliminar)){
                
                // el primer elemento es el que se quiere eliminar
                if(nodoSiguiente.getValor() == valorEliminar){
                    nodoSiguiente = nodoSiguiente.getNodoSiguiente();
                    return 1;
                }
                else{
                    Elemento aux_borrar = nodoSiguiente; // copia de la lista
                    Elemento aux = null; // se utiliza para eliminar el elemento

                    // recorre los elementos de la lista hasta que el siguiente sea
                    // el buscado
                    while(aux_borrar.getNodoSiguiente().getValor() != valorEliminar){
                        aux_borrar = aux_borrar.getNodoSiguiente();
                    }

                    aux = aux_borrar.getNodoSiguiente().getNodoSiguiente();
                    aux_borrar.setNodoSiguiente(aux);
                    return 1;
                }
            }
        }
        
        return 0;
    }
    
    // vacia la lista de numeros
    public void eliminar() {
        nodoSiguiente = null;
    }
    
    public void insertionSort() {

        Elemento listaResultado = null;
        Elemento elementoActual = nodoSiguiente;
        Elemento siguiente = null;

        while (elementoActual != null){

            siguiente = elementoActual.nodoSiguiente;
            
            // la lista resultado es vacia o su cabeza es >= al elemento actual
            if(listaResultado == null || listaResultado.getValor() >= elementoActual.getValor()){
                elementoActual.setNodoSiguiente(listaResultado); // avanza en la lista el elemento actual
                listaResultado = elementoActual;
            }
            else{
                // lista auxiliar que se utiliza para insertar el elemento en la lista ordenada
                Elemento aux = listaResultado; 
                
                // se busca la posicion en la que se tiene que insetar el elemento
                while(aux.getNodoSiguiente() != null && aux.getNodoSiguiente().getValor() < elementoActual.getValor()){
                    aux = aux.getNodoSiguiente();
                }
                // se inserta el elemento en el lugar correcto de forma ascendente
                elementoActual.setNodoSiguiente(aux.getNodoSiguiente());
                aux.setNodoSiguiente(elementoActual);
            }
            
            // se avanza en la lista
            elementoActual = siguiente;
        }

        // guardar el resultado
        this.nodoSiguiente = listaResultado;
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
    
    // imprime los valores de la lista
    public void listar(){
        if (nodoSiguiente != null) {
            Elemento aux = nodoSiguiente;
            while(aux != null){
                System.out.print(aux.getValor() + ", ");
                aux = aux.getNodoSiguiente();
            }
        }

    }
    
}
