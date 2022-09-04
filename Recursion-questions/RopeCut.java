public class RopeCut {
    static int countmaxCuts(int ropeLength,int a,int b,int c){
        //termination case
        if(ropeLength==0){
            return 0;
        }

        if(ropeLength<0){
            return -1;
        }

        int aCut=countmaxCuts(ropeLength-a, a, b, c);
        int bCut=countmaxCuts(ropeLength-b, a, b, c);
        int cCut=countmaxCuts(ropeLength-c, a, b, c);
        int max= (int)Math.max(aCut,bCut);
        max= (int)Math.max(max,cCut);
        if(max == -1){
            return -1;
        }
        return max+1;
    }
    public static void main(String[] args) {
        int count=countmaxCuts(23, 12, 9, 11);
        System.out.println(count);
    }
}
