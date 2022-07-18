public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        // This is known as Two Pointer Approach(Algo)
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int e: arr){
            System.out.print(e + " ");
        }

        //In this method its only printing the Array
        // in reverse order not actually reverse the array
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i] + " ");
        // }

    }
}
