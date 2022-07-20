public class MissingElementInArray {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,6,7,8,9};
        int last=arr[arr.length-1];
        int nSum = last*(last+1)/2;
        int arrSum =0;
        for(int i=0;i<arr.length;i++){
            arrSum =arrSum+arr[i];
        }
        int missingNum= nSum-arrSum;
        System.out.println("Missing number is "+ missingNum);
    }
}
