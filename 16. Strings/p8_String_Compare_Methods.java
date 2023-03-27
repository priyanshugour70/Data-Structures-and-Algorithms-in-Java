public class p8_String_Compare_Methods {
    
    public static void main(String[] args) {
        
        String s1 = "Hey" ;
        String s2 = "Hey" ;
        String s3 = new String("Hey");

        if(s1 == s2){
            System.out.println("s1 and s2 are equal");
        }else{
            System.out.println("String are not equal..");
        }

        if(s1 == s3){
            System.out.println("s1 and s3 are equal");
        }else{
            System.out.println("String are not equal..");
        }

        if(s1.equals(s2)){
            System.out.println("s1 and s2 are equal");
        }else{
            System.out.println("String are not equal..");
        }

        if(s1.equals(s3)){
            System.out.println("s1 and s2 are equal");
        }else{
            System.out.println("String are not equal..");
        }

    }
}
