public class TwoArraySum {
    public static void main(String[] args) {
        int first[] ={2,3,4,2};
        int second[]={9,1,2,1};
        int third[]=new int[first.length>second.length?first.length:second.length];
        int i = first.length -1; // get the last index
        int j =second.length-1;
        int k =third.length-1;
        int carry =0;
        //int digitSum=0;
        //loop last to first
        while(i>=0 || j>=0){ // either first array will be exhaust or the second array
            int digitSum=carry; // store the single digit sum
            if(i>=0){ // might be i will exhaust
                digitSum+=first[i]; // from the first Array get the single digit
            }
            if(j>=0){// might be j will exhaust
                digitSum+=second[j]; // from the second array get the single digit
            }
            carry = digitSum/10; // compute the carry
            digitSum =digitSum %10; // get the digit
            third[k]=digitSum; // now store the single digit result int the third array
            i--; // move to the previous index move
            j--;
            k--;
        }
        // print the result array(third)
        System.out.print(carry);
        for (int e : third) {
            System.out.print(e+ " ");
        }
    }
}
