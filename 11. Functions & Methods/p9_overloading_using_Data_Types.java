public class p9_overloading_using_Data_Types {

    // this code is writen by Priyanshu Gour

    public static float sum(double d, double e) {
        return (float) (d + e) ;
    }

    // Function Overloading using DataTypes... same as it is function only change the datatype of function...
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println(sum(5.32, 2.31));
        System.out.println(sum(5, 2));
    }
}
