package Lesson9;

public class MaxSliceSumSolution {

	public static void main(String[] args)
	{
		int[] A = {-10};
		new MaxSliceSumSolution().solution(A);
	}
	
	public int solution(int[] A)
	{
		int maxSum=A[0];
		for(int count=0;count<A.length;count++)
		{
				int resultInnerCount=A[count];
				for(int innerCount=count;innerCount<A.length;++innerCount)
				{

					if(innerCount == count)
					{
						resultInnerCount = A[innerCount];
					}
					else
					{
						resultInnerCount +=  A[innerCount];
					}
					
					if(resultInnerCount>maxSum)
					{
						maxSum=resultInnerCount;
					}
					
				}

		}
		
		return maxSum;
	}
}
