import java.util.*;

public class p9_Sum_of_nth_row_in_2DArray {

    public static void sumOfNthRow(int arr[][], int row){
        
        int sum = 0 ;
        
        for(int i = 0 ; arr.length > i ; i++){
            for(int j = 0 ; arr.length > j ; j++){

                if(i+1 == row ){
                    sum += arr[i][j];
                }
                
            }
        }

        System.out.println("Sum of " +row+ "th Row is "+ sum );
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = {
                            {10,20,30,40},
                            {15,10,20,40},
                            {10,40,15,30},
                            {30,10,20,15},
                        };
                        
        System.out.print( "Enter the Row Number to check Sum of Nth Row :- ");
        int key = sc.nextInt();

        sumOfNthRow(matrix, key);

        sc.close();
    }
}
