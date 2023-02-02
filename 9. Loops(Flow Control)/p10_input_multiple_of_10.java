import java.util.*;

public class p10_input_multiple_of_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int input;

        while(true){
            
            input = sc.nextInt();

            if(input % 10 == 0){
                break;
            }    
            System.out.println(input);
        }

        sc.close();
    }
}
