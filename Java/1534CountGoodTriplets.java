class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int arrayLength = arr.length;
        int goodTripletsCount = 0;
        for (int i = 0; i < arrayLength-2; ++i) {
            for (int j = i + 1; j < arrayLength-1; ++j) {
                if (Math.abs(arr[i] - arr[j]) > a) continue;
                for (int k = j + 1; k < arrayLength; ++k) {
                     if(Math.abs(arr[j] - arr[k]) > b) continue; 
                    if (Math.abs(arr[i] - arr[k]) <= c) {
                            ++goodTripletsCount;
                    }
                }
            }
        }
        return goodTripletsCount;
    }
}