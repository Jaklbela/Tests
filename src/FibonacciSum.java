public class FibonacciSum {
    public int[] findArray(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n + 1; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public int findSum(int n) throws IllegalAccessException {
        if (n < 0) {
            throw new IllegalAccessException();
        }
        int[] array = findArray(n);
        int sum = 0;
        for (int i = 0; i < n + 1; ++i) {
            sum += array[i];
        }
        return sum;
    }
}
