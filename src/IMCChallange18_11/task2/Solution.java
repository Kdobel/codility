package IMCChallange18_11.task2;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.IntConsumer;
import java.util.stream.Stream;

public class Solution {
	private static int N;
    public static void sort(int arr[])
    {       
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }     
    /* Function to build a heap */   
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
    /* Function to swap largest element in heap */        
    public static void maxheap(int arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && Math.abs(arr[left] - arr[i])<N+1)
            max = left;
        if (right <= N && Math.abs(arr[left] - arr[i])>N+1)        
            max = right;
 
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    
    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    } 	
	
	
	
	public static int solution(int[] A) {
		// write your code in Java SE 8
		int N = A.length ;
		int result = 0;
		int count=0;

            sort(A);
			for (int j = 0; j < A.length; j++) {
			count=1;
			for (int i =j+1;i<A.length&&A[j]+N>A[i];i++){
				//int i = j+1; A[i] < A[j] + N&&j<A.length-2; i++) {
				count++;
			//System.out.println(A[j]+" "+A[i]+" "+count+" "+N);
			}
			if(count>result) result=count;
		}

		
		return N-result;     
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 2, 7,3   ,196,255,161156,5611561,16561505,561561616,16516156,616515,82,551,615616,51,6151,516,2525,15919,91889,1198198,181152,252,2522,5858,5858,3636,85858,85,5228,586858,5885868,85858,5858,8,485,868,685,858,859,2828,228,192,5982,25298929,822925};
	
		System.out.println("bad solution: "+solution(A));
	}// main



}
