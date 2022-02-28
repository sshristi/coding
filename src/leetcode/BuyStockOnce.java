//Buy stock once & sell once. such that profit is maximum
//use Maximum difference algo for this.
//keep record of max-diff. & min-no.

package leetcode;

public class BuyStockOnce {

	public static void main(String[] args) {
		BuyStockOnce maxdif = new BuyStockOnce();
        int arr[] = {100  , 180, 260, 310, 40, 535, 695};
        int size = arr.length;
        System.out.println("Maximum profit is " +
                                maxdif.maxDiff(arr, size));

	}

	private int maxDiff(int[] arr, int size) {
		int profit = arr[1] - arr[0];
		int min = arr[0];
		for(int i=1;i<size;i++) {
			if(arr[i]-min>profit)
				profit = arr[i]-min;
			if(arr[i]<min)
				min = arr[i];		
		}
		return profit;
	}

}
