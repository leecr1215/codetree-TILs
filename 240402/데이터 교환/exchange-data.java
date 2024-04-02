public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        int temp = a;
        a = c;
        c = b;
        b = temp;
        

        System.out.printf("%d\n%d\n%d", a, b, c);
    }
}