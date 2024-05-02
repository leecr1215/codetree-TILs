import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int classCnt = 0;
        int passageCnt = 0;
        int restRoomCnt = 0;

        for(int i = 1; i <= n; i++){
            if(i % 12 == 0){
                restRoomCnt++;
            }else if(i % 3 == 0){
                passageCnt++;
            }else if(i % 2 == 0){
                classCnt++;
            }
        }

        System.out.println(classCnt + " " + passageCnt + " " + restRoomCnt);
    }
}