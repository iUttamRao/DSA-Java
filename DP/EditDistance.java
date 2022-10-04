public class EditDistance {
    static int editDistanceOperationCount(String first,String second,int m,int n){
        //Termination case
        //if first String is exhaust
        if(m==0){
            return n; //return length of second string and it becomes number of operation
        }
        if(n==0){
            return m; //return length
        }
        //current character match
        if(first.charAt(m-1)==second.charAt(n-1)){
            //move to the next character
            return editDistanceOperationCount(first, second, m-1, n-1);
        }
        //if character not match so we have 3 choices
        //1 . insert
        int insert =editDistanceOperationCount(first, second, m, n-1);
        int delete = editDistanceOperationCount(first, second, m-1, n);
        int replace = editDistanceOperationCount(first, second, m-1, n-1);
        int min= Math.min(Math.min(insert,delete),replace); //get minimm
        return 1+min;
        
    }
    public static void main(String[] args) {
        String first ="sunday";
        String second ="saturday";
        int count = editDistanceOperationCount(first, second, first.length(), second.length());
        System.out.println(count);
    }
}
