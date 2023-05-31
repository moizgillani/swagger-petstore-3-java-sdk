/*
 * SwaggerPetstoreOpenAPI30Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.swagger.petstore3.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * OrderStatusEnum to be used.
 */
public enum OrderStatusEnum {
    PLACED,

    APPROVED,

    DELIVERED;


    private static TreeMap<String, OrderStatusEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        PLACED.value = "placed";
        APPROVED.value = "approved";
        DELIVERED.value = "delivered";

        valueMap.put("placed", PLACED);
        valueMap.put("approved", APPROVED);
        valueMap.put("delivered", DELIVERED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static OrderStatusEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of OrderStatusEnum values to list of string values.
     * @param toConvert The list of OrderStatusEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OrderStatusEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OrderStatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 