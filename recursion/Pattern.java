public class Pattern {
    static void leftPyramid(int n,int row){
        if(row>n){
            return;
        }
        printStar(row);
        System.out.println();
        leftPyramid(n, row+1);
    }
    static void printStar(int noOfStars){
        if(noOfStars==0){
            return;
        }
        System.out.print("*");
        printStar(noOfStars-1);
    }
    public static void main(String[] args) {
        int n=5;
        int row=1;
        leftPyramid(n,row);
    }
}
