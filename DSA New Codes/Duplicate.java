public class Duplicate {
    public static void main(String[] args) {

        int a[]={1,1,1,1,2,2,2,2,2,3,3,3,4,4,4,4,5,5,5};

        int j=0;

        for(int i=1;i<a.length;i++)
        {
            if(a[j]!=a[i])
            {
            j++;
            a[j]=a[i];
            }
        }
        for(int i=0;i<=j;i++)
        {
          System.out.println("Unique are "+a[i]);
        }
    }
}
