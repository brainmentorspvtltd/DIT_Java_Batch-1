
public class ReverseNumber {
	public static void main(String[] args) {
		int n = 345;
		int reverse = 0;
		
		while(n > 0)
		{
			int remainder = n % 10; // 5, 4, 3
			reverse = reverse * 10 + remainder; // 543
			n = n / 10;
		}
		
		System.out.println("Reverse Number is: "+reverse);
	}
}
