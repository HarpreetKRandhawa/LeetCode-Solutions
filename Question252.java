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
    public boolean canAttendMeetings(Interval[] intervals) {
        int len = intervals.length;
        int[] start = new int[len];
        int[] end = new int[len];
        for(int i=0; i<len; i++){
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=1; i<len; i++){
            if(start[i] < end[i-1])
                return false;
        }
        return true;
    }
}

//Method II
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
    public boolean canAttendMeetings(Interval[] intervals) {
        if(intervals.length <= 1) return true;
        Arrays.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval i1, Interval i2){
                return i1.start-i2.start;
            }
        });
        for(int i=1; i<intervals.length; i++){
            if(intervals[i].start<intervals[i-1].end)
                return false;
        }
        return true;
    }
}
