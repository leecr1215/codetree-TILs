import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isCompositeNum = false;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isCompositeNum = true;
                break;
            }
        }
        

        System.out.println(isCompositeNum ? 'N' : 'C');
    }
}