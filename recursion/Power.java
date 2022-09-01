public class Power {
    static int pow(int num, int p){
        if(p==0){
            return 1;
        }
        int smallResult=pow(num,p-1);
        return smallResult*num;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
