import java.util.*;

public class p10_Set_Ith_Bit {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find length ith :- ");
        int num = sc.nextInt();

        System.out.print("Enter get ith bit :- ");
        int ith = sc.nextInt();
 
        int ithBit = num << ith ;

        int last = num | ithBit ;
        
        System.out.println(last) ;
        sc.close();
    }
}