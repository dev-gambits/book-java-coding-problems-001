package website.sideral.exercise1.repository;

import static website.sideral.exercise1.util.StringsFinalUtil.TEXT_CP_EMPTY_UTIL;

public class StringUtilService implements StringUtilsRepository {

    @Override
    public String stringZeroCharacter(String arg) {
        final String stringEmpty = TEXT_CP_EMPTY_UTIL;
        return stringEmpty;
    }
}
