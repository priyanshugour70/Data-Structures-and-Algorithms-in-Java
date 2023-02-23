import java.util.*;

public class p14_Optmize_way_to_prime {

    // this code is writen by Priyanshu Gour

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean isprime = true ;

        if(num == 2){
            System.out.println(num + " is prime Number..");
        }else{
            for(int i = 2 ; Math.sqrt(num) >= i ; i++){
                if(num % i==0){
                    isprime = false;
                }
            }
        }

        if(isprime){
            System.out.println(num+" is prime...");
        }else{
            System.out.println(num+" is not prime");
        }

        sc.close();
    }
}
