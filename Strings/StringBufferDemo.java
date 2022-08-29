public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer("amit");
        //StringBuilder sb = new StringBuilder("amit");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("dgkmkrjtijereijgi");
        sb.insert(1, "a");
        
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.delete(2, 15));
        System.out.println(sb.deleteCharAt(5));
        System.out.println();
    }
}
