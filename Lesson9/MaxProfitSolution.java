package Lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxProfitSolution {
	
	public static void main(String args[])
	{
		int[] A = {23171,21011,21123,21366,21013,21367};
		new MaxProfitSolution().solution(A);

	}

	public int solution(int[] A)
	{
		List<Integer>result = new ArrayList<Integer>();
		
		for(int loop=0;loop<=A.length-1;++loop)
		{
			int price = A[loop];
			
			for(int innerLoop=loop+1;innerLoop<A.length;++innerLoop)
			{
				if(price < A[innerLoop])
				{
					result.add(A[innerLoop] - price);
				}
			}
		}
		
		if(result.size()>0)
		{
			Collections.sort(result);
			
			return result.get(result.size()-1);
		}
		else
		{
			return 0;
		}
			
	}
}
