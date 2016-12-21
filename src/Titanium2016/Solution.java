package Titanium2016;

import java.util.ArrayList;

public class Solution {
	public static int findSizeGap(String workstring) {
		// System.out.println("jesteœ w findSize");
		// System.out.println(workstring);
		int i = 1;
		while (i < workstring.length()) {
			// System.out.println(workstring.charAt(i));
			if (workstring.charAt(i) == '1') {

				i++;
			} else {
				break;
			}
		}

		System.out.println("koniec findsize");
		return i;
	}

	public static int solution(String S, int K) {
		int result = 0;
		StringBuilder workstring = new StringBuilder(S);
		String piece;
		int gap;
		System.out.println(workstring);
		int i = 0;
		while (i + 1 < workstring.length()) {
			if (i < 0)
				i = 0;
			piece = workstring.substring(i, i + 2);
			if (piece.equals("((")) {
				System.out.println("wykryto (( na i: " + i);
				i++;
			} else if (piece.equals("()")) {
				System.out.println("wykryto () pod indeksem: " + i);
				workstring.replace(i, i + 2, "1");
				i--;
			} else if (piece.equals("(1")) {
				gap = findSizeGap(workstring.substring(i + 1));

				System.out.println("wykryto (1 na " + i + " gap wyniós³ " + gap);
				if (workstring.charAt(i + gap + 1) == ')') {
					workstring.replace(i, i + 1, "1");
					workstring.delete(i + gap + 1, i + gap + 2);
					i--;
				}else i++;
				
				// i--;
			} else {
				System.out.println(workstring + " na " + i + " a kaw " + piece);
				i++;
			}
		}
		System.out.println(workstring);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> example = new ArrayList<>();
		example.add("(()))))(()((()))");// 2
		// example.add(")(((");// 3
		// example.add(")((");
		for (String string : example) {
			System.out.println(solution(string, 1));
		}

	}
}

/*
 * 
 * A bracket sequence is considered to be a valid bracket expression if any of
 * the following conditions is true:
 * 
 * it is empty; it has the form "(U)" where U is a valid bracket sequence; it
 * has the form "VW" where V and W are valid bracket sequences. For example, the
 * sequence "(())()" is a valid bracket expression, but "((())(()" is not.
 * 
 * You are given a sequence of brackets S and you are allowed to rotate some of
 * them. Bracket rotation means picking a single bracket and changing it into
 * its opposite form (i.e. an opening bracket can be changed into a closing
 * bracket and vice versa). The goal is to find the longest slice (contiguous
 * substring) of S that forms a valid bracket sequence using at most K bracket
 * rotations.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(String S, int K); }
 * 
 * that, given a string S consisting of N brackets and an integer K, returns the
 * length of the maximum slice of S that can be transformed into a valid bracket
 * sequence by performing at most K bracket rotations.
 * 
 * For example, given S = ")()()(" and K = 3, you can rotate the first and last
 * brackets to get "(()())", which is a valid bracket sequence, so the function
 * should return 6 (notice that you need to perform only two rotations in this
 * instance, though).
 * 
 * Given S = ")))(((" and K = 2, you can rotate the second and fifth brackets to
 * get ")()()(", which has a substring "()()" that is a valid bracket sequence,
 * so the function should return 4.
 * 
 * Given S = ")))(((" and K = 0, you can't rotate any brackets, and since there
 * is no valid bracket sequence with a positive length in string S, the function
 * should return 0.
 * 
 * Assume that:
 * 
 * string S contains only brackets: '(' or ')'; N is an integer within the range
 * [1..30,000]; K is an integer within the range [0..N]. Complexity:
 * 
 * expected worst-case time complexity is O(N); expected worst-case space
 * complexity is O(N) (not counting the storage required for input arguments).
 * 
 * 
 */
