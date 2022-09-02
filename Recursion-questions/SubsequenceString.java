import java.util.ArrayList;

public class SubsequenceString{
    static ArrayList<String> getSubsequence(String name){
        if(name.length()==0){
            ArrayList<String>list = new ArrayList<>();
            list.add(" ");
            return list;
        }
        //get the single character which is used to join in arraylist
        char singleChar = name.charAt(0);
        String subString=name.substring(1);
        ArrayList<String> result= getSubsequence(subString);
        ArrayList<String> finalResult = new ArrayList<>();
        for(String s: result){
            finalResult.add(s);
            finalResult.add(singleChar +s);
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(getSubsequence("uttam"));
    }
}