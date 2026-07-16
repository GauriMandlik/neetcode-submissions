class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxVal = -1;
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxVal;
            if (current > maxVal) {
                maxVal = current;
            }
        }
        return arr;
    }
}