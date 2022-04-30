public class Snakes {

    public static void main(String[] args) {

        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<a[0].length;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            else
            {
             for(int j=a[0].length-1;j>=0;j--)
             {
                 System.out.print(a[i][j]+" ");
             }
            }
            System.out.println();
            }
        }
    }


