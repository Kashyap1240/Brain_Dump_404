package CruxLive.src.lecture_14;

public class Concatenation {
    public static void main(String[] args) {
        // there is no other way by which i can create string in intern pool
        String s1 = "Hey";
        String s2 = "Shivam " + "Kashyap";

        // any changes in current string will modify it's current address
        // since string are immutable
        s1 += " there";
        s1 += new String(" How are you ?");

        System.out.println(s1);
        System.out.println(s2);
    }
}
