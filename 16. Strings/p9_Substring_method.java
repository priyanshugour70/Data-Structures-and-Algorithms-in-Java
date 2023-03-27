public class p9_Substring_method {
    

    public static String subString(String str, int m , int n){

        String strcpy = "";

        for(int i = 0 ; str.length() > i ; i++){
            if(i >= m && n > i){
                strcpy += str.charAt(i);
            }
        }

        return strcpy ;
    }
    public static void main(String[] args) {
        
        String hey = "priyanshu Gour" ;

        String sub = subString(hey,1,5);

        System.out.println(sub);
        System.out.println(hey.substring(5));
        System.out.println(hey.substring(1,5));
    }
}
