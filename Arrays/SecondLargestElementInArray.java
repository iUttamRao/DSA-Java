public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int arr[]= {10,20,5,15,11,12};
        int max = -1;
        int secondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondLargest=max;
                max=arr[i];
            }
            if(arr[i]!=max){ //current element is not
                if(arr[i]>secondLargest){
                    secondLargest=arr[i];
                }
            }
        }
        System.out.println("First Max "+ max +" Second Max "+ secondLargest);

        // Two for loop used
        
        // int max = arr[0];
        // for(int i=0;i<arr.length-1;i++){
        //     if(max<arr[i+1]){ 
        //         max=arr[i+1];
        //     }
        // }
        // System.out.println("First Largest: "+ max);
        // int secondLargest = arr[0];
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i+1]!=max){
        //         if(secondLargest<arr[i+1]){
        //             secondLargest=arr[i+1];
        //         }
        //     }
        // }
        // System.out.println("Second Largest: "+ secondLargest);
    }
}
