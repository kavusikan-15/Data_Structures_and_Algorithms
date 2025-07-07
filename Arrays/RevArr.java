import java.util.Arrays;

class RevArr {
    public static void main (String[] args) {
        int[] arr = {4,5,6,7,8};
        int n = arr.length;

        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
