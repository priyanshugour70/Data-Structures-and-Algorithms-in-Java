public class p13_Max_Subarray_Sum_2_Prefix_Sum {

    // this code is writen by Priyanshu Gour
    
    public static void Max_of_Subarray(int arr[]) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE ;
        int prefix[] = new int[arr.length];


        prefix[0] = arr[0];

        for(int i = 1 ; i < prefix.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; arr.length > i; i++) {
            
            for (int j = i; arr.length > j; j++) {
                
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

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
