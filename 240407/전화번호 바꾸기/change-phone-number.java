import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] phone = sc.next().split("-");

        System.out.printf("%s-%s-%s", phone[0], phone[2], phone[1]);
    }
}