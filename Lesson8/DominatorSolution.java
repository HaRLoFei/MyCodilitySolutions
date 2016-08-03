package Lesson8;

import java.util.NavigableMap;
import java.util.TreeMap;

public class DominatorSolution {

	public static void main(String args[])
	{
		int[] a = {3,4,3,2,3,-1,3,3};
		new DominatorSolution().solution(a);
	}
	public int solution(int[] A)
	{
		NavigableMap<Integer,Integer> result = new TreeMap<Integer,Integer>();
		int size = A.length;
		int count=0;
		
		for(int a : A)
		{
			Integer value = result.get(a);
			
			if(value == null)
			{
				result.put(a, 1);
			}
			else
			{
				result.put(a, ++value);
				
				if(value > (size/2))
				{
					return count;
				}
			}
			
			++count;
		}
		
		if(A.length==1)
		{
			return 0;
		}
		else
		{
			return -1;
		}
		
	}

}
