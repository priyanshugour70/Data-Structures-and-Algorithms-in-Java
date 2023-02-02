import java.util.*;

public class p10_Product_of_two_number {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int product = number1*number2;

        System.out.println(product);


        sc.close();
    }
}
