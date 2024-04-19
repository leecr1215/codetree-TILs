import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        System.out.println(isLeapYear(year));

    }

    public static boolean isLeapYear(int year){
        if(year % 100 == 0 && year % 400 != 0){
            return false;
        }

        if(year % 4 == 0) return true;

        return false;
    }
}