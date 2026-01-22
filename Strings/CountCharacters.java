import java.util.Scanner;

class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                count++;
        }

        System.out.println("Characters = " + count);
    }
}
