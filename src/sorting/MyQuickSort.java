/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Quick sort algorithm (simple)
 * based on pseudo code on Wikipedia "Quick Sort" aricle
 * 
 * @see http://en.wikipedia.org/wiki/Quicksort#Simple_version
 * @author Enma Lopez
 *
 */
public class QuickSort {

    public List<Nodo> quicksort_execute(List<Integer> list) {
        List<Nodo> nodos = new ArrayList();
        for (int i: list) {
            nodos.add(new Nodo(i));
        }

        return quicksort(nodos);
    }

    /**
     * This method sort the input ArrayList of nodes using quick sort algorithm.
     * @param unorderedList the ArrayList of nodes
     * @return sorted ArrayList of nodes
     */
    private List<Nodo> quicksort(List<Nodo> unorderedList){

        if(unorderedList.size() <= 1) {
            return unorderedList;
        }

        // We calculate the middle of the list (So we get the element at the middle)
        int middle = (int) Math.ceil((double)unorderedList.size() / 2);

        // Our pivot is the middle element of the list
        Nodo pivotNode = unorderedList.get(middle);

        List<Nodo> underPivot = new ArrayList();
        List<Nodo> upPivot = new ArrayList();

        // We need to separate the list in two pieces, first the elements under de pivot
        // and the second the elements up to pivot
        for (int i = 0; i < unorderedList.size(); i++) {
            // We use the value (number) to know if is under or up to the pivot
            if ((int)unorderedList.get(i).getValor() <= (int)pivotNode.getValor()) {
                if (i == middle) {
                    continue;
                }
                underPivot.add(unorderedList.get(i));
            } else {
                upPivot.add(unorderedList.get(i));
            }
        }

        // The we recursively call quicksort. We do this because with this we order
        // Every half part of every list. So at the end we will have the initial list
        // ordered
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
}
