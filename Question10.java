class Solution {
    public boolean isMatch(String s, String p) {
        if(s == null || p == null)
            return false;
        boolean[][] res = new boolean[s.length()+1][p.length()+1];
        res[0][0] = true;
        
        for(int j=1; j<res[0].length; j++){
            if(p.charAt(j-1) == '*'){
                res[0][j] = res[0][j-2];
            }
        }
        
        for(int i=1; i<res.length; i++){
            for(int j=1; j<res[0].length; j++){
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.'){
                    res[i][j] = res[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    if(res[i][j-2])
                        res[i][j] = res[i][j-2];
                    else if(p.charAt(j-2) == s.charAt(i-1) || p.charAt(j-2) == '.')
                        res[i][j] = res[i-1][j];
                }
                else
                    res[i][j] = false;
            }
        }
        
        return res[s.length()][p.length()];
    }
}
