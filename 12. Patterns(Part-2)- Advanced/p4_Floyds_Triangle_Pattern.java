import java.util.*;

public class p4_Floyds_Triangle_Pattern {

    // this code is writen by Priyanshu Gour

    public static void Floyds_Triangle_Pattern(int n) {
        int count = 1;

        for (int i = 1; n >= i; i++) {

            for (int j = 1; i >= j; j++) {
                System.out.print(count + " ");
                count++;
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Floyds_Triangle_Pattern(n);

        sc.close();
    }
}
