import java.util.Arrays;

public class p15_String_Anagrams {
    
    public static boolean checkAnagrams(String str1 , String str2) {
             
        str1 = str1.toLowerCase() ;
        str2 = str2.toLowerCase() ;

        str1 = str1.replaceAll(" ", "") ;
        str2 = str2.replaceAll(" ", "") ;

        char arrstr1 [] = str1.toCharArray() ;
        char arrstr2 [] = str2.toCharArray() ;

        Arrays.sort(arrstr1);
        Arrays.sort(arrstr2);

        if(arrstr1.length != arrstr2.length){
            return false ;
        }
        for(int i = 0 ; arrstr1.length > i ; i++){

            if(arrstr1[i] != arrstr2[i]){
                return false ;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        
        String str1 = "Priyanshu Gour" ;
        String str2 = "uh sy a ni rP oU rg" ;

        if(checkAnagrams(str1, str2)){
            System.out.println("String is Anagram ..!");
        }else{
            System.out.println("String is Not Anagram ..!");
        }
    }
}
