public class CountingSort {
    public static void countingSort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;

        int min = arr[0], max = arr[0];
        for (int val : arr) {
            if (val < min)
                min = val;
            if (val > max)
                max = val;
        }

        int range = max - min + 1;

        int[] count = new int[range];
        for (int val : arr) {
            count[val - min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = count[arr[i] - min] - 1;
            output[idx] = arr[i];
            count[arr[i] - min]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}