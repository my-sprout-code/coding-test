package barkingdog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10807_개수_세기 {

    private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder STRING_BUILDER = new StringBuilder();
    private static final int[] arr = new int[201];
    private static final String DELI = " ";
    private static final int ONE_HUNDRED = 100;

    private static StringTokenizer stringTokenizer;
    private static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(BUFFERED_READER.readLine());
        stringTokenizer = new StringTokenizer(BUFFERED_READER.readLine(), DELI);
        while (stringTokenizer.hasMoreTokens()) {
            final int number = Integer.parseInt(stringTokenizer.nextToken());
            arr[number + ONE_HUNDRED]++;
        }
        int findNumber = Integer.parseInt(BUFFERED_READER.readLine());
        System.out.println(arr[findNumber + ONE_HUNDRED]);
    }

}
