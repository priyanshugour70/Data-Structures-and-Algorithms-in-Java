import java.util.*;

// This Code is Written By Priyanshu Gour

public class p11_Area_of_Circle {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();

        float area =  (float) (3.14 * radius * radius) ;

        System.out.println(area);
        

        sc.close();
    }
}