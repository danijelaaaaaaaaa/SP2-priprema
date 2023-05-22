

public class Primer {

	public int oddOrPos(int[] x) {
		int count = 0;
 HEAD
	

		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 1 || x[i] > 0) {
 Danijela-Slavujevic
				count++;
			}
		}
		return count;
	}
	// test: x = [-3, -2, 0, 1, 4]; Expected = 3

}

