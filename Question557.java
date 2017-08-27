class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0)
            return "";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String w: arr){
            StringBuilder temp = new StringBuilder();
            temp.append(w);
            sb.append(temp.reverse()+" ");
        }
        String res = sb.toString();
        return res.substring(0,res.length()-1);
    }
}
