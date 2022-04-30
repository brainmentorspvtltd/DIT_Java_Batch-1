import javax.lang.model.util.ElementScanner6;

public class Toeplitz {
    public static void main(String[] args) {
        int [][]matrix={
            {1,2,3,4},
            {5,1,2,3},
            {9,5,1,2}};
             int flag=1;
            for(int i=0;i<matrix.length-1;i++ )
            {
                for(int j=0;j<matrix[i].length-1;j++)
                {
                    if(matrix[i][j]==matrix[i+1][j+1])
                System.out.print(matrix[i][j]);
                else
                flag=0;
                }

                System.out.println();
            }

            if(flag==0)
            System.out.println("Not a Toeplitz Matrix");

    }

}
