package IMCChallange2nd;

import java.util.ArrayList;

public class Solution {
	 static final int CONS=15;

	public static int solution(String S, int K) {
		// write your code in Java SE 8
		ArrayList<Integer> list = new ArrayList<>();
		int l = S.length();
		int count = 0;
		for (int i = 0; i < l; i++) {
			if (S.charAt(i) == ' ') {
				list.add(count);
				count = 0;
			} else {
				count++;
			}
			if (i == l - 1) {
				list.add(count);
			}

		}

		l = list.size();
		count = 0;
		int countInside = -1;
		// left
		for (int i = 0; i < l; i++) {
			if (list.get(i) > K)
				return -1;
			countInside += list.get(i) + 1;
			if (countInside > K) {
				count++;
				countInside = -1;
				i--;
			}

		}

		return count + 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Spokój, opanowanie, doœwiadczenie, jakoœæ. "
				+ "Reprezentant Polski zagra³ bardzo dobry mecz, wygra³ "
				+ "niemal wszystkie pojedynki";
		System.out.println("\n"+solution(s,CONS));
		System.out.println(solutionR(s,CONS));
	}

	public static int solutionR(String S, int K) {
        // write your code in Java SE 8
	ArrayList<Integer> list=new ArrayList<>();
	 int l=S.length();
	 int count=0;
	for (int i = 0; i <l; i++) {
		if(S.charAt(i)==' '){
			list.add(count);
			count=0;
		}else{
			count++;
		}
		if(i==l-1){
			list.add(count);
		}
		
	} 
	
	l=list.size();
	count=0;
	int countInside=-1;
	//left
	for (int i = l-1; i >=0; i--) {
		if(list.get(i)>K) return -1;
		countInside+=list.get(i)+1;
		if(countInside>K){
			count++;
			countInside=-1;
			i++;
		}
		
	}
	
	
	
	

return count+1;

}
	
}
