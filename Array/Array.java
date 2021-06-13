package gui.Array;

public class Array {
    public static gui.Array.Sorting Sorting;
    public static int[] getA(String text, int amount) {
        int num = amount;
        int arr[] = new int[num];
        String[] stmp = text.split(",");
        int b = 0;
        for (String s : stmp) {
            arr[b] = Integer.parseInt(s.trim());
            b++;
        }
        for (int i = 0; i < (num - 1); i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
