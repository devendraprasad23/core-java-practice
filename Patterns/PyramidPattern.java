import java.util.Scanner;

class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int space = 1; space <= n - i; space++)
                System.out.print(" ");

            for (int star = 1; star <= (2 * i - 1); star++)
                System.out.print("*");

            System.out.println();
        }
    }
}
