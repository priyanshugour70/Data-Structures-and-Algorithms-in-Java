import java.util.Scanner;

public class p13_Clear_Last_I_Bits {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.print("Enter Ith Number : ");
        int ith = sc.nextInt();

        int bitMask = (~0)<<ith ;

        int fnylOutput = num & bitMask ;

        System.out.println(fnylOutput);

        sc.close();
    }
}
