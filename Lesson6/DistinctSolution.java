package Lesson6;

import java.util.Arrays;

public class DistinctSolution {
	
	public static void main(String[] args) {

		int[] a = {2,1,1,2,3,1};
		
		new DistinctSolution().solution(a);
		
	}
	
	public int solution(int[] A) {
		
		if(A.length >0)
		{
			Arrays.sort(A);
			
			int element = A[0];
			int count=1;
			
			for(int index=1;index < A.length;++index)
			{
				if(A[index] != element)
				{
					element = A[index];
					++count;
				}
			}
			return count;
		}
		else
		{
			return 0;
		}

	}

}
