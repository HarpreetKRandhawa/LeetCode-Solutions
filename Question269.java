public class Solution {
    private final int n = 26;
    public String alienOrder(String[] words) {
        boolean[][] adj = new boolean[n][n];
        int[] visited = new int[n];
        buildGraph(words,adj,visited);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            if(visited[i] == 0){
                if(!dfs(adj,visited,sb,i))
                    return "";
            }
        }
        return sb.reverse().toString();
    }
    
    public boolean dfs(boolean[][] adj, int[] visited, StringBuilder sb, int i){
        visited[i] = 1;
        for(int j=0; j<n; j++){
            if(adj[i][j]){
                if(visited[j] == 1)
                return false;
                if(visited[j] == 0){
                    if(!dfs(adj,visited,sb,j))
                        return false;    
                }
            }
        }
        visited[i] = 2;
        sb.append((char)( i +'a'));
        return true;
    }
    public void buildGraph(String[] words, boolean[][] adj, int[] visited){
        Arrays.fill(visited,-1);
        for(int i=0; i<words.length; i++){
            for(char c: words[i].toCharArray()){
                visited[c-'a'] = 0;
                if(i>0){
                    String w1 = words[i-1];
                    String w2 = words[i];
                    int len = Math.min(w1.length(),w2.length());
                    for(int j=0; j<len; j++){
                        if(w1.charAt(j) != w2.charAt(j)){
                            adj[w1.charAt(j)-'a'][w2.charAt(j)-'a'] = true;
                            break;
                        }
                    }
                }
            }
        }
    }
}
