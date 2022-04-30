public class Missing {

    public static void main(String[] args) {

        int arr[]={2,1,3,4,6};

        int x=0,y=0,min=1,max=6;

        for(int i=0;i<arr.length;i++)
        x=x^arr[i];
       for(int i=min;i<=max;i++)
       y=y^i;
       System.out.println("Result is "+(x^y));
    }

}
