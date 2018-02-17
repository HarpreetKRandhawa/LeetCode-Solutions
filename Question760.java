class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] res = new int[A.length];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
        for(int i=0; i<B.length; i++){
            if(map.get(B[i]) == null)
                map.put(B[i],new ArrayList<Integer>());
            map.get(B[i]).add(i);
        }
        for(int i=0; i<A.length; i++){
            if(map.containsKey(A[i])){
                res[i] = map.get(A[i]).get(0);
                map.get(A[i]).remove(0);
            }
        }
        return res;
    }
}
