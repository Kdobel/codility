package com.codility.lession3.FrogJmp;

public class Solution {
	 public int solution(int X, int Y, int D) {
	      
		 long count=0;
		 do{
			 X+=D;
			 count++;
		 }while(X<Y);
		 return (int)count;
	    }
}
