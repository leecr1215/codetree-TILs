public class Main {
    static final double FT = 30.48;
    static final int MI = 160934;

    public static void main(String[] args) {
        double ftValue = 9.2;
        double miValue = 1.3;

        System.out.printf("%.1fft = %.1fcm\n", ftValue, ftToCm(ftValue));
        System.out.printf("%.1fmi = %.1fcm", miValue, miToCm(miValue));
    }
    
    static double ftToCm(double value){
        return FT * value;
    }

    static double miToCm(double value){
        return MI * value;
    }
}