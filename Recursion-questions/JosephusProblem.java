public class JosephusProblem{
    static int jp(int n,int k){
        if(n==1){
            return 0; // 0th Index
        }
        int newPosition=jp(n-1,k); // k is fix where every call reduce the circle size
        return (newPosition+k) %n;
    }
    public static void main(String[] args) {
        int r= jp(5, 2);
        System.out.println(r);
    }
}