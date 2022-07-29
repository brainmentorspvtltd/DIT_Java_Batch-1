import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number : ");
        int number = sc.nextInt();
        if((number & 1) == 0) {
            System.out.println("Number is Even...");
        }
        else {
            System.out.println("Number is Odd...");
        }
        sc.close();
    }
}
