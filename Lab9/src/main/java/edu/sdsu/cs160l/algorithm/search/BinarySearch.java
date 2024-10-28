package edu.sdsu.cs160l.algorithm.search;

import java.util.List;

/**
 * TODO implement binary search in lab with your lab partners - ( 2 points )
 *  In class explanation + demonstration
 * refer to linear search as to checking equality
 * <p>
 * We basically ignore half of the elements just after one comparison.
 * <p>
 * Compare x with the middle element.
 * If x matches with the middle element, we return the mid index.
 * Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
 * Else (x is smaller) recur for the left half.
 */
public class BinarySearch implements Search {

    /**
     * Input to binary search will always be a sorted array.
     * write an algorithm that runs in O(log(n)) time, where n is input size
     * to compare value use .compareTo method rather than > or < operators
     */
    @Override
    public <T extends Comparable<? super T>> int search(List<T> list, T t) {
        boolean notFound = true;
        int start = 0;
        int end = list.size() - 1;
        while(notFound){
            int mid = (start + end) / 2;
            if(list.get(mid).compareTo(t) == 0){
                return mid;
            }
            else if(list.get(mid).compareTo(t) < 0){
                start = mid + 1;
            }
            else if(list.get(mid).compareTo(t) > 0){
                end = mid - 1;
            }
            else if(start == end){
                notFound = false;
            }
        }
        return -1;
    }
}
