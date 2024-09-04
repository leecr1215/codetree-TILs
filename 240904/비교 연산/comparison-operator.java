import java.util.*;

public class Main {
    public static int booleanToInt(boolean bool){
        return bool ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(booleanToInt(a >= b));
        System.out.println(booleanToInt(a > b));
        System.out.println(booleanToInt(a <= b));
        System.out.println(booleanToInt(a < b));
        System.out.println(booleanToInt(a == b));
        System.out.println(booleanToInt(a != b));
    }
}