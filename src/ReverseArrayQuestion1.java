public class ReverseArrayQuestion1 {
    public static void main(String[] args) {
        int[] array = {5, 10, 73, 2, -5, 42};

        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        reverse(array);

        System.out.println("역순 정렬을 마쳤습니다.");

    }

    static void reverse(int[] a) {
        for(int i=0; i<a.length / 2; i++) {
            swap(a, i, a.length - i -1);

            for (int value : a) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    static void swap(int[] a, int idx1, int idx2) {
        System.out.println("a[" + idx1 + "]과(와) a[" + idx2 + "]를 교환합니다.");

        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
}
