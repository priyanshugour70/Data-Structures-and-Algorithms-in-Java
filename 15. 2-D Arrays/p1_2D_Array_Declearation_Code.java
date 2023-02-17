import java.util.*;

// Starting of 2D- Array Let's Start
// this code is writen by Priyanshu Gour 

public class p1_2D_Array_Declearation_Code {
    

    public static void inputMatrix(int matrix [] []){
        
        int n = matrix.length ;
        int m = matrix[0].length ;

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; n > i ; i++){
        
            for(int j = 0 ; m > j ; j++){
        
                matrix[i][j] = sc.nextInt();
        
            }
        }

        sc.close();
    }


    public static void printMatrix(int matrix [][]){

        int n = matrix.length ;
        int m = matrix[0].length ;

        for(int i = 0 ; n > i ; i++ ){
            
            for(int j = 0 ; m > j ; j++ ){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        int matrix [][] = new int [2][5];

        inputMatrix(matrix);
        printMatrix(matrix);
    }

}