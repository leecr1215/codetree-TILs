import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = a; i <= b; i++){
            if(i % 2 != 0){
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}