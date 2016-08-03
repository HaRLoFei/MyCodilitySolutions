package Lesson7;

import java.util.Stack;


public class BracketsSolution {
	
	public static void main(String args[])
	{
		String S ="{[()()]}";
		String SS ="([)()]";
		
		new BracketsSolution().solution(S);
		new BracketsSolution().solution(SS);
	}
	
	public int solution(String S) {
		
		Stack<String> bracketS = new Stack<String>();
		if(S.isEmpty())
		{
			return 1;
		}
		else
		{
			char[] charS = S.toCharArray();
			
			for(int index=0;index<S.length();++index)
			{
				if(charS[index]== '(' || charS[index]=='{' || charS[index]=='[')
				{
					bracketS.push(String.valueOf(charS[index]));
				}
				else
				{
					if(!bracketS.isEmpty())
					{
						String bracket = bracketS.peek() + String.valueOf(charS[index]);
						
						if(bracket.equals("()") || bracket.equals("{}") || bracket.equals("[]"))
						{
							bracketS.pop();
						}
						else
						{
							return 0;
						}
					}
					else
					{
						return 0;
					}

				}
			}
			
			if(bracketS.isEmpty())
				return 1;
			else
				return 0;
		}

    }

}
