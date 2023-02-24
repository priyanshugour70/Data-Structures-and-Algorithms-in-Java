import java.util.*;

public class p12_print_number_except_multiples_of_10 {

    // this code is writen by Priyanshu Gour

    public static void main(String args[]){

        try (Scanner sc = new Scanner(System.in)) {

            int checknumber; 
            System.out.println("if you want to exit the loop then you will click '0'");
            while(true){
                
                checknumber = sc.nextInt();
                if(checknumber == 0){
                    break;
                }
                else if(checknumber%10 == 0 ){
                    continue;
                }
                System.out.println(checknumber);
            }
        }


    }
}
