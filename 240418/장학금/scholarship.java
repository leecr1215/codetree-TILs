import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mid = sc.nextInt();
        int fin = sc.nextInt();

        int award = 0;

        if(mid >= 90){
            if(fin >= 95){
                award = 100000;
            }else if(fin >= 90){
                award = 50000;
            }
        }

        System.out.println(award);

    }
}