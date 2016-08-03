package Lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FishSolution {

	public static void main(String args[])
	{
		int[] B = {0,1,0,0,0};
		int[] A = {4,3,2,1,5};
		
		new FishSolution().solution(A, B);
	}
	
	public int solution(int[] A, int[] B)
	{	
		Stack<Integer> aliveFish = new Stack<Integer>();
		Map<Integer,Integer> reverseFishMap = new HashMap<Integer,Integer>();
		
		Stack<Integer> upFish = new Stack<Integer>();
		Stack<Integer> downFish = new Stack<Integer>();
		
		int initStream = B[0];
		for(int index=0;index<A.length;++index)
		{
			
			if(B[index] == 1)
			{	
				downFish.push(A[index]);
				aliveFish.push(A[index]);
				initStream = B[index];

			}
			else
			{

				if(initStream!=1)
				{
					upFish.push(A[index]);
				}
				else
				{
					while(!downFish.empty() && A[index]>downFish.peek())
					{
						downFish.pop();
					}
					
					if(downFish.empty())
					{

						upFish.push(A[index]);
						initStream = B[index];
					}
						
				}
				
			}
		}
		return upFish.size() + downFish.size();
	}

}
