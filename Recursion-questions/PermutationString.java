import java.util.ArrayList;

public class PermutationString{
    static ArrayList<String> perm(String str){
        //Termination case
        if(str.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // get a singleChar (Stack fall)
        char singleChar = str.charAt(0);
        //make String small (small Problem)
        String subString = str.substring(1);
        ArrayList<String> result =perm(subString);
        ArrayList<String> finalResult = new ArrayList<>();
        // We create a permutation
        for(String s : result){
            for(int i=0;i<=s.length();i++){
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i,singleChar);
                finalResult.add(sb.toString());
            }
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(perm("abc"));
    }
}