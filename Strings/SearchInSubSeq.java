public class SearchInSubSeq {
    public static void main(String[] args) {
        String str = "abcd";
        String search="bd"; // found
        //String search="bb"; // not found
        int m=str.length();
        int n=search.length();
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(search.charAt(i)==str.charAt(j)){
                i++;
            }
            j++;
        }
        System.out.println(i==n?"Found":"Not found");
    }
}
