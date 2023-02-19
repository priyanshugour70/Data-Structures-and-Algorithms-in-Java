import java.util.*;

public class p9_Diamod_Pattern {
    
    // this code is writen by Priyanshu Gour

    public static void Diamod_Pattern(int n){


        for(int i = 1 ; n >= i ; i++){

            for(int j = 1 ; n-i >= j ; j++){
                System.out.print("  ");
            }
            for(int k = 1 ; (2*i)-1 >= k ; k++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = n ; i >= 1 ; i--){

            for(int k = 1 ; (n-i) >= k ; k++){
                System.out.print("  ");
            }

            for(int j = 1 ; (2*i)-1 >= j ; j++ ){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Diamod_Pattern(n);

        sc.close();
    }
}
