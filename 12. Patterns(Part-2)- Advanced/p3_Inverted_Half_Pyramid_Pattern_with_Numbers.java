import java.util.*;

public class p3_Inverted_Half_Pyramid_Pattern_with_Numbers {

    public static void Inverted_Half_Pyramid_Pattern_with_Numbers(int n ){
        int k = n ;
        for(int i = 1 ; n >= i ; i++ ){
            
            for(int j = 1 ; k >= j  ; j++){
                System.out.print(j+" ");
            }
            k--;
            System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Inverted_Half_Pyramid_Pattern_with_Numbers(n);  

        sc.close();
    }
}
