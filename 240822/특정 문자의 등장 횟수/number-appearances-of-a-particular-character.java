import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int eeCnt = 0;
        int ebCnt = 0;

        for(int i = 0; i < str.length() - 1; i++){
            char c1 = str.charAt(i);
            char c2 = str.charAt(i+1);

            if(c1 == 'e'){
                if(c2 == 'e'){
                    eeCnt++;
                }else if(c2 == 'b'){
                    ebCnt++;
                }
            }
        }

        System.out.println(eeCnt + " " + ebCnt);
    }
}