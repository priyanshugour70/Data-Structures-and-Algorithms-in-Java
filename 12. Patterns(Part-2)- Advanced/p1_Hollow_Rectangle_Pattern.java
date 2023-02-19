import java.util.*;

public class p1_Hollow_Rectangle_Pattern {

    // this code is writen by Priyanshu Gour
    
    public static void Hollow_rectangle(int row , int col){


        for(int i = 1 ; row >= i ; i++){

            for(int j = 1 ; col >= j ; j++ ){
                if(i == row || i == 1 || j == 1 || j == col){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();

        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        Hollow_rectangle(row , col);


        sc.close();
    }
}
