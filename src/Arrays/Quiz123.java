package Arrays;

public class Quiz123 {
    public static void main(String[] args) {
        //Quiz1
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i;
        }
        int res = arr[0] + arr[2];
        System.out.println(res);

        //Quiz2
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;

            }

        }
        System.out.println(result);

        //Quiz3
        int ress = 0;
        for (int el : arr) {
            ress += el;

        }
    }
}

