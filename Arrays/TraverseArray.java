public class TraverseArray {
    public static void main(String[] args) {
        // 1-D ARRAY
        //  int arr[] = new int [5];
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        
        // enhanced for loop (Java 1.5)
        // for(int ele : arr){
        //     System.out.println(ele);
        // }


        // 2-D ARRAY
       // int arr1[][] = new int[3][2];
        int [][] arr1 = new int [3][];
        arr1[0] = new int[10];
        arr1[1] = new int[20];
        arr1[2] = new int[30];
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr1[i].length;j++){
        //         System.out.print(arr1[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for(int a[] : arr1){
            for(int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
