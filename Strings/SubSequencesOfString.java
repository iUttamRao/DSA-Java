import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class SubSequencesOfString {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> subSeqList = new ArrayList<>();
        int len = str.length();
        for(int i=0;i<len;i++){
            char firstChar=str.charAt(i);
            if(subSeqList.size()==0){
                subSeqList.add("");//not include it
                subSeqList.add(""+firstChar); // include it
                continue;
            }
            int subLen = subSeqList.size();
            for(int j=0;j<subLen;j++){
                String temp =subSeqList.get(j)+firstChar;
                subSeqList.add(temp);
            }
        }
        System.out.println(subSeqList);
    }
}
