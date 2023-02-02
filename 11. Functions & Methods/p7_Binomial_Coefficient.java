import java.util.*;

public class p7_Binomial_Coefficient {

    public static int factorial(int f) {
        int fact = 1;

        for (int i = 1; i <= f; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int Binomial_Coefficient(int n, int r) {

        int fn = factorial(n);
        int fr = factorial(r);
        int fnr = factorial(n - r);

        int binocoeff = fn / (fr * fnr);

        return binocoeff;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(Binomial_Coefficient(n, r));

        sc.close();
    }
}
