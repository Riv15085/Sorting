package sorting;

/**
 *Enma Lopez 15122
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
        public List<Nodo> quicksort_execute(List<Integer> list) {
        List<Nodo> nodos = new ArrayList();
        for (int i: list) {
            nodos.add(new Nodo(i));
        }

        return quicksort(nodos);
    }

    /**
     * Codigo tomando de Quick sort pseudo code on Wikipedia "Quick Sort" aricle
     * @see http://en.wikipedia.org/wiki/Quicksort#Simple_version
     * Este metodo ingresa ArrayList de nodos usando el algoritmo de quick sort
     * @param recibe como parametro una lista desordenada de un Array List de nodos
     * @return devuelve ArrayList de nodss
     */
       private List<Nodo> quicksort(List<Nodo> unorderedList){

        if(unorderedList.size() <= 1) {
            return unorderedList;
        }

        //Se calculcula el pivote que esta en la mitad de la lista 
        int middle = (int) Math.ceil((double)unorderedList.size() / 2);

        // Se asigna el valor del pivote
        Nodo pivotNode = unorderedList.get(middle);

        List<Nodo> underPivot = new ArrayList();
        List<Nodo> upPivot = new ArrayList();

        //Separamos la lista en dos arryas, el primer elemento debajo del pivote y el segundo elemento arriba del pivote 
        
        for (int i = 0; i < unorderedList.size(); i++) {
            // Se usa el valor para cmpara con el pivote si es menor o mayor
            if ((int)unorderedList.get(i).getValor() <= (int)pivotNode.getValor()) {
                if (i == middle) {
                    continue;
                }
                underPivot.add(unorderedList.get(i));
            } else {
                upPivot.add(unorderedList.get(i));
            }
        }

        // Luego llamamos de nuevo a quick sort hacemos esto para ordenarlo denuevo
        // Cada parte dividida en la lista hasta tener la lista iniciar
        // ordenada
        return concatenate(quicksort(underPivot), pivotNode, quicksort(upPivot));
    }

    private List<Nodo> concatenate(List<Nodo> less, Nodo pivot, List<Nodo> greater) {

            List<Nodo> list = new ArrayList();

            for (int i = 0; i < less.size(); i++) {
                    list.add(less.get(i));
            }

            list.add(pivot);

            for (int i = 0; i < greater.size(); i++) {
                    list.add(greater.get(i));
            }

            return list;
    }
    public void BubbleSort(){
        boolean orden = true;
        while (orden){
            orden= false;
            for (Nodo nodo1=Cabeza; nodo1!=null; nodo1=nodo1.getSiguiente()){
                Nodo valor = nodo1;
                if (nodo1.getSiguiente()!= null){
                   Nodo nodo2 = nodo1.getSiguiente();
                   
                   if (nodo2.compareTo(valor.getValor())==1){
                       valor = nodo2;
                       Nodo temp = new Nodo(nodo1.getValor());
                       nodo1.Valor = valor.Valor;
                       valor.Valor = temp.Valor;
                       orden = true;
                }
                }
            }
        }
    }
}
