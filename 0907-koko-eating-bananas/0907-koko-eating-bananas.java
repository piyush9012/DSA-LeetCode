class Solution {
    public int func(int piles[], int h){
        int total_hours = 0;
        for(int i = 0; i < piles.length; i++){
            total_hours += Math.ceil((double)piles[i]/(double)h);
        }
        return total_hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< piles.length; i++){
            max = Math.max(piles[i], max);
        }

        int low = 0, high = max;
        while(low <= high){
            int mid = (low+high)/ 2;
            int total_hours = func(piles, mid);
            if(total_hours <= h) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}