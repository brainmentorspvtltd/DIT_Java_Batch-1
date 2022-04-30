import java.util.Scanner;

public class DivTest {

    public static void main(String[] args) {

        System.out.println("enter the number");
        int a=new Scanner(System.in).nextInt();

        System.out.println("enter the divisor");
        int div=new Scanner(System.in).nextInt();
         try
         {
        if(div==0)
        System.out.println("U can't divide any no. by zero"+a/div);
        else
        System.out.println("Division is "+a/div);
         }catch(Exception e)
         {
             System.out.println("Exception caught:U can't divide any no. by zero"+e);
         }




    }

}
