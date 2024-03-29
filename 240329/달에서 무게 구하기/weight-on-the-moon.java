public class Main {
    public static void main(String[] args) {
        int weight = 13;
        double percent = 0.165;

        double result = weight * percent;

        System.out.printf("%d * %.6f = %.6f", weight, percent, result);
    }
}