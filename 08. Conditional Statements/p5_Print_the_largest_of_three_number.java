public class p5_Print_the_largest_of_three_number {

    // This Code is Written By Priyanshu Gour

    public static void main(String args[]){
        
        int a = 10 ;
        int b = 20 ;
        int c = 30 ;

        if(a > b && a > c){
            System.out.println("A is greater then B & C");
        }else if(b > a && b > c){
            System.out.println("B is greater then A & C");
        }else{
            System.out.println("C is greater then A & B");
        }
    }
}
