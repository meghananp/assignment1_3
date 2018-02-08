package org.stackroute;

import java.util.Arrays;

public class SortNew {
	public static void main(String[] args)
    {
        // Our arr contains 8 elements,
        int[] arr = {1,3,2,4,5};
 
        // Sort subarray from index 1 to 5, i.e.,
        // only sort subarray {7, 6, 45, 21, 9} and
        // keep other elements as it is.
        Arrays.sort(arr);
 
        System.out.print(Arrays.toString(arr));
    }

}
