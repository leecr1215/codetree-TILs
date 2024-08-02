import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] A = new int[n1];
        int[] B = new int[n2];

        for(int i = 0; i < n1; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++){
            B[i] = sc.nextInt();
        }

        boolean check = false;

        for(int i = 0; i < n1; i++){
            
            if(A[i] == B[0]){
                if(i + n2 > n1){
                        //A 배열의 범위 넘어감
                        continue;
                }

                check = true;

                for(int j = 0; j < n2; j++){
                    if(A[i + j] != B[j]){
                        check = false;
                    }
                }
            }
        }

        System.out.println(check ? "Yes" : "No");

    }
}