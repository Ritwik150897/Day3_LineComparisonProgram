public class Main {
    public static void main(String[] args) {
        int x1 = 2, x2 = 10, y1 = 5, y2 = 10;
        int x3 = 2, x4 = 10, y3 = 5 ,y4 = 10;

        System.out.println("Welcome To Line Comparison Problem");

        int a = (x2 - x1);
        int b = (y2 - y1);
        int c = (x4 - x3);
        int d = (y4 - y3);

        double sq1 = Math.pow(a, 2);
        double sq2 = Math.pow(b, 2);
        double sq3 = Math.pow(c, 2);
        double sq4 = Math.pow(d, 2);

        double length1 = Math.sqrt(sq1 + sq2);
        String l1 = Double.toString(length1);
        double length2 = Math.sqrt(sq3 + sq4);
        String l2 = Double.toString(length2);

        System.out.println("X3: " + x3);
        System.out.println("Y3: " + y3);
        System.out.println("X4: " + x4);
        System.out.println("Y4: " + y4);
        System.out.println("length of line 2: " + length2);
        
        System.out.println("Are both lines equal: " + l1.equals(l2));
    }
}
