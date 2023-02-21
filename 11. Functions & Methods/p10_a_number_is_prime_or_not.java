import java.util.*;

public class p10_a_number_is_prime_or_not {

    // this code is writen by Priyanshu Gour
    
    public static boolean checkprime(int a){

        boolean isprime = true ;

        for(int i = 2 ; a-1 >= i ; i++ ){
            if(a%i==0){
                isprime = false;
            }
        }

        return isprime ;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int primeornot = sc.nextInt();

        boolean primeis = checkprime(primeornot);

        if(primeis){
            System.out.println("Your No. is prime...");
        }else{
            System.out.println("Your No. is Not prime...");
        }


        sc.close();
    }
}
