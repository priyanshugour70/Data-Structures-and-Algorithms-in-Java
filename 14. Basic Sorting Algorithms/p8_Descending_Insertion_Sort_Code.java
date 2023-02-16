public class p8_Descending_Insertion_Sort_Code {
    
    // this code is writen by Priyanshu Gour
    
    public static void insertionSort(int arr[]){
        
        for(int i = 1 ; arr.length > i ; i++){
            int temp = arr[i];
            int j = i -1 ;

            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j]; 
                j--;
            }
            arr[j+1] = temp;
        }
        printArray(arr);
    }

    
    public static void decInsertionSort(int arr[]){
        
        for(int i = 1 ; arr.length > i ; i++){
            int temp = arr[i];
            int j = i - 1 ; 

            while(j >= 0 && arr[j] < temp){
                arr[j + 1] = arr[j];
                j-- ;
            }
            arr[j+1] = temp ;
        }
        printArray(arr);
    }


    public static void printArray(int arr[]){
        for(int i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        
        int arr[] = {3,6,2,1,8,7,4,5,3,1};

        insertionSort(arr);
        decInsertionSort(arr);
    }
}
