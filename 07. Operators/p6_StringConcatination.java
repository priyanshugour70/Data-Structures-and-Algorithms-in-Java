public class p6_StringConcatination {
    public static void main(String[] args) {
        String a = "sachin";
        int b = 10, c = 20, d = 30;
        System.out.println(a + b + c + d);// sachin102030
        System.out.println(b + c + d + a);// 60sachin
        System.out.println(b + c + a + d);// 30sachin30
        System.out.println(b + a + c + d);// 10sachin2030
    }
}