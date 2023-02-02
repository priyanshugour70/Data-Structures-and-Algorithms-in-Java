import java.util.*;


public class p6_Factorial_in_java {
    
    public static int factorial(int a){
        int fact = 1 ;

        for(int i = 1 ; a >= i ; i++){
            fact *= i ;
        }

        return fact ;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        int fct = sc.nextInt();

        System.out.println(factorial(fct));

        sc.close();
    }
}
