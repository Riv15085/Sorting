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
    
    // Referencia para el metodo recursivo mergeSort y merge: http://howtodoinjava.com/algorithm/merge-sort-java-example/
    public void mergeSort(Comparable[] lista){
        if (lista.length > 1) {
            //Separa el array en dos
            Comparable[] primero = new Comparable[lista.length / 2];
            Comparable[] segundo = new Comparable[lista.length - primero.length];
            System.arraycopy(lista, 0, primero, 0, primero.length);
            System.arraycopy(lista, primero.length, segundo, 0, segundo.length);

            //Parte recursivamente cada mitad
            mergeSort(primero);
            mergeSort(segundo);

            //Sobreescribe el array original mezclando las dos mitades
            merge(primero, segundo, lista);
            Nodo nodo1 = Cabeza; 
            for (Comparable lista1 : lista) {
                nodo1.setValor(lista1);
                nodo1 = nodo1.getSiguiente();
            }
        }
    }
    
     private static void merge(Comparable[] primero, Comparable[] segundo, Comparable[] resultado) 
    {
        //Index del primer array
        int iPrimero = 0;
         
        //Index del segundo array
        int iSegundo = 0;
         
        //Index del array mezclado
        int iMerged = 0;
         
        //Compare elements en iPrimero y iSegundo y mueve el mas pequenho en iMerged
        while (iPrimero < primero.length && iSegundo < segundo.length) 
        {
            if (primero[iPrimero].compareTo(segundo[iSegundo]) < 0) 
            {
                resultado[iMerged] = primero[iPrimero];
                iPrimero++;
            } 
            else
            {
                resultado[iMerged] = segundo[iSegundo];
                iSegundo++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(primero, iPrimero, resultado, iMerged, primero.length - iPrimero);
        System.arraycopy(segundo, iSegundo, resultado, iMerged, segundo.length - iSegundo);
    }

}
