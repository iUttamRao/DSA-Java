public class Fibo{
    static int call=0;
    static int call2=0;
    static int fiboRec(int n){
        if(n<=1){
            return n;
        }
        call++;
        int secondTerm =fiboRec(n-1);
        int firstTerm = fiboRec(n-2);
        int result =firstTerm+secondTerm;
        return result;
    }

    static int fiboMemo(int n,int []cache){
        if(n<=1){
            return n;
        }
        if(cache[n]!=0){
            return cache[n];
        }
        call2++;
        int secondTerm =fiboMemo(n-1,cache);
        int firstTerm = fiboMemo(n-2,cache);
        int result =firstTerm+secondTerm;
        //store the computed result
        
        cache[n]=result;
        return result;
    }

    static int fiboTab(int n){
        int cache[]=new int[n+1];
        cache[0]=0; //first term
        cache[1]=1; // second term
        for(int i=2;i<=n;i++){
            cache[i]=cache[i-1]+cache[i-2];
        }
        return cache[n];
    }
    public static void main(String[] args) {
        // System.out.println(fiboRec(5));
        // System.out.println("Rec Call -->" +call);
        int n=1;
        // int cache[] = new int[n+1];
        // System.out.println(fiboMemo(n,cache));
        // System.out.println("Memp Call -->" +call2);
        System.out.println(fiboTab(n));
    }
}