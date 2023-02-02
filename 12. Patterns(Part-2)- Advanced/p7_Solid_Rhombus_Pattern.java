import java.util.Scanner;

public class p7_Solid_Rhombus_Pattern {
    
    public static void Solid_Rhombus_Pattern(int n){

        for(int i = 1 ; n >= i ; i++){

            for(int j = 1 ; n-i >= j ; j++){
                System.out.print("  ");
            }
            for(int k = 1 ; n >= k ; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solid_Rhombus_Pattern(n);

        sc.close();
    }
}
