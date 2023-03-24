import java.util.*;

public class p7_Search_in_Sorted_Matrix_Best_force {
    
    // this code is written by Priyanshu Gour

    public static boolean searchInSortedMatrix(int matrix[][], int key){
        
        int row = 0 ;
        int col = matrix[0].length - 1 ;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Found Key at :-  (" + row + "," + col + ")");
                return true ;
            }
            else if(key < matrix[row][col]) {
                col-- ;
            }
            else{
                row++ ;
            }
        }

        System.out.println("key not Founded ... ! ");
        return false ;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = {
                            {10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50},
                        };
        System.out.print( "Enter the Key to Search in Sorted Matrix :- ");
        int key = sc.nextInt();
        
        searchInSortedMatrix(matrix, key);
        
        
        sc.close();
    }
}
