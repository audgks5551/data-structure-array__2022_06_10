import java.util.Random;

public class MaxOfArrayRand {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("키의 최댓갑을 구합니다.");
        System.out.print("사람 수: ");
        int num = 1 + rand.nextInt(9);
        System.out.println(num);

        int[] height = new int[num];

        for (int i=0; i<num; i++) {

            height[i] = 100 + rand.nextInt(90); // 0~90 사이의 값을 반환
            System.out.println("hight[" + i + "]: " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");



    }

    static int maxOf(int[] a) {

        int max = a[0];

        for (int i=1; i<a.length; i++)
            if (a[i] > max)
                max = a[i];

        return max;
    }
}
