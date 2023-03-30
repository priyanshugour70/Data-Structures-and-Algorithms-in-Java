import java.util.Scanner;

public class p9_Get_ith_Bit {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find length ith :- ");
        int num = sc.nextInt();

        System.out.print("Enter get ith bit :- ");
        int ithBit = sc.nextInt();
 
        if((num & ithBit) == 0){
            System.out.println(" 0 th Nubmer..");
        }else{
            System.out.println(" 1 th Nubmer .. ");
        }

        sc.close();
    }
}