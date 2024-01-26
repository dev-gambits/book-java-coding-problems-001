package website.sideral.exercise1.controller;

import website.sideral.exercise.service.StringHashMapService;
import website.sideral.exercise.util.DisplayExecutionTimeUtil;
import website.sideral.exercise1.repository.StringUtilsRepository;

import java.util.Arrays;
import java.util.Map;

import static website.sideral.exercise.util.StringsUtil.TEXT_CP_UTIL;
import static website.sideral.exercise.util.StringsUtil.TEXT_UTIL;

public class StringHashMapController {

    private static DisplayExecutionTimeUtil displayExecutionTimeUtil;
    private static StringUtilsRepository stringUtilsRepository;

    public static void stringHashMap(String[] args) {

        //System.out.println("Input text: \n" + stringUtilsRepository.stringZeroCharacter(String.valueOf(args)) + "\n" );

        System.out.println("\n\nASCII or 16 bits Unicode characters (less than 65,535 (0xFFFF)) examples:\n");

        System.out.println("HashMap based solution:");
        long startTimeV1 = System.nanoTime();

        Map<Character, Integer> duplicatesV1 = StringHashMapService.countDuplicateCharactersV1(TEXT_CP_UTIL);

        displayExecutionTimeUtil.displayExecutionTime(System.nanoTime()-startTimeV1);
        System.out.println(Arrays.toString(duplicatesV1.entrySet().toArray()));
        // or: duplicatesV1.forEach( (k, v) -> System.out.print(k + "="+ v + ", "));

    }
}
