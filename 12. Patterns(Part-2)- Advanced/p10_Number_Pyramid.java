import java.util.*;

public class p10_Number_Pyramid {
    
    public static void Number_Pyramid(int n){

        int count = 1 ; 

        for(int i = 1 ; n >= i ; i++){

            for(int j = 1 ; n-i >= j ;j++){
                System.out.print(" ");
            }
            for(int k = 1 ; i >= k ; k++){
                System.out.print(count+" ");
            }

            System.out.println();
            count++;
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Number_Pyramid(n);

        sc.close();
    }
}
