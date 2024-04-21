import java.util.*;

public class Main {
    public static class Patient {
        boolean hasSymptom;
        int temperature;

        public Patient(boolean hasSymptom, int temperature){
            this.hasSymptom = hasSymptom;
            this.temperature = temperature;
        }

        public boolean goAClinic(){
            return hasSymptom && temperature >= 37;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Patient p1 = new Patient(hasSymptom(sc.next()), sc.nextInt());
        Patient p2 = new Patient(hasSymptom(sc.next()), sc.nextInt());
        Patient p3 = new Patient(hasSymptom(sc.next()), sc.nextInt());
        
        int cnt = 0;

        if(p1.goAClinic()){
            cnt++;
        }

        if(p2.goAClinic()){
            cnt++;
        }

        if(p3.goAClinic()){
            cnt++;
        }

        if(cnt >= 2){
            System.out.println('E');
        }else{
            System.out.println('N');
        }

    }

    public static boolean hasSymptom(String value){
        return value.equals("Y") ? true : false;
    }
}