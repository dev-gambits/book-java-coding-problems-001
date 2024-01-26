package website.sideral.exercise1.service.implement;

import website.sideral.exercise1.service.IStringHashMapService;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringsHashMapService implements IStringHashMapService {

    private StringsHashMapService() {
        throw new AssertionError("Cannot be instantiated");
    }

    public Map<Character, Integer> countDuplicateCharactersHashMap(String str) {

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
