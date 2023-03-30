import java.util.Scanner;

public class p11_Clear_Ith_Bit {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter Number :- ");
        int num = sc.nextInt();

        System.out.print("Enter which Bit to Clear :- ");
        int ith = sc.nextInt();

        int clrBit = num << ith ;

        clrBit = ~(clrBit) ;

        int finlOutput = num & clrBit ;

        System.out.println(finlOutput);


        sc.close();
    }
}
