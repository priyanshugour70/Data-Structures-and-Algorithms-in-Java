import java.util.*;

public class p14_Decimal_to_Binary {

    // this code is writen by Priyanshu Gour
    
    public static int Decimal_to_Binary(int Dec){

        int binNum = 0 ;
        int rem = 0 ;
        int pow = 0 ;
        while(Dec > 0){
            rem =  Dec % 2 ;
            binNum += (rem * (int)(Math.pow(10,pow)));

            pow++;
            Dec /= 2; 

        }

        return binNum;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int Dec = sc.nextInt();

        int bin = Decimal_to_Binary(Dec);

        System.out.println("Binary Number of "+Dec+" is "+bin);

        sc.close();
    }
}
