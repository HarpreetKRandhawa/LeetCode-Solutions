public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if(strs == null || strs.size() == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            if(str.length() == 0 || str == null)
                sb.append("0#");
            else
                sb.append(str.length()+"#"+str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> ls = new ArrayList<String>();
        if(s == null || s.length() == 0)
            return ls;
        int i,j;
        i=0;
        while(i<s.length()){
            j=i;
            while(j<s.length() && Character.isDigit(s.charAt(j))){
                j++;
            }
            int num = Integer.parseInt(s.substring(i,j));
            i = j;
            i++;
            if(num==0)
                ls.add("");
            else
                ls.add(s.substring(i,i+num));
            i += num;
        }
        return ls;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
