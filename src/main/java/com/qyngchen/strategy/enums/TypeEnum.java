package com.qyngchen.strategy.enums;

import java.util.HashMap;
import java.util.Map;

public enum TypeEnum {

    TEST_ONE_SER(1, "testOneServiceImpl"),
    TEST_TWO_SER(2, "testTwoServiceImpl"),
    ;

    private Integer code;

    private String serName;

    TypeEnum(Integer code, String serName) {
        this.code = code;
        this.serName = serName;
       // cache.put(code, this);
    }

    public String getSerName() {
        return this.serName;
    }

    private static final Map<Integer, TypeEnum> cache = new HashMap<>();

    public static TypeEnum fromCode(Integer code) {
        return cache.get(code);
    }
}
