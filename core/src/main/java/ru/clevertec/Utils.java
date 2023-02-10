package ru.clevertec;

import java.util.Arrays;

public class Utils {
    static boolean isAllPositiveNumbers(String... str) {

        return Arrays.stream(str)
                .allMatch(StringUtils::isPositiveNumber);
    }
}
