package Lesson2;

public class CyclicRotationSolution {
	
	public static void main(String []args)
	{
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		new CyclicRotationSolution().solution(A,K);
	}

	public int[] solution(int[] A, int K) 
	{
		if(A.length > 1)
		{
			if(A.length >= K)
			{
				int[] newA = new int [A.length];
				
				for(int count=0;count<A.length;count++)
				{
					int elementA = A[count];
					int newPos = count+K;
					if(newPos<newA.length)
					{
						newA[count+K] = elementA;
					}
					else
					{
						newA[newPos-newA.length] = elementA; 
					}
					
				}
				
				return newA;
			}
			else
			{
				for(int rotate=1;rotate<=K;rotate++)
				{
					int temp = A[A.length-1];
					for(int count=A.length-2;count>-1;count--)
					{
						A[count+1]=A[count]; 
					}
					A[0] = temp;
				}
				return A;
			}

		}
		else
		{
			return A;
		}
    }

}
