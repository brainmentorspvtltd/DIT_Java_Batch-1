
public class FactorialNumber {
	
	public static void main(String[] args) {
		
//		5! = 5 * 4 * 3 * 2 * 1 = 120
		
		int i, fact = 1, n;
		
		n = 5;
		
		for(i = 1; i <= n; i++)
		{
			fact *= i;
		}	
		
		System.out.println("Factorial is: "+fact);
	}

}
