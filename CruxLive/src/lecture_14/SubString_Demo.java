package CruxLive.src.lecture_14;

public class SubString_Demo {
    public static void main(String[] args) {
        String s = "Kashyap";
        System.out.println(s.substring(1,4)); // will print from 1 to 4-1
        System.out.println(s.substring(0)); // will print till last
        System.out.println(s.substring(1,1)); // blank string
        System.out.println(s.substring(1,1).length());
    }
}
