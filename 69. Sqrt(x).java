class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(mid <= x / mid && (mid + 1) > x / (mid + 1))
                return mid;
            else if(mid <= x / mid && (mid + 1) <= x / (mid + 1))
                low = mid;
            else
                high = mid;
        }
        return 0;
    }
}