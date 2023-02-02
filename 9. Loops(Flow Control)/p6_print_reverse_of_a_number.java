public class p6_print_reverse_of_a_number {
    public static void main(String args[]){

        int dob = 40804 ;

        while(dob > 0){
            int lastdigit = dob % 10 ;
            System.out.print(lastdigit);
            dob = dob/10 ; 
        }
    }
}
