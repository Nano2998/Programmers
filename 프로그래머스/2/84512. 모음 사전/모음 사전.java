import java.util.*;

class Solution {
    private static final char[] Characters = {'A','E','I','O','U'};
    
    public int solution(String word) {
        ArrayList<String> arr = new ArrayList<>();
        
        makewords("",arr);
        
        return arr.indexOf(word);
    }
    
    private void makewords(String word, ArrayList<String> arr) {
        arr.add(word);
        
        if(word.length()==5) return;
        
        for(char c : Characters) {
            makewords(word+c,arr);
        }
    }
    
}