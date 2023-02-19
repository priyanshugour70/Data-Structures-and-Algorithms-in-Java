import java.util.*;

public class p11_Palindromic_Pattern_with_Numbers {

    // this code is writen by Priyanshu Gour

    public static void Palindromic_Pattern(int n){

        for(int i = 1 ; n >= i ; i++){

            int x = i ;

            for(int j = 1 ; n-i >= j ; j++){
                System.out.print("  ");
            }

            for(int k = 1 ; i >= k ; k++,x--){
                System.out.print(x+" ");
            }
            
            for(int l = 1 ; i-1 >= l ; l++){
                System.out.print(l+1+" ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Palindromic_Pattern(n);

        sc.close();
    }
}
