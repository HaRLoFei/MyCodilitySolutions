package Lesson4;

import java.util.Arrays;

public class MissingIntegerSolution {
	
	public static void main(String[] args) {

		int[] a = {1,3,6,4,1,2};
		new MissingIntegerSolution().solution(a);
	}

	public int solution(int[] A)
	{	
		Arrays.sort(A);
		
		int missingInt=1;
		for(int count=0;count<A.length;count++)
		{
			if(A[count]== missingInt)
			{
				++missingInt;
			}
			else
			{
				if(A[count] - missingInt > 1)
				return missingInt;
			}
		}
		
		return missingInt;

	}

}
