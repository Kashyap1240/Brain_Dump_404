package CruxLive.src.lecture_15;

public class Integer_Cache_Concept {
    public static void main(String[] args) {
        Integer a1 = 120;
        Integer a2 = 120;
        
        Integer c1 = 931;
        Integer c2 = 931;

        System.out.println(a1 == a2);  // true, as there is no duplicates within -127 to 128 range
        System.out.println(c1 == c2);  // false, since out of the mentioned range

        // this concept is valid for all primitive datatype except 'float' and 'double'
    }
}
