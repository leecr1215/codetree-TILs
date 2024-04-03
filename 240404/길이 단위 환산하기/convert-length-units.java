import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();

        value = ftToCm(value);

        System.out.println(value);
    }

    public static double ftToCm(double value){
        return format(value * 30.48);
    }

    public static double format(double value){
        return Math.round(value * 10) / 10.0;
    }
}