import java.util.*;

public class p8_Hollow_Rhombus_Pattern {

    // this code is writen by Priyanshu Gour

    public static void Hollow_Rhombus_Pattern(int n) {

        for (int i = 1; n >= i; i++) {

            for (int j = 1; n - i >= j; j++) {
                System.out.print("  ");
            }
            for (int k = 1; n >= k; k++) {
                if (i == 1 || i == n || k == 1 || k == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Hollow_Rhombus_Pattern(n);

        sc.close();
    }
}
