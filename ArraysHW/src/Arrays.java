
public class Arrays {
	public static void main(String[] args) {
		
	//	Write a program to sum all the values of a given Array in Java.
		
		int [] myArray = {3, 6, 9, 4};
		
		int sum = 0;
		
		for(int i=0; i<myArray.length; i++) {
			sum += myArray[i];
		}
	
		
	//What is the output?	
		
		System.out.println("The total is: " + sum);
		
		
	}
	
	
}
