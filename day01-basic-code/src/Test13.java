import java.util.Random;

public class Test13 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        initArray(arr);
        int[] arrResult = findMaxAndMin(arr);
        computeResult(arr, arrResult);
    }

    private static void computeResult(int[] arr, int[] arrResult) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arrResult[0] || arr[i] == arrResult[1])
                continue;
            else {
                count += arr[i];
            }
        }
        double avg = 1.0 * count / (arr.length - 2);
        System.out.println(avg);
    }

    private static int[] findMaxAndMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int[] arrResult = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        arrResult[0] = max;
        arrResult[1] = min;
        return arrResult;
    }
    private static void initArray(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
            System.out.println(arr[i]);
        }
    }
}
