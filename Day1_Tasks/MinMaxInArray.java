package addon_new;

public class MinMaxInArray {
	
	    public static void main(String[] args) {
	        int[] numbers = {45, 3, 89, 12, 7, 99, -5, 34};

	        int min = numbers[0];
	        int max = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < min) {
	                min = numbers[i];
	            } else if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }

	        System.out.println("Minimum value: " + min);
	        System.out.println("Maximum value: " + max);
	    }
	}

