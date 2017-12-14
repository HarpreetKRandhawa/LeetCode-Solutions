class Solution {
    public boolean isStrobogrammatic(String num) {
        StringBuilder dup = new StringBuilder();
        for(int i=num.length()-1; i>=0; i--){
            char t = num.charAt(i);
            if(t=='0'||t=='1'||t=='8')
                dup.append(t);
            else if(t=='6')
                dup.append('9');
            else if(t=='9')
                dup.append('6');
            else
                return false;
        }
        if(!dup.toString().equals(num))
            return false;
        return true;
    }
}
