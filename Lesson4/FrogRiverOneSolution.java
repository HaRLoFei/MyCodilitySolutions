package Lesson4;

import java.util.Set;
import java.util.TreeSet;

public class FrogRiverOneSolution {

	public static void main(String[] args) {
		
		int X=5;
		int[] A={1,3,1,4,2,3,5,4};
		new FrogRiverOneSolution().solution(X, A);
	}
	
	public int solution(int X, int[] A)
	{
		Set<Integer> listInt = new TreeSet<Integer>();
		for(int index=0;index<A.length;++index)
		{
			if(A[index] <= X)
			{
				listInt.add(A[index]);
				
				if(listInt.size() == X)
				{
					return index;
				}
			}
		}
		
		return -1;
	}

}
