
public class PrintDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 345;
		
		while(n > 0)
		{
			int remainder = n % 10; // 5, 4, 3
			System.out.println(remainder);
			n = n / 10;
		}

	}

}
