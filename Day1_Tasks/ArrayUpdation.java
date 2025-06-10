package addon_new;

import java.util.Scanner;

public class ArrayUpdation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("Enter your Array Size");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Position to update:");
        int pos = sc.nextInt();

        System.out.println("Enter new value:");
        int value = sc.nextInt();

        arr[pos - 1] = value;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}