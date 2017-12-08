public class MergeSort {

	public static void main(String[] args) {
		String[] arr = { "ayu", "ret", "fesfdsf", "trrvzshzdfh" };
		StringBuilder sb = new StringBuilder();
		for (String str : arr) {
			sb.append(str);
		}
		char[] input = sb.toString().toCharArray();
		char[] temp = input;
		mergesort(input);
		// mergesortInplace(0, input.length - 1, input, temp);
		System.out.println(String.valueOf(input));
	}

	static char[] mergesort(char[] input) {
		int n = input.length;
		if (n < 2)
			return input;
		int mid = n / 2;
		char[] left = new char[mid];
		char[] right = new char[n - mid];
		System.arraycopy(input, 0, left, 0, left.length);
		System.arraycopy(input, left.length, right, 0, right.length);
		mergesort(left);
		mergesort(right);
		merge(left, right, input);
		return input;
	}

	static void merge(char[] left, char[] right, char[] input) {
		int l = left.length;
		int r = right.length;
		int i = 0, j = 0, k = 0;

		while (i < l && j < r) {
			if (left[i] <= right[j]) {
				input[k] = left[i];
				i++;
			} else {
				input[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			input[k] = left[i];
			k++;
			i++;
		}
		while (j < r) {
			input[k] = right[j];
			k++;
			j++;
		}
	}

	/*
	 * static void mergesortInplace(int start, int end, char[] input, char[]
	 * temp) { if (start < end) { int mid = start + (end - start) / 2;
	 * mergesortInplace(start, mid, input, temp); mergesortInplace(mid + 1, end,
	 * input, temp); mergeInplace(start, mid, end, input, temp); }
	 * 
	 * }
	 * 
	 * static void mergeInplace(int start, int middle, int end, char[] input,
	 * char[] temp) {
	 * 
	 * for (int i = start; i <= end; i++) { temp[i] = input[i]; }
	 * 
	 * int i = start, j = middle + 1, k = start; while (i <= middle && j <= end)
	 * { if (temp[i] <= temp[j]) { input[k] = temp[i]; i++; } else { input[k] =
	 * temp[j]; j++; } k++; } while (i <= middle) { input[k] = temp[i]; i++;
	 * k++; } while (j <= end) { input[k] = temp[j]; j++; k++; }
	 * 
	 * }
	 */
//the time complexity of merge sort is O(n log n ) . This is because the merge happens with log n times dividing the 
	//tree into 
}
