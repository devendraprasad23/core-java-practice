import java.util.Scanner;

class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String word = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ')
                word = ch + word;
            else {
                result = result + word + " ";
                word = "";
            }
        }

        result = result + word;

        System.out.println(result);
    }
}
