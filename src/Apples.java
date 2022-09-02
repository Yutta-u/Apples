import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int x1 = b / a;
        int x2 = x1 * a;
        int x3 = b - x2;

        int y = 0;
        if (x3 > 0) {
            y = a - x3;
        } else {
            y = 0;
        }
        System.out.println(x1 + " " + x3 + " " + y);
    }
}
