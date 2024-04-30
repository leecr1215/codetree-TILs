import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i = n; i <= 100; i++){
            char grade = getGrade(i);

            System.out.print(grade + " ");
        }
    }

    public static char getGrade(int score){
        if(score >= 90){
            return 'A';
        }else if(score >= 80){
            return 'B';
        }else if(score >= 70){
            return 'C';
        }else if(score >= 60){
            return 'D';
        }else{
            return 'F';
        }
    }
}