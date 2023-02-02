import java.util.*;

public class p2_Search_key_in_2D_Array_Code {
    
    public static void searchMatrix(int arr[][] , int key ) {

        boolean find = false ;
        int n = arr.length ;
        int m = arr[0].length ;

        for(int i = 0 ; n > i ; i++){
            for(int j = 0 ; m > j ; j++){
                if(key == arr[i][j]){
                    find = true ;
                }
            }
        }

        if(find){ 
            System.out.println("Element Finded .."); 
        }else{
            System.out.println("Element Not Founded...");
    }
}


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


    public static void main(String args[]){
        
        int arr[][] = new int [3][3];

        int key = 5 ;
        
        inputMatrix(arr);
        searchMatrix(arr,key);
    }
}
