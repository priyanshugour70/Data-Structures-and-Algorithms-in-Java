import java.util.*;

public class p10_Transpose_of_Matrix {

    public static void matrixTranspose(int matrix[][]){
        
        int arr[][] = new int [matrix.length][matrix[0].length] ;

        for(int i = 0 ; matrix.length > i ; i++){
            for(int j = 0 ; matrix[i].length > j ; j++){
                
                arr [j][i] = matrix[i][j];

            }
        }

        printMatrix(arr);
    }

    public static void printMatrix(int arr[][]){
        for(int i = 0 ; arr.length > i ; i++){
            for(int j = 0 ; arr[i].length > j ; j++){
                 System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = {
                            {10,20,30,40},
                            {15,10,20,40},
                            {10,40,15,30},
                            {30,10,20,15},
                        };
                        
        matrixTranspose(matrix);

        sc.close();
    }
}
