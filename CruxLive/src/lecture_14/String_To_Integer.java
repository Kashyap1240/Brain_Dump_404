package CruxLive.src.lecture_14;

public class String_To_Integer {
    public static void main(String[] args) {
        String str = "5467890";
        int x = Integer.parseInt(str);  // if string less than 10 to the power 9
        x++; // to print next num, to verify
        System.out.println(x);

        String str1 = "54678965780";
        long y = Long.parseLong(str1);
        System.out.println(y);


        String str3 =  "54678.901";
        double d = Double.parseDouble(str3);
        System.out.println(d);
    }
}
