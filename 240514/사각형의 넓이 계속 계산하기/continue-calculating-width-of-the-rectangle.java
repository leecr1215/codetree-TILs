import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            char c = sc.next().charAt(0);

            System.out.println(x * y);

            if(c == 'C'){
                break;
            }
        }
        
    }
}