import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mathA = sc.nextInt();
        int englishA = sc.nextInt();

        int mathB = sc.nextInt();
        int englishB = sc.nextInt();

        if(mathA === mathB){
            if(englishA > englishB){
                System.out.println('A');
            }else{
                System.out.println('B');
            }
        }else{
            if(mathA > mathB){
                System.out.println('A');
            }else{
                System.out.println('B');
            }
        }
    }
}