static int countWaysMemo(int currentValue,int endValue,int []cache){
    //     // Termination Case
    //     if(currentValue==endValue){
    //         return 1;
    //     }
    //     //Edge case
    //     if(currentValue>endValue){ 
    //         return 0;
    //     }
    //     if(cache[currentValue]!=0){
    //         return cache[currentValue];
    //     }

    //     int count=0; //for each recursion call count set to 0
    //     int newValue=0;
    //     for(int dice=1;dice<=6;dice++){
    //         newValue=currentValue+dice; // Small Problem
    //         count=count+countWaysMemo(newValue, endValue,cache);
    //     }
    //     cache[currentValue]=count;
    //     return count;
    // }