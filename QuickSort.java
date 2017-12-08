public class QuickSort {

	public static void main(String[] args) {
		String[] arr = { "ayu", "ret", "fesfdsf", "trrvzshzdfh" };
		StringBuilder sb = new StringBuilder();
		for (String str : arr) {
			sb.append(str);
		}
		char[] input = sb.toString().toCharArray();
		quicksort(input, 0, input.length - 1);
		System.out.println(String.valueOf(input));
	}

	static void quicksort(char[] input, int start, int end) {
		if (start < end) {
			int pIndex = partition(input, start, end);
			quicksort(input, start, pIndex - 1);
			quicksort(input, pIndex + 1, end);
		}
	}

	static int partition(char[] input, int start, int end) {
		char pivot = input[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (input[i] <= pivot) {
				char temp = input[pIndex];
				input[pIndex] = input[i];
				input[i] = temp;
				pIndex++;
			}
		}
		char temp = input[pIndex];
		input[pIndex] = input[end];
		input[end] = temp;
		return pIndex;
	}

}
