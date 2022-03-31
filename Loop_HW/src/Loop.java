import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Loop {
	
	public static void main(String[]args) {
		Scanner userInput=new Scanner(System.in);
		
	//UserInput placed in an ArrayList
		
		System.out.println("Enter five numbers.");
		List<Integer> numbers = new ArrayList<>();
		
		
		for(int i=0; i<5; ++i) {
			String value =userInput.nextLine();
			int number = Integer.parseInt(value);
			numbers.add(number);
			}
		
		
	//Find the sum, product, largest, and smallest of these numbers. 
		
		int sum = 0;
		int product = 1;
		
		for(Integer number : numbers) {
			sum += number;
			product *= number;
		}
		
		int max = Collections.max(numbers);
		int min = Collections.min(numbers);
		
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		System.out.println("Largest: " + max);
		System.out.println("Smallest: " + min);
		
		
		}	
	}
		
		
		
		
		
		
		
	


