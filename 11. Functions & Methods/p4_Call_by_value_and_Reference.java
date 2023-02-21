public class p4_Call_by_value_and_Reference {

    // this code is writen by Priyanshu Gour
    
    public static void swap(int a , int b){ // this is the call by reference because does not change the actual value..

        int temp = a ;     // this is the call by reference .. because does not effect on the actual value...
        a = b ;     // this is the call by reference .. because does not effect on the actual value...
        b = temp ;     // this is the call by reference .. because does not effect on the actual value...

        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[]){  // ** in java always pass the value in function will pass as a copy ..
        
        int a = 34 ; // this is the actual value .. because changes are actual ..
        int b = 98 ; // this is the actual value .. because changes are actual ..

        swap(a, b);

        System.out.println("After the execution of function the value is : ");
        System.out.println(a);
        System.out.println(b);
    }
}
