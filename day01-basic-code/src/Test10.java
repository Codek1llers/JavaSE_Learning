public class Test10 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                count += arr[i];
            }
        }
        System.out.println(count);
    }
}
