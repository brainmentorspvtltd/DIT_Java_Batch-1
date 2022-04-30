public class MissingNo {

    public static void main(String[] args) {
        int a[]={1,2,3,5};
        int n=4;
        int total=1;
        for(int i=2;i<=(n+1);i++)
        {
            total+=i;
            total-=a[i-2];
        }
        System.out.println("Missing no. is "+total);
    }

}
