class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int a=(arrivalTime+delayedTime)%24;
        return a;
    }
}