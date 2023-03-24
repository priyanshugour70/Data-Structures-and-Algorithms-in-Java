import java.util.*;

public class p6_Search_in_Sorted_Matrix_Brute_force {
    
    // this code is written by Priyanshu Gour

    public static void searchInSortedMatrix(int arr[][], int key){
        
        for(int i = 0 ; arr.length > i ; i++){
            for(int j = 0 ; arr[i].length > j ; j++){
                
                if(key == arr[i][j]){
                    System.out.println("(" + i + "," + j + ")");
                }

            }
        }

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