class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int rect1 = Math.abs(D-B) * Math.abs(C-A);
        int rect2 = Math.abs(H-F) * Math.abs(G-E);
        
        int x1 = Math.max(A,E);
        int y1 = Math.max(B,F);
        
        int x2 = Math.min(C,G);
        int y2 = Math.min(D,H);
        
        int overlap = 0;
        if(x1<x2 && y1<y2 )
            overlap = Math.abs(x1-x2) * Math.abs(y1-y2);
        return rect1+rect2-overlap;
    }
}

        
