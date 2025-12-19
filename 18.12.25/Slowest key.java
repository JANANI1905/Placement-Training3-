class Solution {

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        HashMap<Character, Integer> durationMap = new HashMap<>();
        durationMap.put(keysPressed.charAt(0), releaseTimes[0]);
        for (int i = 1; i < releaseTimes.length; i++) {
            int currentDuration = releaseTimes[i] - releaseTimes[i - 1];
            char currentKey = keysPressed.charAt(i);
            durationMap.put(currentKey,
                Math.max(durationMap.getOrDefault(currentKey, 0), currentDuration));
        }
        char slowestKey = ' ';
        int longestPressDuration = 0;
        for (Map.Entry mapElement : durationMap.entrySet()) {
            int duration = (int) mapElement.getValue();
            char key = (char) mapElement.getKey();
            if (duration > longestPressDuration) {
                longestPressDuration = duration;
                slowestKey = key;
            } else if (duration == longestPressDuration && key > slowestKey) {
                slowestKey = key;
            }
        }
        return slowestKey;
    }
}