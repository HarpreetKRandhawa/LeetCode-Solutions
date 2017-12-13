class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder s = new StringBuilder(S.toUpperCase().replace("-",""));
        s = s.reverse();
        for(int i=K; i<s.length(); i=i+K)
            s.insert(i++,"-");
        
        return s.reverse().toString();
    }
}
