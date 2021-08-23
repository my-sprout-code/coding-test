package barkingdog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 65
// 97
public class Q_10808_알파벳_개수 {
    private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder STRING_BUILDER = new StringBuilder();
    private static final int alphaBetCountArray[] = new int[27];
    private static final int ALPHABET_COUNT = 27;
    private static final int START_INDEX = 0;

    private static StringTokenizer stringTokenizer;

    public static void main(String[] args) throws IOException {
        char[] lowerAlphabetCharArray = lowerAlphabetCharArray();
        for (char c : lowerAlphabetCharArray) {
            alphaBetCountArray[c - 'a']++;
        }
        for (int i = START_INDEX; i < ALPHABET_COUNT; i++) {
            STRING_BUILDER.append(alphaBetCountArray[i]+" ");
        }
        System.out.println(STRING_BUILDER.toString());
    }

    private static char[] lowerAlphabetCharArray() throws IOException {
        return BUFFERED_READER.readLine()
                .toLowerCase()
                .toCharArray();
    }

}
