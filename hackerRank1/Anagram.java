package hackerRank1;

import java.util.Scanner;

/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. 
 * For this challenge,the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, 
 * TCA, aTC, and CtA.*/

public class Anagram {
	
	static boolean isAnagram(String a, String b) {
        
		if(a.length() != b.length())
        	return false;

		a = a.toLowerCase();
		b = b.toLowerCase();
		
		int x = 0;
		
		for(char c = 'a'; c <= 'z'; c++) {
			for(int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == c) {
                    x++;
                }
                if (b.charAt(j) == c) {
                    x--;
                }
			}
			if (x != 0) {
                return false;
            }
		}
		return true;
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
