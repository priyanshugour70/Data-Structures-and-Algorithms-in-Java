import java.util.*;

public class p6_Palindrome_String {
    
    public static boolean checkPalindrome(String str){

        for(int i = 0 ; str.length()/2 > i ; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false ;
            }
        }

        return true ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(checkPalindrome(str)){
            System.out.println("String is Palindrome ..");
        }else{
            System.out.println("String is Not Palindrome ..");
        }

        sc.close();
    }
}
