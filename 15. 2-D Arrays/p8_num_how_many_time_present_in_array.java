import java.util.*;

public class p8_num_how_many_time_present_in_array {

    public static void checkHowManyTime(int arr[][], int num){
        
        int check = 0 ; 

        for(int i = 0 ; arr.length > i ; i++){
            for(int j = 0 ; arr.length > j ; j++){
                if(arr[i][j] == num ){
                    check ++ ;
                }
            }
        }

        System.out.println(num + " Presten in "+ check + " Time's .. !");
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = {
                            {10,20,30,40},
                            {15,10,20,40},
                            {10,40,15,30},
                            {30,10,20,15},
                        };
        System.out.print( "Enter the Number to Check how many time in the Matrix :- ");
        int key = sc.nextInt();

        checkHowManyTime(matrix, key);

        sc.close();
    }
}