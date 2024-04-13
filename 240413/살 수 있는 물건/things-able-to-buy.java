import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        final int book = 3000;
        final int mask = 1000;

        String result;

        if(n < mask) {
            result = "no";
        }else if(n < book){
            result = "mask";
        }else{
            result = "book";
        }

        System.out.println(result);
    }
}