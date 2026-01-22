import java.util.Scanner;

class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            for (int j = 0; j < s2.length(); j++) {
                if (ch == s2.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        if (count == s1.length())
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
