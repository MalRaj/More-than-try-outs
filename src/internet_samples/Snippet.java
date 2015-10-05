package internet_samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snippet {
	static BufferedReader in = new BufferedReader(new InputStreamReader(
			System.in));
	static StringBuilder out = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * for i = 1 to M do
    for j = 1 to N do
        if j % B[i] == 0 then
            A[j] = A[j] * C[i]
        endif
    end do
end do
		 */
		
		
		int N = Integer.parseInt(in.readLine());
		int M = Integer.parseInt(in.readLine());
		int[] A = new int[N];
		int[] B = new int[M];
		int[] C = new int[M];
		
		for (int i=0;i<N;i++) {
			A[i] = Integer.parseInt(in.readLine());
		}
	
		for (int i=0;i<M;i++) {
			B[i] = Integer.parseInt(in.readLine());
			C[i] = Integer.parseInt(in.readLine());
		}
		
		
		for(int ii =1;ii<M;ii++){
			for(int jj=1;jj<N;jj++){
				if(jj % B[ii] == 0){
					A[jj] = (A[jj] * C[ii]) ;
							//% 1000000007;
					
				}
			}
		}
		for (int k = 0; k < A.length; k++) {
			System.out.println(A[k]);
		}
		
	}
}

