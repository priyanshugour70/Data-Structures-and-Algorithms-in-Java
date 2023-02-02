import java.util.HashSet;

public class p18_Array_appears_at_least_twice_Approch2 {

    public static boolean arrayAppearsAtLeastTwice(int nums[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10 };

        boolean appearence = arrayAppearsAtLeastTwice(arr);

        System.out.println(appearence);
    }
}
