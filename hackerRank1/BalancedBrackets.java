package hackerRank1;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

//A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
//
//Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().
//
//A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].
//
//By this logic, we say a sequence of brackets is balanced if the following conditions are met:
//
//It contains no unmatched brackets.
//The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
//Given 'n' strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.

public class BalancedBrackets {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isBalanced(s));
		sc.close();
    }
	
	public static String isBalanced(String s) {
	    
        Stack<Character> pilha = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
                pilha.push(c);
            else if(c == ')') {
                if(pilha.isEmpty() || pilha.pop() != '(')
                    return "NO";
            }
            else if(c == '}') {
                if(pilha.isEmpty() || pilha.pop() != '{')
                    return "NO";
            }
            else if(c == ']') {
                if(pilha.isEmpty() || pilha.pop() != '[')
                    return "NO";
            }
        }
        return "YES";
    }

}
