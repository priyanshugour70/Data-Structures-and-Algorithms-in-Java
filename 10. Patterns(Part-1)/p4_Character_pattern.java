import java.util.*;

public class p4_Character_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char ch = 'A';
        int n = sc.nextInt();

        for(int i = 1 ; n >= i ; i++ ){

            for(int j = 1 ; i >= j ; j++){
                System.out.print(ch+" ");
                ch++;
            }

            System.out.println();
        }

        sc.close();
    }
}
