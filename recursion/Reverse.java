public class Reverse {
    static String reverseString(String str){
        //Termination case
        if(str.length()==1){
            return String.valueOf(str.charAt(0));
        }
        //small problem
        String smallString = str.substring(1);
        char singleChar = str.charAt(0);
       return  reverseString(smallString) +singleChar;
    }
    public static void main(String[] args) {
        String name="tim";
        System.out.println(reverseString(name));
    }
}
