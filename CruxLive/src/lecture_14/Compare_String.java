package CruxLive.src.lecture_14;

public class Compare_String {
    public static void main(String[] args) {
        String s1 = "Shivam";
        String s2 = "Shivam";
        String s3 = "Kashyap";

        // comparing content
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));

        System.out.println("------------------");
        // comparing address
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
    }
}
