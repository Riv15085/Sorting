package sorting;

import java.io.IOException;
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
        String archivo="C:\\Users\\Usuario\\Documents\\NetBeansProjects\\SortingList\\src\\sortinglist\\prueba.txt";
        
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
        
        
        //miLista.mergeSort(listaArray); /*Se utiliza mergeSort*/
        //se utiliza seleccion sort
        miLista.selectionSort();
        miLista.Print();
        
        
        
       
        
        
        
        
    }
    
}
