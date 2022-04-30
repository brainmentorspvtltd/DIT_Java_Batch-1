import javax.lang.model.util.ElementScanner6;

public class Toeplit {
    public static void main(String[] args) {

        int a[][]={{1,2,6,4},{5,1,2,6},{9,5,1,2}};


      for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a[i].length-1;j++)
            {
                if(a[i][j]!=a[i+1][j+1])
                {
                System.out.println("Not Topelitz matrix");
                return ;
                }
            }
        }

       System.out.println("Topelitz Matrix");
    }

}
