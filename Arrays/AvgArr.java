package Arrays;

class AvgArr {
    public static void main(String[] args) {
        int[] arr = {12,31, 73,81};

        int sum = 0;
        double n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = sum / n;
        System.out.println(avg);
    }
    
}
