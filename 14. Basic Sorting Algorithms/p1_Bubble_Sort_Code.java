public class p1_Bubble_Sort_Code {


    // this code is writen by Priyanshu Gour

    public static void BubbleSort(int arr[]){

        for(int turn = 0 ; turn < arr.length-1 ; turn++){
            for(int j = 0 ; j < arr.length-1-turn ; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
    }
        
    public static void printArray(int arr[]){
        for(int i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){

        int bubble[] = { 5,9,4,1,6,8,3,7,2};

        BubbleSort(bubble);
        printArray(bubble);

    }
}