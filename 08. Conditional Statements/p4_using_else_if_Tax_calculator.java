import java.util.*;

// This Code is Written By Priyanshu Gour

public class p4_using_else_if_Tax_calculator {
public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int income = sc.nextInt();

    if(income < 500000){
        System.out.println("You will give 0% tax.. :  0");
    }else if(income>500000 && 1000000 > income){
        System.out.println("You will give 20% tax... :  "+(income*0.2));
    }else{
        System.out.println("You will give 30% tax.. :  "+(income*0.3));
    }


sc.close();
    }
}
