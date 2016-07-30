package sorting;

/**
 *
 * Jorge Tezen 15417
 * @param <T>
 */

import java.util.*;

public class Lista<T> {

    Nodo Cabeza;
    int Largo=0;
    ArrayList array = new ArrayList();
    
    public int size() {
        return Largo;
    }

    
    public boolean isEmpty() {
        return  Largo==0;
    }
	
	
    public void addNodo(int valor){
        if (Cabeza == null){
            Cabeza = new Nodo(valor);
        }
        else{
            Nodo nodoActual = Cabeza;
            while (nodoActual.getSiguiente() != null){
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente( new Nodo(valor));
        }
    }
	
    public Nodo getNodo(){
        Nodo nodoActual = Cabeza;
        Cabeza = Cabeza.getSiguiente();
        return nodoActual;
    }
    
    public void Print(){
        Nodo nodo=Cabeza;
        while(nodo!=null){
               System.out.println(nodo.Valor);
               nodo=nodo.Siguiente;
        }
    }
    
    public void selectionSort(){
        for(Nodo nodo1=Cabeza; nodo1!=null; nodo1=nodo1.getSiguiente()){
            Nodo min=nodo1; //nodo min es el nodo a considerar
            
            for(Nodo nodo2=nodo1; nodo2!=null; nodo2=nodo2.getSiguiente()){
                if(nodo2.compareTo(min.getValor())==1){
                    min=nodo2;
                }
            }
            //swap el min con el nodo es su posicion actual
            Nodo temp = new Nodo(nodo1.getValor());
            nodo1.Valor= min.Valor;
            min.Valor=temp.Valor;

        }
    
    }

}