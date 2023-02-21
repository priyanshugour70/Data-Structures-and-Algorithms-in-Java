import java.util.*;

public class p5_product_of_a_and_b {

    // this code is writen by Priyanshu Gour
    
    public static int productoftwono(int a , int b){

        int productis = a * b ;

        return productis ;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int mulofab = productoftwono(a, b);

        System.out.println(mulofab);


        sc.close();
    }
}
