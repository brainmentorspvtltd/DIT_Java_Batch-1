import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalAndBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		double a = 0.03;
//		double b = 0.04;
//		double c = b - a;
		
//		BigDecimal a = new BigDecimal("0.03");
//		BigDecimal b = new BigDecimal("0.04");
//		BigDecimal c = b.subtract(a);
		
		BigInteger a = new BigInteger("8954998599");
		BigInteger b = new BigInteger("7635785873");
		BigInteger c = a.add(b);
		
		System.out.println(c);

	}

}
