package hackerRank1;

/*Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
We define a token to be one or more consecutive English alphabetic letters. Then, print the number 
of tokens, followed by each token on a new line.*/

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
                
        if(s.trim().length() == 0 || s.trim().length() > 400000) {
        	System.out.println(0);
        	return;
        }
        
        String words[]=s.trim().split("[ !,?.\\_'@]+");
        System.out.println(words.length);
        for (String word:words)
            System.out.println(word);
        	
        scan.close();

	}

}
