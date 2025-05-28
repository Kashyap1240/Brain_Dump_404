package CruxLive.src.lecture_4;

public class Continue_Demo {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++){
            if (i == 5 || i == 10){
                // if we don't want to print this 5 and 10 then we use "continue"
                continue; // it skip the mentioned iteration
            }
            System.out.print(i+",");
        }
    }
}
