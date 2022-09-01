public class Factorial {
    static int fact(int i) {
        if(i==1){
            return 1;
        }
        return i*fact(i-1);
    }
    public static void main(String[] args) {
        //fact(5);
        System.out.println(fact(5));
    }

}
