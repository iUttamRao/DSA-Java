public class Second {
    static void show(int n){
        //Termination Case
        if(n==0){
            return;
        }
        if(n%2!=0){
            System.out.println(n); //Pre--Processing Logic
        }
        show(n-1); //Small Problem
        if(n%2==0){
            System.out.println(n); //Post--Processing Logic
        }
    }
    public static void main(String[] args) {
        show(5);
    }
}
