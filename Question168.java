class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            n--;
            char i = (char)(n%26+'A');
            sb.append(i);
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
