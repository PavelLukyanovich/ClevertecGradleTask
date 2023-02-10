package ru.clevertec;

import java.util.Arrays;

class Utils {
    public static boolean isAllPositiveNumbers(String... str) {

        return Arrays.stream(str)
                .allMatch(StringUtils::isPositiveNumber);
    }
}
