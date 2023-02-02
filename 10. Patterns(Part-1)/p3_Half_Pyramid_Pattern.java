import java.util.*;

public class p3_Half_Pyramid_Pattern {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1 ; n >= i ; i++){

            for(int j = 1 ; i >= j ; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }

        sc.close();
    }
}
