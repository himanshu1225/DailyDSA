class Solution {
    static String [] letters =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; 
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> uniqueMorseCodes = new HashSet<>();
        for(String word: words){
            uniqueMorseCodes.add(transformString(word));   
        }
        return uniqueMorseCodes.size();
    }
    
    private String transformString(String word){
        StringBuilder sb = new StringBuilder("");
        for(char ch: word.toCharArray()){
            sb.append(letters[ch-'a']);
        }  
        return sb.toString();
    }
}