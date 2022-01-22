
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ram";
		char str2[] = str.toCharArray();
		
//		str2[] = {'R', 'a', 'm'};
		
		//Two Pointer Approach
		
		int i = 0; // first index of the array
		int j = str2.length - 1; // last index of the array
		
		while(i < j) // 0 < 2, 1 < 1
		{
			char temp = str2[i];
			str2[i] = str2[j];
			str2[j] = temp;
			
			i++; // 1
			j--; // 1
		}
		
		for(char n : str2)
		{
			System.out.print(n);
		}

	}

}
