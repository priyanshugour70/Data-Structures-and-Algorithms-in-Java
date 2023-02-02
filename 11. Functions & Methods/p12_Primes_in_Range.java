import java.util.*;

public class p12_Primes_in_Range {
    
    public static boolean rangeprime(int n){

        if(n == 2 ){
            return true;
        }
        for(int i = 2 ; Math.sqrt(n) >= i ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true ;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 2 ; n >= i ; i++){
            if(rangeprime(i)){
                System.out.println(i+"is Prime Number.......!");
            }
        }


        sc.close();
    }
}
