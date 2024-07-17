class Solution {
    public int minimumCardPickup(int[] cards) {
        int minCount = Integer.MAX_VALUE;
        Map<Integer, Integer> cardIndexMap = new HashMap<>();
    
        for (int i = 0; i < cards.length; i++) {
            if (cardIndexMap.containsKey(cards[i])) {
                int previousIndex = cardIndexMap.get(cards[i]);
                int currentCount = i - previousIndex + 1;
                minCount = Math.min(minCount, currentCount);
            }
            cardIndexMap.put(cards[i], i);
        }
        return minCount == Integer.MAX_VALUE ? -1 : minCount;
    }
}