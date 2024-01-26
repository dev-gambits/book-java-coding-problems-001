package website.sideral.exercise.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringHashMapService {

    private StringHashMapService() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static Map<Character, Integer> countDuplicateCharactersV1(String str) {

        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return Collections.emptyMap();
        }

        Map<Character, Integer> result = new HashMap<>();

        // or use for(char ch: str.toCharArray()) { ... }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }
}
