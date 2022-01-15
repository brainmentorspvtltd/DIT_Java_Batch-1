
public class EqualtovsEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		== vs equals()
		
		String str1 = new String("HELLO");
		String str2 = new String("HELLO");
		
		System.out.println(str1 == str2); // false 
		System.out.println(str1.equals(str2)); // true

	}

}
