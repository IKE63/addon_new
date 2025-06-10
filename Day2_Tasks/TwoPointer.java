package addon_new;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        int start = 0;
        int end = num.length - 1;

        System.out.println("Before swapping: " + Arrays.toString(num));

        while (start < end) {
           
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

           
            start++;
            end--;
        }

        System.out.println("After swapping: " + Arrays.toString(num));
    }
}