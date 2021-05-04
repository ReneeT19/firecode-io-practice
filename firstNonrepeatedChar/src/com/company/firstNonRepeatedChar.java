package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class firstNonRepeatedChar {

    public static void main(String[] args) {
	// write your code here
        System.out.println(firstNonRepeatedCharacter("aabnrr"));
        System.out.println(firstNonRepeatedCharacter("ccccc"));
    }

    public static Character firstNonRepeatedCharacter(String str) {

        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (repeating.contains(letter)) { return null; }
            if (nonRepeating.contains(letter)) { nonRepeating.remove((Character) letter); repeating.add(letter);
            } else { nonRepeating.add(letter); }
        }
        return nonRepeating.get(0);
    }
}
