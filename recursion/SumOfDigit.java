public class SumOfDigit {
    static int sumOfDigitFn(int n){
        if(n<10){
            return n;
        }
        return n%10+sumOfDigitFn(n/10);
    }
    public static void main(String[] args) {
        int num=512;
        int result=sumOfDigitFn(num);
        System.out.println(result);
    }
}
