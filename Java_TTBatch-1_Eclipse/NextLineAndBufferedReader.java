import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NextLineAndBufferedReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Integer:");
		//int a = sc.nextInt();
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter String:");
		//String b = sc.nextLine();
		String b = br.readLine();
		
		System.out.println("You have Entered "+a+" "+b);

	}

}
