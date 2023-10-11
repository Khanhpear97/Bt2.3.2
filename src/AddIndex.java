import java.util.Arrays;
import java.util.Scanner;

public class AddIndex {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 9, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap value: ");
        int value = scanner.nextInt();
        arr = add(arr, value);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] add(int[] array, int value) {
        int n = array.length;
        int[] result = new int[n + 1];
        for (int i = 0; i < n; i++) {
            result[i] = array[i];
        }
        result[n] = value;
        return result;
    }
}
