import java.util.*;

public class p5_0_1_Triangle_Pattern {
    
    // this code is writen by Priyanshu Gour

    public static void _0_1_Triangle_Pattern(int n){


        for(int i = 1 ; n >= i ; i++){

            for(int j = 1 ; i >= j ; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        _0_1_Triangle_Pattern(n);


        sc.close();
    }
}
