package arrays.array1;

/*
    author: Sanket Kutumbe

https://leetcode.com/problems/set-matrix-zeroes/
 */
public class SetMatrixZeroes {

    public static void main(String[] args) {

        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {

        // a[i,j] ---> a[i,0 to j] & a[0 to i, j]

        int cols = matrix[0].length;
        int rows = matrix.length;
        boolean root = false;

        for(int i = 0; i < rows; i++)
        {
            if(matrix[i][0] == 0) root = true;

            for(int j = 1; j < cols; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i = 1; i < rows; i++)
        {
            for(int j = 1; j < cols; j++)
            {
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
            }
        }

        if(matrix[0][0] == 0)
        {
            for(int j = 1; j < cols; j++)
            {
                matrix[0][j] = 0;
            }
        }

        if(root)
        {
            for(int i = 0; i < rows; i++)
                matrix[i][0] = 0;
        }
    }
}
