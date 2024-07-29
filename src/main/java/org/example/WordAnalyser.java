package org.example;
import java.util.HashMap;
import java.util.Map;

public class WordAnalyser {
    public String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text
        //separate words
        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");
        //loop through each word to get length
        int index = 0;

        for (int i = 0; i < words.length; i++){
            if (words[i].length() > words[index].length()){
                index = i;
            }
        }
        //get the word with longest length
        return new String[]{words[index]};
    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        HashMap<Character,Integer> hashMap = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String lowerCaseText = text.toLowerCase();

        for (int i = 0; i < alphabet.length(); i++) {
            int num = 0;
            hashMap.put(alphabet.charAt(i), 0);
            for (int j = 0; j < lowerCaseText.length(); j ++) {
                if (lowerCaseText.charAt(j) == alphabet.charAt(i)) {
                    num++;
                    hashMap.replace(lowerCaseText.charAt(j), num);

                }
            }
        }
        return hashMap;
    }
}
