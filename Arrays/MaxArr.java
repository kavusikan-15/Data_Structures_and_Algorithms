import java.util.Arrays;

class MaxArr {
    public static void main(String[] args) {
        int[] arr = {21,20,3,3,6};

        int max = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}