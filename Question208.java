class TrieNode {
    public char val;
    public boolean isWord;
    public TrieNode[] children = new TrieNode[26];
    public TrieNode(){}
    public TrieNode(char c){
        TrieNode node = new TrieNode();
        node.val = c;
    }
}
public class Trie {
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
        root.val = ' ';
    }
    
    public void insert(String word) {
        TrieNode ws = root;
        for(int i=0; i<word.length(); i++){
            char y = word.charAt(i);
            if(ws.children[y - 'a'] == null)
                ws.children[y - 'a'] = new TrieNode(y);
            ws = ws.children[y - 'a'];
        }
        ws.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode ws = root;
        for(int i=0; i<word.length(); i++){
            char y = word.charAt(i);
            if(ws.children[y - 'a'] == null)
                return false;
            ws = ws.children[y - 'a'];
        }
        return ws.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode ws = root;
        for(int i=0; i<prefix.length(); i++){
            char y = prefix.charAt(i);
            if(ws.children[y - 'a'] == null)
                return false;
            ws = ws.children[y - 'a'];
        }
        return true;    
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
