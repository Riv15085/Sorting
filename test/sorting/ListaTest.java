/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class ListaTest {
    
    public ListaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class Lista.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Lista instance = new Lista();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isEmpty method, of class Lista.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addNodo method, of class Lista.
     */
    @Test
    public void testAddNodo() {
        System.out.println("addNodo");
        int valor = 0;
        Lista instance = new Lista();
        instance.addNodo(valor);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNodo method, of class Lista.
     */
    @Test
    public void testGetNodo() {
        System.out.println("getNodo");
        Lista instance = new Lista();
        Nodo expResult = null;
        Nodo result = instance.getNodo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Print method, of class Lista.
     */
    @Test
    public void testPrint() {
        System.out.println("Print");
        Lista instance = new Lista();
        instance.Print();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of selectionSort method, of class Lista.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("selectionSort");
        Lista instance = new Lista();
        instance.selectionSort();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mergeSort method, of class Lista.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        Comparable[] lista = null;
        Lista instance = new Lista();
        instance.mergeSort(lista);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of quicksort_execute method, of class Lista.
     */
    @Test
    public void testQuicksort_execute() {
        System.out.println("quicksort_execute");
        List<Integer> list = null;
        Lista instance = new Lista();
        List<Nodo> expResult = null;
        List<Nodo> result = instance.quicksort_execute(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of BubbleSort method, of class Lista.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        Lista instance = new Lista();
        instance.BubbleSort();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
