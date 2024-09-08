import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(isDecimal(i)){
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    public static boolean isDecimal(int num){
        if(num == 1) return false;
        
        for(int i = 2; i <= Math.round(Math.sqrt(num)); i++){
            if(num % i == 0) return false;
        }

        return true;
    }
}