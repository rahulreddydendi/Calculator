import java.util.*;

class Calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble(), b = s.nextDouble();
        char o = s.next().charAt(0);

        System.out.println(
            o=='+' ? a+b :
            o=='-' ? a-b :
            o=='*' ? a*b :
            o=='/' ? a/b : "Invalid"
        );
    }
}
