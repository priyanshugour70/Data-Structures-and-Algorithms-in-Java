import java.util.*;

public class p6_Butterfly_Pattern {

    // this code is writen by Priyanshu Gour

    public static void Butterfly_Pattern(int n) {

        for (int i = 1; n >= i; i++) {

            for (int j = 1; i >= j; j++) {
                System.out.print("* ");
            }
            for (int k = 1; (n - i) * 2 >= k; k++) {
                System.out.print("  ");
            }
            for (int l = 1; i >= l; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1; n >= i; i++) {

            for (int j = 1; n - i + 1 >= j; j++) {
                System.out.print("* ");
            }
            for (int k = 1; (i - 1) * 2 >= k; k++) {
                System.out.print("  ");
            }
            for (int l = 1; n - i + 1 >= l; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Butterfly_Pattern(n);

        sc.close();
    }
}
