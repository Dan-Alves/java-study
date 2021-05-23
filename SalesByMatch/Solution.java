package SalesByMatch;

import java.io.*;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

//There is a large pile of socks that must be paired by color. Given an array of integers representing the
//color of each sock, determine how many pairs of socks with matching colors there are.

//Example
//n = 7
//ar = [1,2,1,2,1,3,2]

//There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. 
//The number of pairs is .

public class Solution {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
