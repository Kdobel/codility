package IMCChallange18_11.task1;

public class Solution {
	
		
	 public static int solution(String S) {
		 
		 int a=0;
		 int b=0;
		 int cheers=0;
		 boolean aWin=false;
		 for(int i=0;i<S.length();i++){
			 if(S.charAt(i)=='A'){
				 a++;
				 if(!aWin){
					 if(a>b){
						 aWin=true;
						 cheers++;
					 }
				 }
			 }
			 else {
				 b++;
				 if(a<=b) aWin=false; 
			 }
		 }
	 return cheers;
	    }//solution

}
