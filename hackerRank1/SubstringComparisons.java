package hackerRank1;
import java.util.Scanner;

public class SubstringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s = scan.next();
	    int k = scan.nextInt();
	    getSmallestAndLargest(s, k);
	    scan.close();
	}
	
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String sequence;
        for(int i = 0; i < s.length() - k+1; i++) {
        	sequence = s.substring(i, (i + k));
        	if(sequence.compareTo(smallest) < 0)
        		smallest = sequence;
        	if(sequence.compareTo(largest) > 0)
        		largest = sequence;
        }
        
        System.out.println(smallest);
        System.out.println(largest);
        
        return smallest + "\n" + largest;
    }

}
