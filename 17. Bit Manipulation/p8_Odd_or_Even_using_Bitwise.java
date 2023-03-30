import java.util.Scanner;

public class p8_Odd_or_Even_using_Bitwise {
    
    public static void main(String[] args) {
        
        // Number          Lastbit 0 then even or 1 then odd
        // 0 = 000                  0
        // 1 = 001                  1
        // 2 = 010                  0
        // 3 = 011                  1
        // 4 = 100                  0
        // 5 = 101                  1
        // 6 = 110                  0
        // 7 = 111                  1

        // (any number) & 0 = 00000
        // (any nubmer) & 1 = one is not one is look like (0000001 ) thats why all bits zero but last bit if (zero) then one else (one)then zero

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
 
        if((num & 1) == 0){
            System.out.println(num + " is Even Nubmer..");
        }else{
            System.out.println(num + " is Odd Nubmer .. ");
        }

        
        sc.close();
    }
}
