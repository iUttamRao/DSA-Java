import java.util.ArrayList;

public class MazePathProblem {
    static ArrayList<String> getMaze(int currentRow,int currentCol,int endRow,int endCol){
        //termination case
        if(currentCol == endCol && currentRow==endRow){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        //edge case
        if(currentCol > endCol || currentRow>endRow){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        //final result
        ArrayList<String> finalResult = new ArrayList<>();
        //small problem
        //horizontal increment
        ArrayList<String> hResult =getMaze(currentRow, currentCol+1, endRow, endCol);
        for(String r :hResult){
            finalResult.add("H"+r);
        }
        //vertical increment
        ArrayList<String> vResult =getMaze(currentRow+1, currentCol, endRow, endCol);
        for(String r :vResult){
            finalResult.add("V"+r);
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(getMaze(0, 0, 2, 2));
    }
}
