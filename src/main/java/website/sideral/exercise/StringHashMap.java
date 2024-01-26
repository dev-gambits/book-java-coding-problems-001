package website.sideral.exercise;

import website.sideral.book.Strings;
import website.sideral.exercise.service.StringHashMapService;
import website.sideral.exercise.util.DisplayExecutionTimeUtil;

import java.util.Arrays;
import java.util.Map;

import static website.sideral.exercise.util.StringsUtil.TEXT_CP_UTIL;
import static website.sideral.exercise.util.StringsUtil.TEXT_UTIL;

public class StringHashMap {

    private static DisplayExecutionTimeUtil displayExecutionTime;


    public static void stringHashMap(String[] args) {

        System.out.println("Input text: \n" + TEXT_UTIL + "\n");

        System.out.println("\n\nASCII or 16 bits Unicode characters (less than 65,535 (0xFFFF)) examples:\n");

        System.out.println("HashMap based solution:");
        long startTimeV1 = System.nanoTime();

        Map<Character, Integer> duplicatesV1 = StringHashMapService.countDuplicateCharactersV1(TEXT_CP_UTIL);

        displayExecutionTime.displayExecutionTime(System.nanoTime()-startTimeV1);
        System.out.println(Arrays.toString(duplicatesV1.entrySet().toArray()));
        // or: duplicatesV1.forEach( (k, v) -> System.out.print(k + "="+ v + ", "));

    }
}
