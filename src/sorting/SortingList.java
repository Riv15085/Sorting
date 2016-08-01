package sorting;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

/**
 *
 * Jorge Mario Tezen Cristales 15417
 */
public class SortingList {

  
    public static void main(String[] args) throws IOException {
        
        //se instancia una lista de tipo Integer
        Lista<Integer> miLista=new Lista<Integer>();
        String elemento=" ";
        int num;
        String archivo="C:\\Users\\diego\\Desktop\\Diego Rivera\\texto\\prueba.txt";
        
        Vector parrafo = Lector.leerArchivo(archivo);
        Integer[] listaArray = new Integer[parrafo.size()];
        
        //se accede al elemento del vector 
        for (int i = 0; i<parrafo.size();i++){
            elemento = (String) parrafo.elementAt(i);
            //se castea a int y se agrega a la lista
            num=Integer.parseInt(elemento);
            miLista.addNodo(num);
            listaArray[i] = (Integer)num;
        }
        //ArrayList<Integer> lista = new ArrayList();
        
        System.out.println("Ordenamiento con Bubble Sort");
        miLista.BubbleSort();
        miLista.Print();
        System.out.println("Ordenamiento con Merge Sort");
        miLista.mergeSort(listaArray);
        miLista.Print();
        System.out.println("Ordenamiento con Selection Sort");
        miLista.selectionSort();
        miLista.Print();
        /*List<Nodo> listaOrdenada = miLista.quicksort_execute(lista);
        System.out.println("Lista desordenada");
        System.out.println(lista);
        System.out.println("Lista ordenada");
        String listaOrdenadaToString = "";
        for (Nodo nodo : listaOrdenada) {
            listaOrdenadaToString += " "  + (int)nodo.getValor();
        }
        System.out.println(lista);*/
    }
}
