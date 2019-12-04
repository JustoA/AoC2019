package day4;

public class Main {

	public static void main(String[] args) {
		/*However, they do remember a few key facts about the password:

		    It is a six-digit number.
		    The value is within the range given in your puzzle input.
		    Two adjacent digits are the same (like 22 in 122345).
		    Going from left to right, the digits never decrease; they only ever increase or stay the same (like 111123 or 135679).

		Other than the range rule, the following are true:

		    111111 meets these criteria (double 11, never decreases).
		    223450 does not meet these criteria (decreasing pair of digits 50).
		    123789 does not meet these criteria (no double).
*/
		int low = 372304;
		int high = 847060;
		int hits = 0;
		for(int i = low; i<=high; i++) {
			if(hasAdjacent(String.valueOf(i)) && noDecrease(String.valueOf(i))) hits++;
		}
		System.out.println("Part 1: " + hits + " matches.");
		hits =0;
		for(int i = low; i<=high; i++) {
			if(hasAdjacentOnlyTwo(String.valueOf(i)) && noDecrease(String.valueOf(i))) hits++;
		}
		System.out.println("Part 1: " + hits + " matches.");
	}
	
	
	//my solution uglee
	public static boolean hasAdjacent(String s) {
		char[] chars = s.toCharArray();
		return ((chars[0]==chars[1]) ||
				(chars[1]==chars[2]) || 
				(chars[2]==chars[3]) ||
				(chars[3]==chars[4]) ||
				(chars[4]==chars[5]));
	}
	
	//my solution uglee x2
	public static boolean hasAdjacentOnlyTwo(String s) {
		char[] chars = s.toCharArray();
		return ((chars[0]==chars[1] && chars[1]!=chars[2])||
				(chars[1]==chars[2] && chars[2] != chars[3] && chars[1] != chars[0]) || 
				(chars[2]==chars[3] && chars[3] != chars[4] && chars[1] != chars[2]) ||
				(chars[3]==chars[4] && chars[4] != chars[5] && chars[2] != chars[3]) ||
				(chars[4]==chars[5] && chars[3] != chars[4]));
	}
	
	//thank you cs 1101 for teaching me about accumulators
	public static boolean noDecrease(String s) {
		char[] chars = s.toCharArray();
		char highest = '0';
		for(char c : chars) {
			if (c < highest) return false;
			else highest = c;
		}
		return true;
	}
}
