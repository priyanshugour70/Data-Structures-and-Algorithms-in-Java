import java.util.*;

public class p13_Binary_to_Decimal {

    // this code is writen by Priyanshu Gour

    public static void Binary_to_Decimal(int b) {

        int myNum = b ;
        int pow = 0 ; 
        int decNum = 0 ;

        while(b > 0){
            int lastDigit = b % 10 ;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            b = b/10 ;
        }

        System.out.println("Binary number of "+myNum+" is "+decNum);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();

        Binary_to_Decimal(binary);

        sc.close();
    }
}
