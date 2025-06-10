package addon_day2;
import java.util.Arrays;
import java.util.Collections;

public class Array_Sorting_Day2_Task2 {
    public static void main(String[] args) {
        Integer[] userArray = {8, 3, 6, 1, 9, 4};
        System.out.println("Original Array: " + Arrays.toString(userArray));
        
        Integer[] sortedArray = new Integer[userArray.length];
        System.arraycopy(userArray, 0, sortedArray, 0, userArray.length);
        
        Arrays.sort(sortedArray, Collections.reverseOrder());
        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(sortedArray));
    }
}
