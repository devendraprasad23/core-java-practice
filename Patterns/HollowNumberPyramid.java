import java.util.Scanner;

class HollowNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");

            int num = 1;

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == n)
                    System.out.print(num + " ");
                else
                    System.out.print("  ");

                num++;
            }
            System.out.println();
        }
    }
}
