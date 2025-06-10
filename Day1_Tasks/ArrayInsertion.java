package addon_new;

import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int[] arr = new int[20];
			System.out.println("Enter your Array Size");
			int size = sc.nextInt();

			for (int i = 0; i < size; i++) {
			    arr[i] = sc.nextInt();
			}

			System.out.println("Enter Position to insert:");
			int pos = sc.nextInt();

			System.out.println("Enter value to insert:");
			int value = sc.nextInt();

			for (int i = size; i > pos - 1; i--) {
			    arr[i] = arr[i - 1];
			}

			arr[pos - 1] = value;
			size++;

			for (int i = 0; i < size; i++) {
			    System.out.print(arr[i] + " ");
			}
		}
    }
}