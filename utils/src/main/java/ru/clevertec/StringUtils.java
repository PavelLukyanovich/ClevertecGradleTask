package ru.clevertec;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        return !org.apache.commons.lang3.StringUtils.contains(str, '-');
    }
}
