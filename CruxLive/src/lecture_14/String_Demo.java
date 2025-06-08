package CruxLive.src.lecture_14;

public class String_Demo {
    public static void main(String[] args) {
        String s1 = "Hey"; // created in intern pool
        String s2 = new String("Shivam"); // this is created in heap

        // instead of address, it will print content
        System.out.println(s1);
        System.out.println(s2);

        // will give negative result, as created on diff location
        System.out.println(s1 == s2);
    }
}
