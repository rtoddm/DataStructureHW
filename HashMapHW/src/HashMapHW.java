import java.util.Scanner;
import java.util.HashMap;


public class HashMapHW {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		HashMap <String, String> Cars = new HashMap<>();
			Cars.put("Honda", "Accord");
			Cars.put("Toyota", "Camry");
			Cars.put("Ford","Taurus");
			Cars.put("Chevrolet", "Caprice");
			Cars.put("Volkswagen", "Beetle");
		
		
		System.out.println("What car are you looking for?");
		String newString = userInput.nextLine();
		System.out.printf("Oh We have a %s!\n", newString);
		System.out.printf("It is a %s:", newString + " " + Cars.get(newString) + ".");
			
			
			
	}
	

}
