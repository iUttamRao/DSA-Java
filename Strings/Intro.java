public class Intro{
    public static void main(String[] args) {
        String name="Amit";
       // String name2="Amit";
        String name2=new String("Amit");
        String name3="Amit".intern();
        System.out.println(name==name2);
        System.out.println(name.equals(name2));
        System.out.println(name==name3);
        System.out.println("RAM".equals("ram"));
        System.out.println("RAM".equalsIgnoreCase("ram"));
        System.out.println("Ram".compareTo("Amit"));
        System.out.println("Amit".compareTo("Ram"));
        System.out.println("Amit".compareTo("Amit"));
        System.out.println("Amit".charAt(2));
        
    }
}