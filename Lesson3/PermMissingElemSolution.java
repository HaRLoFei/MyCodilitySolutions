package Lesson3;

import java.util.Arrays;

public class PermMissingElemSolution {
	
	public static void main(String[] args) {
		
		int[] a = {2,3,1,5};
		new PermMissingElemSolution().solution(a);
	}
	
	public int solution(int[] A)
	{
		if(A.length>0)
		{
			Arrays.sort(A);
			
			for(int count=0;count<A.length;count++)
			{
				if(A[count]!= count+1)
				{
					return count+1;
				}
			}
			
			return A.length+1;
		}
		else
		{
			return 1;
		}
		
	}

}
