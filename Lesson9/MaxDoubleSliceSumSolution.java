package Lesson9;

import java.util.SortedSet;
import java.util.TreeSet;


public class MaxDoubleSliceSumSolution {
	
	public static void main(String args[])
	{
		int[] A = {3, 2, 6, -1, 4, 5, -1, 2};
		new MaxDoubleSliceSumSolution().solution(A);
	}
	public int solution(int[] A)
	{		
		SortedSet<Integer> result = new TreeSet<Integer>();
		int maxSum=0;
		for(int x=0;x+2<A.length;++x)
		{
			for(int y=x+1;y+1<A.length;++y)
			{
				for(int z=y+1;z<A.length;++z)
				{
					int sum=0;
					for(int countSum=x+1;countSum<z;++countSum)
					{
						if(y-x > 1 || z-y > 1)
						{
							if(countSum != y)
							{
								sum+=A[countSum];
							}
							
						}
						
						if(sum>maxSum)
						{
							maxSum=sum;
						}

					}
				}
			}			
			
		}
		
		return maxSum;
		
	}

}
