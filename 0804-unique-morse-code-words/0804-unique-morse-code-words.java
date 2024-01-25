class Solution {
       static String [] letters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; 
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
		for(String word: words){
			String morseCharacter = getMorseCharacter(word);
			if(map.containsKey(morseCharacter)){
				map.put(morseCharacter, map.get(morseCharacter)+1);
			}else{
				map.put(morseCharacter, 1);
			}
		}
        return map.size();
    }
    
    private String getMorseCharacter(String word){
		StringBuilder sb = new StringBuilder("");
				for(char ch: word.toCharArray()){
					sb.append(letters[ch-'a']);
				}
				return sb.toString();
	}
}