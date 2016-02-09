// This short code snippet will be modified to show the differences between linear and bubble searches

public class SearchExample {
	
	//binary search
	/*
	 * 1. Let min = 0 and max = n-1.
	 * 2. Compute guess as the average of max and min, rounded down (so that it is an integer).
	 * 3. If array[guess] equals target, then stop. You found it! Return true.
	 * 4. If the guess was too low, that is, array[guess] < target, then set min = guess + 1.
	 * 5. Otherwise, the guess was too high. Set max = guess - 1.
	 * 6. Go back to step 2.
	 */
	public static boolean findItBinary(int searchItem, int[] list){
		return true;
	}
	
	//sequential search
	public static boolean findItSequentially(int searchItem, int[] list){
		for(int i = 0; i < list.length; i++){
			System.out.println("Iteration: "+ (i+1));
			if(list[i] == searchItem){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] numbers = {23, 25, 56, 78, 89, 103, 304, 345, 565, 876};
		
		if(findItSequentially(23, numbers))
			System.out.println("Found it!");
		else
			System.out.println("Did not find it!");
	}

}
