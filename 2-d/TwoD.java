import javax.sound.midi.Soundbank;

public class TwoD{
    public static void main(String[] args) {
        // int arr[][]=new int[3][3];
        // int []arr2[]=new int[3][3];
        // int [][]arr3=new int[3][3];
        int arr[][]={{10,20,30},{40,50,60}};
        // int arr5[][]=new int[3][];
        // arr5[0] =new int [10];
        // arr5[1] =new int [20];
        // arr5[2] =new int [30];

        // Row major order
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Column Major Order
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        //enhanced for loop
        // for(int a[]:arr5){
        //     for(int e: a){
        //         System.out.print(e + " ");
        //     }
        //     System.out.println();
        // }
    }
}