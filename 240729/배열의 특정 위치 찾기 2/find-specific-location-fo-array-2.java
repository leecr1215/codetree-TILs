import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            
            if(i % 2 == 0){
                oddSum += num;
            }else{
                evenSum += num;
            }
        }

        if(oddSum > evenSum){
            System.out.println(oddSum - evenSum);
        }else{
            System.out.println(evenSum - oddSum);
        }

        
    }
}