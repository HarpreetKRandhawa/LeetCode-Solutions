class ValidWordAbbr {
    HashMap<String,String> map;
    public ValidWordAbbr(String[] dictionary) {
        map = = new HashMap<String,String>();
        for(int i=0; i<dictionary.length; i++){
            if(dictionary[i].length() < 3)
                continue;
            String word = dictionary[i];
            String key = word.charAt(0)+""+(word.length()-2)+word.charAt(word.length()-1);
            if(!map.containsKey(key))
                map.put(key,word);
            else
                map.put(key,"");
        }
    }
    
    public boolean isUnique(String word) {
        if(word.equals(""))
            return true;
        String key = word.charAt(0)+""+(word.length()-2)+word.charAt(word.length()-1);
        if(map.containsKey(key) && !map.containsValue(word))
            return false;
        return true;
    }
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */
