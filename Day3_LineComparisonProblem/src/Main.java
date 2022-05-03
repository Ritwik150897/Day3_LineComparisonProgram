public class Main {
    public static void main(String[] args) {
        int x1 = 2, x2 = 10, y1 = 5, y2 = 10;

        System.out.println("Welcome To Line Comparison Problem");

        int a = (x2 - x1);
        int b = (y2 - y1);

        double sq1 = Math.pow(a, 2);
        double sq2 = Math.pow(b, 2);

        double length = Math.sqrt(sq1 + sq2);

        System.out.println("X1: " + x1);
        System.out.println("Y1: " + y1);
        System.out.println("X2: " + x2);
        System.out.println("Y2: " + y2);
        System.out.println("length of line: " + length);
    }
}
