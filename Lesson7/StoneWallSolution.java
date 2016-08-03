package Lesson7;

import java.util.Stack;

public class StoneWallSolution {

	public static void main(String[] args)
	{

		int[] A={8, 8, 5, 7, 9, 8, 7, 4, 8};
		new StoneWallSolution().solution(A);
	}
	
	public int solution(int[] H)
	{		
		Stack<Integer> stone = new Stack<Integer>();
		int count = 0;
		stone.add(H[0]);
		++count;
		for(int loop=1;loop<H.length;++loop)
		{
			if(stone.peek()==H[loop])
			{
				stone.add(H[loop]);
			}
			else if(stone.peek()<H[loop])
			{
				stone.add(H[loop]);
				++count;
			}
			else
			{
				if(!stone.contains(H[loop]))
				{
					stone.add(H[loop]);
					++count;
				}
				else
				{
					int pos = stone.search(H[loop]);
					
					for(int innerLoop = (loop-1) ;(loop-pos)<innerLoop;--innerLoop)
					{
						if(H[innerLoop]<H[loop])
						{
							++count;
							break;
						}
					}
					stone.add(H[loop]);
				}
			}
		}
		return count;
	}
	
}
