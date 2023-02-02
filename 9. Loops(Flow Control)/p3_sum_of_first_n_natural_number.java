import java.util.*;

public class p3_sum_of_first_n_natural_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, i = 1 , n = sc.nextInt();

        while(i <= n){
            sum += i;
            i++;
        }

        System.out.println(sum);

        sc.close();
    }
}
