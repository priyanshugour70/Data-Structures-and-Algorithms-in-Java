public class p4_String_Concatenation {
    
    public static void main(String[] args) {
        String firstName = "Priyanshu" ;
        String lastName = "Gour" ;
        String fullName = firstName +" "+ lastName ;

        System.out.println(fullName);

        String fullName1 = firstName.concat(lastName);

        System.out.println(fullName1);
    }
}
