import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        while(true){

            if(str.length() == 1) break;

            int idx = sc.nextInt();

            if(idx >= str.length()){
                str = str.substring(0, str.length()-1);
            }else{
                str = str.substring(0,idx) + str.substring(idx+1);
            }

            System.out.println(str);
        }

    
        
    }
}