public class LargestElementInArray{
    public static void main(String[] args) {
        int arr[] = {10,90,20,70,100,60,40};

    // 1st Method  {n}
        int largestElement = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(largestElement<arr[i+1]){
                largestElement=arr[i+1];
            }
        }
        System.out.println("Largest Element: "+largestElement);

    // 2nd Method{n^2}
        // boolean isLargest =false;
        // for(int i=0;i<arr.length;i++){
        //     isLargest = true;
        //     for(int j= 0;j<arr.length;j++){
        //         if(arr[j]>arr[i]){
        //             isLargest=false;
        //             break;
        //         }
        //     } // jth loop ends
        //     if(isLargest){
        //         System.out.println("Largest Element: "+arr[i]);
        //         return;
        //     }
        // }

    }
}