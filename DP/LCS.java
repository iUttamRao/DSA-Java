public class LCS {
    static int lcsRec(String first ,String second,int m,int n){
        // Termination case
        if(m==-1|| n==-1){
            return 0;
        }
        int count=0;
        if(first.charAt(m)==second.charAt(n)){
            count=1 + lcsRec(first, second, m-1, n-1);
            return count;
        }
        else{
            int x=lcsRec(first, second, m, n-1);
            int y=lcsRec(first, second, m-1, n);
            return Math.max(x,y);
        }
    }



    static int lcsMemo(String first ,String second,int m,int n,int cache[][]){
        // Termination case
        if(m==0 || n==0){
            return 0;
        }
        if(cache[m-1][n-1]!=0){
            return cache[m-1][n-1];
        }
        int count=0;
        if(first.charAt(m-1)==second.charAt(n-1)){
            count=1 + lcsMemo(first, second, m-1, n-1,cache);
            cache[m-1][n-1]=count;
            return count;
        }
        else{
            int x=lcsMemo(first, second, m, n-1,cache);
            int y=lcsMemo(first, second, m-1, n,cache);
            cache[m-1][n-1]= Math.max(x,y);
            return cache[m-1][n-1];
        }
    }


    static int tabulation(String first,String second,int m,int n){
        int matrix[][] = new int[m+1][n+1];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i==0 || j==0){
                    matrix[i][j]=0;
                }
                else{
                    if(first.charAt(i-1)==second.charAt(j-1)){
                        matrix[i][j]=matrix[i-1][j-1]+1;
                    }
                    else{
                        matrix[i][j]=Math.max(matrix[i-1][j],matrix[i][j-1]);
                    }
                }
            }
            
        }
        return matrix[m][n];
    }

    public static void main(String[] args) {
        int len = lcsRec("AGGTAB", "GXTXAYB","AGGTAB".length()-1,"GXTXAYB".length()-1);
        System.out.println(len);
        int cache[][]=new int["AGGTAB".length()]["GXTXAYB".length()];
        len = lcsMemo("AGGTAB", "GXTXAYB","AGGTAB".length(),"GXTXAYB".length(),cache);
        System.out.println(len);
        System.out.println(tabulation("AGGTAB", "GXTXAYB","AGGTAB".length(),"GXTXAYB".length()));
    }
}
