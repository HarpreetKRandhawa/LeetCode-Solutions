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
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()<=1)
            return intervals;
        List<Interval> res = new ArrayList<Interval>();
        //intervals.sort((i1,i2)->Integer.compare(i1.start,i2.start));
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }
        });
        int s = intervals.get(0).start;
        int e = intervals.get(0).end;
        for(Interval interval:intervals){
            if(interval.start <= e){
                e = Math.max(e,interval.end);
            }
            else{
               res.add(new Interval(s,e));
                s = interval.start;
                e = interval.end;
            }
        }
        res.add(new Interval(s,e));
        return res;
    }
}
