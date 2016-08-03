package Lesson1;

import java.util.Arrays;

public class BinaryGapSolution {

	public static void main(String []args)
	{
		new BinaryGapSolution().solution(20);
	}
	
    public int solution(int N) 
    {      
	     String binaryString = Integer.toBinaryString(N); 
	
	     int indexOneFirst = binaryString.indexOf("1");
	     int indexOneLast = binaryString.lastIndexOf("1");
	     String filteredBinaryString = binaryString.substring(indexOneFirst, indexOneLast+1);
	     String[] binaryStringSplit = filteredBinaryString.split("1");
	     if(binaryStringSplit.length>0 )
	     {
	         Arrays.sort(binaryStringSplit);
	    	 return	binaryStringSplit[binaryStringSplit.length-1].length();
	     }
	    else
	    {
	        return 0;
	    }
  }

}
