public class p17_Array_appears_at_least_twice {

    // this code is writen by Priyanshu Gour
    
    public static boolean arrayAppearsAtLeastTwice(int arr[]){

        for(int i = 0 ; arr.length > i ; i++){

            for(int j = i+1 ; arr.length > j ; j++){
                if(arr[i] == arr[j]){
                    return true ;
                }
            }
        }
        return false ;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,10};

        boolean appearence = arrayAppearsAtLeastTwice(arr);

        System.out.println(appearence);
    }
}
