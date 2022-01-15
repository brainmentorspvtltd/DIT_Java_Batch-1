import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Switch with string
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		String choice = sc.nextLine();
		
		switch(choice)
		{
			case "one":
				System.out.println("One");
				break;
				
			case "two":
				System.out.println("Two");
				break;
				
			case "five":
				System.out.println("Five");
				break;
				
			default:
				System.out.println("Invalid Choice");
		}
		
		System.out.println("Outside the Switch-Block");
		
//		int a = 5, b = 30, c = 100;
//		
//		String result = (a > b && a > c) ? "A is Greater" : ((b > c) 
//				? "B is Greater" : "C is Greater"); 
//		
//		System.out.println(result);
		
//		&& - And logical operator
		
//		if(a > b && a > c)
//		{
//			System.out.println("A is Greater");
//		}
//		else if(b > c)
//		{
//			System.out.println("B is Greater");
//		}
//		else {
//			System.out.println("C is Greater");
//		}
		
		
//		String status = "night";
//		
//		if(status == "night")
//		{
//			System.out.println("I Sleep");
//		}
//		//day
//		else {
//			System.out.println("Go for Work");
//		}
		
//		? : - conditional operator or ternary operator
//			
//		Ternary - 3
//			
//		Expression -1	Expression - 2 			Expression - 3  
//		(condition)    ? true 				: false;
			
			
//		String result = (status == "night") ? "I Sleep" : "Go for Work";	
//		
//		System.out.println(result);	
			
	}

}
