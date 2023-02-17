import java.util.*;

// this code is writen by Priyanshu Gour

public class p2_Array_input_output_update {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the size of Your array ? :  ");
        int size = sc.nextInt();

        int Numbers[] = new int[size];

        for(int i = 0 ; size > i ; i++){
            System.out.print("Enter "+i+1+" of value :  ");
            Numbers[i] = sc.nextInt();
        }

        for(int i = 0 ; size > i ; i++){
            System.out.println(Numbers[i]);
        }

        System.out.println("Length of an array is :  "+ Numbers.length);
        sc.close();       
    }
}
