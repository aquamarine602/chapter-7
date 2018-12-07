package chapter_7;

import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.out;

public class Number_analyzer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// user enters in a set of numbers
		out.print("Enter the number of items.\n"
				+ ":");
		int n = input.nextInt();
		
		// initialize variables
		double[] numbers = new double[n];
		double sum = 0;
		
		// get list of numbers from user
		out.println("\nEnter your numbers:");
		for (int i = 0; i < n; i ++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		// initialize more varibles
		double average = sum / n;
		int low = 0;
		int high = 0;
		
		// get the number of low and high numbers
		for (double element: numbers) {
			if (element < average) {
				low++;
			} else {
				high++;
			}
		}
		
		// initialize minimum and maximum
		double min = numbers[0];
		double max = numbers[0];
		
		// finds the smallest and largest numbers in the list
		for (double element:numbers) {
			if (element <= min) {
				min = element;
			} 
			if (element >= max){
				max = element;
			}
		}
		
		// MEDIAN FIRST ATTEMPT
		
		//double middle = (n - 1) / 2;
		//double rounded = 0;
		//double r1 = 0;
		//double rounded2 = 0;
		//double r2 = 0;
		//double median = 0;
		
		//if (middle % 1 == 0) {
			//median = numbers[(int) middle];
		//} else {
			//rounded = Math.round(middle);
			
			//if (rounded > middle) {
				//rounded2 = middle - 1;
			//}
			//if (rounded < middle) {
				//rounded2 = middle + 1;
			//}
			
			//r1 = numbers[(int) rounded];
			//r2 = numbers[(int) rounded];
			
			//median = (r1 + r2)/2;
		//}
		
		//out.println(median);
		
		// initialze mode variables
		double mode = 0;
		double max_count = 0;

		// get mode of numbers
	    for (int i = 0; i < n; ++i) {
	    	int count = 0;
	        for (int j = 0; j < n; ++j) {
	            if (numbers[j] == numbers[i]) {
	            	++count;
	            }
	        }
	        if (count > max_count) {
	            max_count = count;
	            mode = numbers[i];
	        }
	    }
	    
	    // sorts numbers
	    java.util.Arrays.sort(numbers);
	    
	    // initializes median variables
	    int middle = n/2;
	    double median = 0;
	    
	    // get median of numbers
	    if (n % 2 == 1) {
	        median = numbers[middle];
	    } else {
	        median = numbers[middle-1] + numbers[middle] / 2;
	    }
	    
		// prints all information
		out.println("\n\nThe average of your numbers is " + average + ".");
		out.println("\nThere are " + low + " below the average,\nand " + high + " above the average.");
		out.println("\nThe highest number in your list is " + max + ",\nand the lowest number in your list is " + min + ".");
		out.println("\n\nThe mean is " + average + ".");
		out.println("\nThe mode is " + mode + ".");
		out.println("\nThe median is " + median + ".");
		
	}

}
