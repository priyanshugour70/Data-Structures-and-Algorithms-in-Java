import java.util.*;

public class p11_a_number_is_prime_or_not_Optimized {

    public static boolean optimized_prime(int a) {

        boolean isprime = true;

        for(int i = 1 ; Math.sqrt(a) >= i ; i++){
            if(a % i == 0){
                isprime = false;
            }
        }

        return isprime ;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean primeis = optimized_prime(n);

        if (primeis) {
            System.out.println("Your No. is Prime..");
        } else {
            System.out.println("Your No. id NOT Prime..");
        }

        sc.close();
    }

}
