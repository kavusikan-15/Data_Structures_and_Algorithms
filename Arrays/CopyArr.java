import java.util.Arrays;

public class CopyArr {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[5];

        for (int i = 0; i < a.length; i ++) {
            b[i] = a[i];
        }

        System.out.println("b array : " + Arrays.toString(b));
        System.out.println("a array : " + Arrays.toString(a));
    }    
}
