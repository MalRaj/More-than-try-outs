package internet_samples;



public class SmallestDivisble {

	public static void main(String[] args){
		long start = System.currentTimeMillis();
		//Get numbers between 100 and 999
		// product of every number
		//check if palindrome
		//return largest of the panidrome
		int smallest = 0;
		int count = 0;
		int j = 1;
		boolean cont = false;
		 do{
				for (int i = 20; i >=1; i--) {
					if(j % i == 0){
						count++;
					}else{
						j++;
						count = 0;
					}
					if(count == 20){
						smallest = j;
						cont = true;
						break;
					}
				}
		 }while(!cont);
			System.out.println(smallest);
			long end = System.currentTimeMillis();
			System.out.println(end -start);
	}
}
/*
 * This does not require programming at all. Compute the prime factorization of
 * each number from 1 to 20, and multiply the greatest power of each prime
 * together: 20 = 2^2 * 5 19 = 19 18 = 2 * 3^2 17 = 17 16 = 2^4 15 = 3 * 5 14 =
 * 2 * 7 13 = 13 11 = 11 All others are included in the previous numbers.
 * ANSWER: 2^4 * 3^2 * 5 * 7 * 11 * 13 * 17 * 19 = 232 792 560
 */
