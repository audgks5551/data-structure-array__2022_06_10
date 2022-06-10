public class ReverseArrayQuestion2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 7, 8, 9, 10};

        int sum = sumOf(array);

        System.out.println("배열의 총 합 = " + sum);
    }

    static int sumOf(int[] a) {
        int sum = 0;
        for (int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
