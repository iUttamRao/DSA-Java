public class Pyramid {
    static void printSpace(int noOfSpace){
        //termination case
        if(noOfSpace==0){
            return;
        }
        System.out.print(" ");
        printSpace(noOfSpace-1); // small problem
    }
    static void printStar(int noOfStar){
        //termination case
        if(noOfStar==0){
            return;
        }
        System.out.print("* ");
        printStar(noOfStar-1);//small problem
    }
    static void prepareRows(int rows, int star){
        //termination case
        if(rows==0){
            return;
        }
        printSpace(rows-1);
        printStar(star);
        System.out.println();
        prepareRows(rows-1,star+1);
    }
    public static void main(String[] args) {
         prepareRows(5,1);
    }
}
