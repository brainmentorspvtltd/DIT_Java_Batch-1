import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		System.out.println("Enter Gender:");
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter CGPA:");
		double cgpa = sc.nextDouble();
		
		System.out.println("Enter Phone Number:");
		long mobileNo = sc.nextLong();
		
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Gender is: "+gender);
		System.out.println("CGPA is: "+cgpa);
		System.out.println("Phone is: "+mobileNo);
	}

}
