public class p5_String_charAt {
    
    public static void printLetters(String str){

        for(int i = 0 ; str.length() > i ; i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        String name = "Priyanshu Gour" ;
        System.out.println(name.charAt(10));

        printLetters(name);
    }
}
