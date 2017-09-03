class Solution {
    public int minMutation(String start, String end, String[] bank) {
        //BFS Solution
        if(start.equals(end)) return 0;
        HashSet<String> bankSet = new HashSet<String>();
        for(String s: bank)
            bankSet.add(s);
        
        char[] mutationSet = new char[]{'A', 'C', 'G', 'T'};
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        int level = 0;
        visited.add(start);
        queue.add(start);
        
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int j=0; j<n; j++){
                String curr = queue.poll();
                if(curr.equals(end)) return level;
                
                char[] currArray = curr.toCharArray();
                for(int i=0; i<currArray.length; i++){
                    char old = currArray[i];
                    for(char c: mutationSet){
                        currArray[i] = c;
                        String newString = new String(currArray);
                        if(!visited.contains(newString) && bankSet.contains(newString)){
                            visited.add(newString);
                            queue.add(newString);
                        }
                    }
                    currArray[i] = old;
                }
            }
            level++;
        }
        return -1;
    }
}
