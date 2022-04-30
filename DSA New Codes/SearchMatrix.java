public class SearchMatrix {
    public static void main(String[] args) {

        int a[][]={{10,20,30,40},
                   {15,25,35,45},
                   {27,29,37,48},
                   {32,33,39,50}};

                   int x=33;
                   int n=a.length;
                   int i=0;
                   int j=n-1;
                   while(i<n &&j>=0)
                   {
                       if(a[i][j]==x)
                       {
                           System.out.println("Element found at "+i+" "+j);
                           return;
                        }
                        if(a[i][j]>x)
                        j--;
                        else
                        i++;  //if(a[i][j]<x)
                   }


    }

}
