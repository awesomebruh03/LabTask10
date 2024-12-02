package org.example;

import java.util.ArrayList;
import java.util.List;

public class LongestWord {

    public List<String> findLongestWords(String input) {
        List<String> longestWords = new ArrayList<>();
        if (input == null || input.isEmpty()) {
            return longestWords;
        }

        int maxLength = 0;
        int start = 0;

        for (int i = 0; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) == ' ') {
                if (i > start) {
                    String word = input.substring(start, i);
                    int wordLength = word.length();
                    if (wordLength > maxLength) {
                        longestWords.clear();
                        longestWords.add(word);
                        maxLength = wordLength;
                    } else if (wordLength == maxLength) {
                        longestWords.add(word);
                    }
                }
                start = i + 1;
            }
        }

        return longestWords;
    }


}