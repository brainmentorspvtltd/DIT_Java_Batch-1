import java.util.LinkedList;
import java.util.List;

public class Lucky {

    public static void main(String[] args) {

        int arr[][]={{3,7,8},{9,11,13},{15,16,17}};

        List<Integer>minRow=new LinkedList<Integer>();
        List<Integer>maxCol=new LinkedList<Integer>();
        List<Integer>result=new LinkedList<Integer>();

        int minRowE=Integer.MAX_VALUE;
        int maxColE=Integer.MIN_VALUE;
        //collecting all the min values of row and store in minrow list
        for(int i=0;i<arr.length;i++)
        {
           for(int j=0;j<arr[i].length;j++)
           {
               minRowE=Math.min(minRowE,arr[i][j]);
           }

           minRow.add(minRowE);
           minRowE=Integer.MAX_VALUE;
        }
//collect all the max value of the col and store in maxcol list
        for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr[i].length;j++)
          {
              maxColE=Math.max(maxColE,arr[j][i]);
          }

          maxCol.add(maxColE);
          maxColE=Integer.MIN_VALUE;
        }
//it compare min in row and max in col are same so add in the result list and print result
        for(int each:minRow)
        {
            if(maxCol.contains(each))
            result.add(each);
        }
        System.out.println("Lucky no. is "+result);
    }

}
