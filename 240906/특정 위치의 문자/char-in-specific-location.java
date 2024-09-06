import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chars = {'L', 'E', 'B', 'R', 'O', 'S'};

        char target = sc.next().charAt(0);
        int idx = -1;

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == target){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.println("None");
        }else{
            System.out.println(idx);
        }

    }
}