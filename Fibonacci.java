/**
* 	@author Rodrigo Galura III
*	@date_created 09-27-15
*/

class Fibonacci {

	public int F(int n) {
		if ( n == 0 ) {
			return 0;
		} else if ( n == 1 ) {
			return 1;
		} else {
			return F(n - 2) + F(n - 1);
		}
	}

	public void printFibonacciSequence(int bilangNgNumber) {
		for (int i = 0; i < bilangNgNumber; i++) {
			System.out.print( F(i) + " " );
		}
	}

}