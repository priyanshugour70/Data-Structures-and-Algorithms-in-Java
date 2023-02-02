public class p15_Trapping_Rainwater_Auxiliary_Array_IMP {


    public static int TrappedRainwater(int height[]){
        
        //Question. :- Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining...
        
        // Ans:-

        int n = height.length;
        //Calculate left max boundary -Auxiliary/Helper Array
        int leftmax[] = new int[n];

        leftmax[0] = height[0];

        for(int i = 1; n > i ; i++){
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);
        }

        //Calculate right max boundary -Auxiliary/Helper Array

        int rightmax[] = new int[n];

        rightmax[n-1] = height[n-1];

        for(int i = n-2 ; i >=0 ; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        // loop 
        int trappedWater = 0 ; 

        for(int i = 0 ; n > i; i++){

            //WaterLevel = min (leftmax bound, rightmax bound)
            int waterLevel = Math.min(rightmax[i],leftmax[i]);

            //Trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i] ;
        }

        return trappedWater ;

    }
    

    public static void main(String args[]){

        int height[] = {4,2,0,6,3,2,5};
        
        int trapWaterStore = TrappedRainwater(height);

        System.out.println("Total Water are Store in :  "+trapWaterStore);
    }
}
