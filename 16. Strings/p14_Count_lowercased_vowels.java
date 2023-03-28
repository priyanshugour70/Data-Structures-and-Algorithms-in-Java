import java.util.Scanner;

public class p14_Count_lowercased_vowels {
       
    public static int countLowercaseVowels(String str) {
        int count = 0 ;
        for(int i = 0 ; str.length() > i ; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++ ;
            }
        }

        return count ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        String str = sc.nextLine() ;

        int vowels = countLowercaseVowels(str);

        System.out.println(vowels);
        
        sc.close();
    }
}