class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> sDict = new TreeMap<>();
        Map<String, Integer> tDict = new TreeMap<>();
        
        for(int i = 0; i < s.length(); i++){
            String letter = Character.toString(s.charAt(i));
            if(sDict.keySet().contains(letter)){
                sDict.put(letter, sDict.get(letter) + 1);
            }else{
                sDict.put(letter, 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            String letter = Character.toString(t.charAt(i));
            if(tDict.keySet().contains(letter)){
                tDict.put(letter, tDict.get(letter) + 1);
            }else{
                tDict.put(letter, 1);
            }
        }

        if(sDict.keySet().size() != tDict.keySet().size()){
            return false;
        }

        for(String key : sDict.keySet()){
            if(!(sDict.get(key).equals(tDict.get(key)))){
                return false;
            }
        }
        return true;
    }  

}
