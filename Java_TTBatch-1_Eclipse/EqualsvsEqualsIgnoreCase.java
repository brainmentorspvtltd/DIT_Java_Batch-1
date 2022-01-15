
public class EqualsvsEqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		equals() vs equalsIgnorecase()
		
		String str1 = "hello";
		String str2 = "Hello";
		
		if(str1.equals(str2)) {
			System.out.println("String str1 is equal to str2");
		}
		else {
			System.out.println("String str1 is not equal to str2");
		}
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("String str1 is equal to str2");
		}
		else {
			System.out.println("String str1 is not equal to str2");
		}

	}

}
