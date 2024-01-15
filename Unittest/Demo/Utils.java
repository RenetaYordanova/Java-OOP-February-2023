package Demo;

public class Utils {
    public static int getMin(int[] numbers) {
        int min = 0;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }

        }
        return min;
    }
}
