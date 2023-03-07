import java.util.*;

// This Code is Written By Priyanshu Gour

public class p9_using_switch_Calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char c = sc.next().charAt(0);

        switch(c){
            case '-' : {
                System.out.println(a-b);
                break ;
            }
            case '+' : {
                System.out.println(a+b);
                break ;
            }
            case '/' : {
                System.out.println(a/b);
                break ;
            }
            case '*' : {
                System.out.println(a*b);
                break ;
            }
            case '%' : {
                System.out.println(a%b);
                break ;
            }
            default : {
                System.out.println("Please Enter valid Operator..");
            }
        }

        sc.close();
    }
}
