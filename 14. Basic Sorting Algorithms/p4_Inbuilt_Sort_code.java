import java.util.*;

public class p4_Inbuilt_Sort_code {
    

    public static void printArray(Integer arr[]){

        for(Integer i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Integer arr[] = {3,2,5,4,1,6,7};  // we will using premitive Datatypes because Collections.reverseOrder() Was working on premitive Datatypes...
        
        // both twos are Sorting in accending Order..
        Arrays.sort(arr);
        printArray(arr);
        Arrays.sort(arr,1,5); // this was not proper working because in runing type array was sorted you will run then first sort is comment then run ...
        printArray(arr);


        // both twos are Sorting in Decending Order..
        Arrays.sort(arr,Collections.reverseOrder());
        printArray(arr);
        Arrays.sort(arr,1,5,Collections.reverseOrder());  // this was not proper working because in runing type array was sorted you will run then first sort is comment then run ...
        printArray(arr);
        

    }
}
