package com.codility.task2;



public class Solution {
	  public int[] solution(int[] A, int K) {
		  if(A.length==0) {
			  int[] empty={};
		
			  return empty; };
int[] Result=new int[A.length]; 
int i=0;
Result=A;
//System.out.println(A[0]);
//K=A.length%K;

while(K>A.length)
	{
	K-=A.length;
	};
System.out.println("dl "+A.length);
System.out.println("K= "+K);

		  for(i=0;i<K;i++){
			Result=oneIteration(Result);
			printArray(Result);
		//	System.out.println(A[0]);
		  }
		
return Result;
}
	  
	  public int[] oneIteration(int[] A){
		  if(A.length==0) return null;
		  int [] B =new int[A.length];
		  B[0]=A[A.length-1];
		  
		  for(int i=1;i<A.length;i++){
			  B[i]=A[i-1];
		  }
		  return B;
	  }
	  public static void printArray(int[] A){
		  if(A.length==0) ;else{
		  System.out.print("[");
		  for(int i=0;i<A.length;i++){
			  System.out.print(A[i]+",");
		  }
		  System.out.print("]");}
	  }
	      
}
