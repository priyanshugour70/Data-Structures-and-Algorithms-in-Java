public class p5_Counting_Sort_Code {
    
    // this code is writen by Priyanshu Gour
    
    public static void countSort(int arr[]){
        int max = Integer.MIN_VALUE ;

        // for find max of value in arr..
        for(int i = 0 ; arr.length > i ; i++){
            max = Math.max(max, arr[i]);
        }

        // for initilization Array..
        int count[] = new int[max + 1];

        // for giving Zero value for each..
        for(int i = 0 ; count.length > i ; i++){
            count[i] = 0 ;
        }

        // put value on count array..
        for(int i = 0 ; arr.length > i ; i++){
            count[arr[i]]++;
        }

        int j = 0 ; 
        for(int i = 0 ; count.length > i ; i++){
            while(count[i] > 0){
                arr[j] = i ; 
                j++; 
                count[i]--;
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

        int arr[] = {5,3,7,6,3,5,4,6,3,6,8,2};

        countSort(arr);
        printArray(arr);
    }
}
