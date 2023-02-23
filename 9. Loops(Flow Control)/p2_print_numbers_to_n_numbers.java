import java.util.*;

public class p2_print_numbers_to_n_numbers {

    // this code is writen by Priyanshu Gour
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int i = 1, n = sc.nextInt();

        while (i <= n) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
