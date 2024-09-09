public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while (i <= 1000) {

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {

                i++;
                count++;

            } else if (divisibleBy3) {

                i++;
                count++;


            } else if (divisibleBy5) {

                i++;
                count++;

            } else {
                i++;
            }
        }
        System.out.printf(String.valueOf(count));
    }
}
