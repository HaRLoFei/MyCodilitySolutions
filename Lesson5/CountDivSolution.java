package Lesson5;

public class CountDivSolution {


	public static void main(String[] args) {
		
		int A = 6;
		int B = 11;
		int K= 2;
		
		new CountDivSolution().solution(A, B, K);
	}
	
	public int solution(int A, int B, int K) {

        int divCount = 0;
        
        for(int start = A; start <=B; start++)
        {
            if(start%K == 0)
            {
                divCount++;
            }
        }
        
        return divCount;
    }

}
