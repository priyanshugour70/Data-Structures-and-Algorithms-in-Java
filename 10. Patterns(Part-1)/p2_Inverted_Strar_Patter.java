import java.util.*;

public class p2_Inverted_Strar_Patter {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; n >= i ; n--){
            
            for(int j = 1 ; n >= j ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
