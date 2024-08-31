import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            StringBuffer sb = new StringBuffer(sc.next());

            if(sb.toString().equals("END")){
                break;
            }

            System.out.println(sb.reverse());

        }
        
    }
}