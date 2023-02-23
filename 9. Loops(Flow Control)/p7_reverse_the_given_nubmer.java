public class p7_reverse_the_given_nubmer {
    public static void main(String args[]){


        // this code is writen by Priyanshu Gour
        
        int n = 12345 ;
        int temp = 0;
        
        while(n > 0){
            int lastdigit = n % 10 ;
            temp = (temp * 10) + lastdigit ;
            n = n/10;
        }
        n = temp;
        System.out.println(n);
    }
}
