
public class Power {
	
	//Write a public static method called "toPower" that takes in as 
	//parameters two integers called size and power. 
	
	/*(The method should return an array of size "size" with each array 
	index raised to the value of "power." So, for example, if we passed 
	in "size = 4" and "power = 2" to the "toPower," 
	the method should return the following result: [0,1,4,9].)*/
		
	public static double[] toPower(int size, int power) {
		double[] returnValue = new double[size];
		
		for(int index=0; index<size; ++index) {
			returnValue[index] = Math.pow(index, power);
		}
		return returnValue; 
	}
	
	public static void main(String[]args)
	{
		double[] values = toPower(4, 2);
		
		for(double value:values) {
			System.out.println(value);
		}
	}

}
