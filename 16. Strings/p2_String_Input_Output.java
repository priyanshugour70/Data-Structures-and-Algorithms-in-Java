import java.util.*;

public class p2_String_Input_Output {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name :- ");
        String name = sc.next();
        System.out.println(name);

        System.out.print("Enter Your Full Name :- ");
        String fullName = sc.nextLine();
        System.out.println(fullName);



        sc.close();
    }
}
