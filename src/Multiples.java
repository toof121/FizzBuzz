public class Multiples {
    public static int main() {
        // Call the overloaded main method with default values
        return main(1000, 3, 5);
    }

    public static int main(int targnum, int a, int b) {
        int i = 1;
        int count = 0;
        count = getCount(targnum, a, b, i, count);
        return count;
    }

    private static int getCount(int targnum, int a, int b, int i, int count) {
        while (i < targnum) {

            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;

            if (divisibleBya && divisibleByb) {

                i++;
                count++;

            } else if (divisibleBya) {

                i++;
                count++;


            } else if (divisibleByb) {

                i++;
                count++;

            } else {
                i++;
            }
        }
        return count;
    }
}