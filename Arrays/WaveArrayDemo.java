public class WaveArrayDemo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        // Output : {2,1,4,3,5}
        for(int i=0;i<arr.length-1;i+=2){
            //Swapping logic
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int e : arr){
            System.out.print(e+ " ");
        }
    }
}
