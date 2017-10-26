/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        int len = intervals.length;
        int[] start = new int[len];
        int[] end = new int[len];
        int rooms = 0;
        int endIn = 0;
        
        for(int i=0; i<len; i++){
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        for(int i=0; i<len; i++){
            if(start[i] < end[endIn])
                rooms++;
            else
                endIn++;
        }
        return rooms;
    }
}
