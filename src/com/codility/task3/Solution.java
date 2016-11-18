package com.codility.task3;

public class Solution {
	public int solution(int[] A) {
		// write your code in Java SE 8
		for (int i = 0; i < A.length; i++) {
			if (A[i] == -1)
				continue;
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == A[j]&&A[j]!=-1) {
					A[j] = -1;
					break;
					
				}
				if(j==A.length-1) return A[i];
			}
		
		}

		return -1;
	}
}
