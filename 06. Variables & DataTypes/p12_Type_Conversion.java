import java.util.*;

public class p12_Type_Conversion {
    public static void main(String args[]){

        /*
         * Conversion happens when:
         * a. type compatible 
         * b. detination type > source type.
         *  byte -> short -> int -> float -> long -> double
         *and also type conversion is low to up ..
         */

         Scanner sc = new Scanner(System.in);

         float num = sc.nextInt();  // this is type conversion / widening / implicit

        System.out.println(num);

         sc.close();
    }
}
