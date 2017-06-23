/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null){
            return null;
        }
        
        LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        UndirectedGraphNode newHead = new UndirectedGraphNode(node.label);
        
        queue.add(node);
        map.put(node,newHead);
        
        while(!queue.isEmpty()){
            UndirectedGraphNode curr = queue.pop();
            List<UndirectedGraphNode> currneighbors = curr.neighbors;
            
            for(UndirectedGraphNode aneighbor: currneighbors){
                if(!map.containsKey(aneighbor)){
                    UndirectedGraphNode copy = new UndirectedGraphNode(aneighbor.label);
                    map.put(aneighbor,copy);
                    map.get(curr).neighbors.add(copy);
                    queue.add(aneighbor);
                }
                else{
                    map.get(curr).neighbors.add(map.get(aneighbor));
                }
            }
        }
        return newHead;
    }
}
