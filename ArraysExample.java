import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 2, 8, 4};

        System.out.println("array: " + Arrays.toString(numbers));

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("sum of elements: " + sum);

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max number: " + max);

        Arrays.sort(numbers);
        System.out.println("sorted array: " + Arrays.toString(numbers));
    }
}
