package com.codility.lession3.TapeEquilibrium;

public class Solution {
	public int solution(int[] A) {
		// write your code in Java SE 8
		long left = 0;
		long right = 0;
		long diff;
	long result;
		left=A[0];
		for (int i = 1; i < A.length; i++) {
			right += A[i];
		}
		diff = Math.abs(right - left);
		result=diff;
		for (int i = 1; i < A.length - 1; i++) {
			left += A[i];
			right -= A[i];
			diff = Math.abs(right - left);
			if(diff<result) result=diff;
		}
		return  (int)result;
	}

}
