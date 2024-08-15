class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int five = 0, ten = 0;
        for(int i = 0; i<n; i++){
            if(i == 0 && bills[i] > 5) return false;

            if(bills[i] == 5) five++;
            else if(bills[i] == 10){
                ten++;
                if(five >= 1) five--;
                else return false;
            }
            else{
                if(ten >= 1 && five >= 1){
                    ten--;
                    five--;
                }
                else if(ten == 0 && five >= 3){
                    five -= 3;
                }
                else return false;
            }
        }
        return true;
    }
}