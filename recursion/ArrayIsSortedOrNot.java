public class ArrayIsSortedOrNot {
    static boolean isSorted(int arr[],int index){
        //Termination Case
        if(arr.length-1==index){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        //small problem
        index=index+1;
        return isSorted(arr, index);

    }
    public static void main(String[] args) {
        int arr[] ={4,5,9,11,15,20,25};
        int index=0;
       System.out.println(isSorted(arr,index)?"Sorted":"Not sorted");
    }
}
