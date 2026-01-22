public class LargestArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Largest = " + max);
    }
}
