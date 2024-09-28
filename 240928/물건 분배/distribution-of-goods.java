import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[k];

        for(int i = 0; i < k; i++){
            st = new StringTokenizer(br.readLine());

            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
       
            arr[i] = width * height;
        }

        Arrays.sort(arr, (a, b) -> b-a);
        int cnt = 0;

        for(int i = 0; i < k; i++){
            n = n - arr[i];
            cnt++;

            if(n <= 0){
                break;
            }
        
        }

        System.out.println(cnt);

    }
}