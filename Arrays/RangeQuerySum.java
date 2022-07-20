public class RangeQuerySum {
    public static void main(String[] args) {
        //Prefix Sum
        int arr[] ={10,20,30,40,50,60,70,80,90,100};
        int prefixSum[]=new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i]=arr[i]+prefixSum[i-1];
        }

        for(int e : prefixSum){
            System.out.print(e + " ");
        }
        System.out.println();
        int lowerRange=2;
        int upperRange=5;
        if(lowerRange==0){
            System.out.println(prefixSum[upperRange]);
        }
        int rangeSum =prefixSum[upperRange]-prefixSum[lowerRange-1];
        System.out.println("Range Sum is "+rangeSum);
        //Prefix Max
        int arr3[]={90,10,20,100,11,200,20,300,500};
        int prefixMax[]=new int[arr3.length];
        prefixMax[0]= arr3[0];
        for(int i=1;i<prefixMax.length;i++){
            prefixMax[i]=Math.max(arr3[i], prefixMax[i-1]);
        }
        for(int e : prefixMax){
            System.out.print(e +" ");
        }
    }
}
