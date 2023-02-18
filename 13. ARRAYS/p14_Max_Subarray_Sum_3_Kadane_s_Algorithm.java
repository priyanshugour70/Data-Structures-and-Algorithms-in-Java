public class p14_Max_Subarray_Sum_3_Kadane_s_Algorithm {

    // this code is writen by Priyanshu Gour
    
    public static void Kadanes_Algorithm(int arr[]){

        int ms = Integer.MIN_VALUE ;
        int cs = 0 ;

        for(int i = 0 ; i < arr.length ; i++){

            cs = cs + arr[i];

            if(cs < 0){
                cs = 0 ;
            }

            ms = Math.max(cs, ms);
        }

        System.out.println("Maximum SubArray is(Using Kadane's Algorithm ) : "+ms);
    }

    public static void main(String args[]){

        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

        Kadanes_Algorithm(arr);
    }
}
