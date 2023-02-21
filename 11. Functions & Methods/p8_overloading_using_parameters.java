public class p8_overloading_using_parameters {

    // this code is writen by Priyanshu Gour
    
    public static int sum(int a, int b, int c){
        return a+b+c ;
    }
        // Function Overloading is know as the name of function is it same but its parameters are differents..
    public static int sum(int a , int b){
        return a+b ;
    }

    public static void main(String args[]){
        System.out.println(sum(5,2));
        System.out.println(sum(5,2,3));
    }
}
