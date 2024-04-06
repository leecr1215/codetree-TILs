import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.next().split(":");

        System.out.println((Integer.parseInt(time[0]) + 1) + ":" + time[1]);
    }
}