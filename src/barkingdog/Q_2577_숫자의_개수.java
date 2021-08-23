package barkingdog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q_2577_숫자의_개수 {

    private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder STRING_BUILDER = new StringBuilder();
    private static final int[] numbers = new int[10];
    private static StringTokenizer stringTokenizer;

    public static void main(String[] args) throws IOException {
        int sum = 1;
        for (int i = 0; i < 3; i++) {
            sum *= Integer.parseInt(BUFFERED_READER.readLine());
        }
        char[] chars = String.valueOf(sum).toCharArray();
        for (char aChar : chars) {
            numbers[aChar - '0']++;
        }
        Arrays.stream(numbers).forEach(System.out::println);
    }

}
