public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int num = 100;
        while(num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            } else {
                num = num - 1;
                count++;
            }
        }
        System.out.printf(String.valueOf(count));
    }
}
