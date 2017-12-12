class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new ArrayList<List<String>>();
        HashMap<String,Set<String>> map = new HashMap<String,Set<String>>();
        for(String p: paths){
            String[] line = p.split(" ");
            for(int i=1; i<line.length; i++){
                String content = line[i].substring(line[i].indexOf('(')+1,line[i].length()-1);
                String fileName = line[0]+"/"+line[i].substring(0,line[i].indexOf('('));
                Set<String> fileNames = map.getOrDefault(content,new HashSet<String>());
                fileNames.add(fileName);
                map.put(content,fileNames);
            }
        }
        for(String l: map.keySet()){
            if(map.get(l).size() > 1)
                res.add(new ArrayList<String>(map.get(l)));
        }
        return res;
    }
}
