public static int findPeakElement(int[] number) {
    int start = 0;
    int end = number.length - 1;
    int n = number.length;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        int left = (mid == 0) ? Integer.MIN_VALUE : number[mid - 1];
        int right = (mid == n - 1) ? Integer.MIN_VALUE : number[mid + 1];

        if (number[mid] > left && number[mid] > right) {
            return mid; // Peak found
        } else if (number[mid] < right) {
            // Ascending slope → move right
            start = mid + 1;
        } else {
            // Descending slope → move left
            end = mid - 1;
        }
    }

    return 0;
}

void main() {

    int[] arr = {1, 2, 3, 1};

    int peakIndex = findPeakElement(arr);

    IO.println("Peak element index: " + peakIndex);
    IO.println("Peak element value: " + arr[peakIndex]);
}