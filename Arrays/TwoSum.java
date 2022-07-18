import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,9,6,3,1,10,4};
        int sum=9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = sum-arr[i];

            if(map.get(arr[i])==null){ //This key is not present
                map.put(key,i); //put that key in hashmap
            }
            else{// u found the key
                System.out.println("Pair found "+map.get(arr[i])+ " current index "+i);
            }
        }


        // Arrays.sort(arr); // N log N
        // // Two pointer approach
        // int i=0;
        // int j=arr.length-1;
        // int sum =9;
        // while(i<j){
        //     int k =arr[i]+arr[j];
        //     if(sum==k){
        //         System.out.println(arr[i]+" "+arr[j] +" i index "+i+" and j index "+j);
        //         return;
        //     }
        //     else if(k>sum){
        //         j--;
        //     }
        //     else if(k<sum){
        //         i++; 
        //     }
        // }

    }
}
