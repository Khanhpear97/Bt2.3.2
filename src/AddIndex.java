import java.util.Arrays;
import java.util.Scanner;

public class AddIndex {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 9, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap value: ");
        int value = scanner.nextInt();
        System.out.println("Nhap index: ");
        int index = scanner.nextInt();
        arr = add(arr, value, index);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] add(int[] array, int value, int index) {
        int n = array.length;
        if (index < 0 || index > n) {
            return array;
        }
        int[] result = new int[n + 1];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i == index) {
                result[k] = value;
                k++;
            }
            result[k] = array[i];
            k++;
        }
        return result;
    }
}
