class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int cnt=0;
        while(sb.length()<B.length()){
            sb.append(A);
            cnt++;
        }
        if(sb.toString().contains(B))
            return cnt;
        if(sb.append(A).toString().contains(B))
            return ++cnt;
        return -1;
    }
}
