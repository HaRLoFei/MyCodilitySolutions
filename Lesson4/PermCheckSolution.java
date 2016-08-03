package Lesson4;

import java.util.Arrays;

public class PermCheckSolution {

	public static void main(String[] args) {
		
		int[] a = {4, 1, 3, 2};
		new PermCheckSolution().solution(a);
	}

	 public int solution(int[] A)
	 {
		 Arrays.sort(A);
		 
		 if(A[A.length-1]>A.length)
		 {
			 return -1;
		 }
		 else
		 {
			 int n = A[0];
				int missElement= A[0];
				
				for(int count=1;count<A.length;count++)
				{
					int element = A[count];
					
					int checkElem = element - n;
					
					if(checkElem==1)
					{
						n = element;
						missElement = 1;
					}
					else
					{
						missElement = 0;
						break;
					}
				}
							
				return missElement;
		 }
			
	 }

}
