package org.jzson.algoquiz;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] input = { 4, -2, -8, 5, -2, 7, 7, 2, -6, 5 };
		int res = subListSum(input);
		System.out.println(res);
	}

	public static int subListSum(int[] input) {
		int size = input.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + input[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
	}

	public static int subListSum2(int[] input) {
		int maxSum = 0;
		for (int i=0; i<input.length; i++) {
			for (int j=0; j<input.length; j++) {
				int res = sum(input, i, j);
				System.out.println(res + " ["+i+";"+j+"]");
		
				if (maxSum < res) {
					maxSum = res;
				}
			}
		}
		return maxSum;
	}
	
	private static int sum(int[] arr, int begin, int end) {
		int sum = 0;
		for (int i=begin; i<=end; i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
