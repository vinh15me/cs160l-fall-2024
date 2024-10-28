package edu.sdsu.cs160l;

import edu.sdsu.cs160l.algorithm.search.BinarySearch;

import java.util.ArrayList;

/**
 * Complete all todos (the final ones :) ) in
 * 1) {@link edu.sdsu.cs160l.algorithm.search.BinarySearch}
 * 2) {@link edu.sdsu.cs160l.algorithm.sort.MergeSort}
 * 3) {@link edu.sdsu.cs160l.datastructure.Parenthesis}
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            test.add(0);
        }
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(test, 5));
        System.out.println(binarySearch.search(test, 10));
        System.out.println(binarySearch.search(test, 20));
        System.out.println(binarySearch.search(test, 30));
        System.out.println("test");
    }
}
