package Lesson6;

public class MaxProductOfThreeSolution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-3,1,2,-2,5,6};
		new MaxProductOfThreeSolution().solution(a);

	}
	
	 public int solution(int[] A) 
	 {
		 int maxProduct = A[0] * A[1] * A[2];
		 
		 for(int p=0;p<A.length-2;++p)
		 {
			 for(int q=p+1;q<A.length-1;++q)
			 {
				 for(int r=q+1;r<A.length;++r)
				 {

					 if(A[p] * A[q] * A[r] > maxProduct)
					 {
						 maxProduct = A[p] * A[q] * A[r];
					 }

				 }
			 }
		 }

		 return maxProduct;
	 }

}
