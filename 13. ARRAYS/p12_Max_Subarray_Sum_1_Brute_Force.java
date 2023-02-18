public class p12_Max_Subarray_Sum_1_Brute_Force {

    // this code is writen by Priyanshu Gour

    public static void Max_of_Subarray(int arr[]) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE ;

        for (int i = 0; arr.length > i; i++) {
            
            for (int j = i; arr.length > j; j++) {
                sum = 0;
                System.out.print("(");
                for (int k = i; j >= k; k++) {
                    sum += arr[k];
                }
                System.out.print(sum);
                System.out.print(")");
                if(sum > maxSum){
                    maxSum = sum ;
                }
            }

            System.out.println();
        }
        System.out.println("Max of the arre is : "+maxSum);
    }

    public static void main(String args[]) {
        int arr[] = { 1,-2,6,-1,3};

        Max_of_Subarray(arr);
    }
}
