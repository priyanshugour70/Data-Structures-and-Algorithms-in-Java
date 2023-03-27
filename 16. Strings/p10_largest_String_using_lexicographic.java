public class p10_largest_String_using_lexicographic {
    
    public static void largestString(String str []){

        String largest = str[0];

        for(int i = 0 ; i < str.length ; i++){
            if(largest.compareToIgnoreCase(str[i]) < 0){
                largest = str[i] ;
            }
        }

        System.out.println(largest);
    }


    public static void main(String[] args) {
        
        String str1 = "Priyanshu" ;
        String str2 = "PriyanshU" ;

        // str1.compareTo(str2) ;
        // 'A' & 'a' both are different
        // 0 : equal
        // <0 : -ve   str1 < str2 
        // >0 : -ve   str1 > str2



        // str1.compareToIgnoreCase(str2) ;
        // 'A' & 'a' both are Same
        // 0 : equal
        // <0 : -ve   str1 < str2 
        // >0 : -ve   str1 > str2

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

        String fruits [] = {"Apple", "Banana", "Mango", "Gauva"};

        largestString(fruits);


    }
}
