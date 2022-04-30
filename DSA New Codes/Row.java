public class Row {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
              //  System.out.println("Row Major");
               // System.out.print(arr[i][j]+" ");

               //System.out.println("Col Major");
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
    }
    }
}
