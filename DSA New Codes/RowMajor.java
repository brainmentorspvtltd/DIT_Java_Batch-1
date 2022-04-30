public class RowMajor {

    public static void main(String[] args) {

        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Row Major *******************");


        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");//Row Major

            }
            System.out.println();
        }
        System.out.println("Col Major *******************");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[j][i]+" ");//col Major
            }
            System.out.println();
        }


    }
}
