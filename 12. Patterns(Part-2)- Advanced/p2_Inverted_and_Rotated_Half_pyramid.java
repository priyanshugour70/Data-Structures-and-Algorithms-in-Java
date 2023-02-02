import java.util.*;

public class p2_Inverted_and_Rotated_Half_pyramid {

    public static void Inverted_Rotated_Half_Pyramid(int n ){

        for(int i = 1 ; n >= i ; i++){

            for(int j = 1 ; n-i >= j ; j++){
                System.out.print("  ");
            }
            for(int k = 1 ; i >= k ; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Inverted_Rotated_Half_Pyramid(n);

        sc.close();
    }
}
