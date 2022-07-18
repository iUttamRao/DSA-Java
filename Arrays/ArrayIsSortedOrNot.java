public class ArrayIsSortedOrNot{
    public static void main(String[] args) {
        int arr[]={10,6,100,20,90,88};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Not Sorted Array...");
                return;
            }
        }
        System.out.println("Sorted Array...");
    }
}