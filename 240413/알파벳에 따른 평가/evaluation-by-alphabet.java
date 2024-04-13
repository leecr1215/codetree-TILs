import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alpha = sc.next();
        String result;


        if(alpha.equals("S")){
            result = "Superior";
        }else if(alpha.equals("A")){
            result = "Excellent";
        }else if(alpha.equals("B")){
            result = "Good";
        }else if(alpha.equals("C")){
            result = "Usually";
        }else if(alpha.equals("D")){
            result = "Effort";
        }else{
            result = "Failure";
        }

        System.out.println(result);
        // System.out.println(alpha);
    }
}