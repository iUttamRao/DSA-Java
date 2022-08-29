import javax.sound.midi.Soundbank;

public class StringMethods {
    public static void main(String[] args) {
        String name="Uttam";
        System.out.println(name.length());
        char w[] =name.toCharArray(); // String convert into char array
        byte w1[]=name.getBytes();
    System.out.println(name.indexOf("m"));;
    System.out.println(name.lastIndexOf("t"));
    System.out.println(name.contains("a"));
    String name2="       Uttam    Rao      ";
    System.out.println(name2.trim());
    String msg ="Hello How are you";
    String e[]=msg.split(" ");
    for(String n : e){
        System.out.print(n+",");

    }
    System.out.println();
    System.out.println("Uttam".substring(1,4));
    System.out.println("Uttam".substring(1));
    System.out.println("uttamrao2000@gmail.com".startsWith("uttam"));
    System.out.println("uttamrao2000@gmail.com".endsWith("com"));
    }
}
