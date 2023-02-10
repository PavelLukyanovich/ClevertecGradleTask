package ru.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
    StringUtils stringUtils;
    String str;

    @BeforeEach
    public void init() {
        stringUtils = new StringUtils();
        str = "-12";
    }

    @Test
    public void isPositiveNumber_ifNumberNotPositive_returnFalse() {

        Assertions.assertFalse(stringUtils.isPositiveNumber(str));
    }
}