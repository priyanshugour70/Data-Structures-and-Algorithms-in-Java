public class p3_Arrays_as_Function_Arguments {

    public static void update(int array[]) {

        for (int i = 0; array.length > i; i++) {
            array[i] = array[i] + 1;
        }
        System.out.println(" In Function.. ");
        for (int i = 0; array.length > i; i++) {
            System.out.println(array[i]);
        }

    }

    public static void main(String args[]) {

        int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        update(array);

        System.out.println(" In Main.. ");
        for (int i = 0; array.length > i; i++) {
            System.out.println(array[i]);
        }
    }
}
