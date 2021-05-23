package SalesByMatch;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Result {

	/*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    
        int counter = 0;
        Set<Integer> set = new LinkedHashSet<>();
        for (Integer integer : ar) {
            if (!set.add(integer)) {
                counter++;
                set.remove(integer);
            }
        }
        return counter;

    }
}
