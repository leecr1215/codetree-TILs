import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());

            if(i % 2 != 0){
                cnt++;
                sum += num;
            }
        }

        System.out.println(sum + " " + Math.round((double)sum / cnt * 10) / 10.0);
    }
}