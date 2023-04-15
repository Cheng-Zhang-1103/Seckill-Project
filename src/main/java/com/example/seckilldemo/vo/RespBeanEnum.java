package com.example.seckilldemo.vo;

import org.springframework.stereotype.Component;

/**
 * Enumeration of public return objects
 *
 * @author: xing
 * @ClassName: RespBean
 */

public enum RespBeanEnum {

    //General
    SUCCESS(200, "SUCCESS"),
    ERROR(500, "Server-side exceptions"),

    //Login Module
    LOGIN_ERROR(500210, "Incorrect username or password"),
    MOBILE_ERROR(500211, "Incorrect format of phone number"),
    BIND_ERROR(500212, "Parameter checksum exception"),
    MOBILE_NOT_EXIST(500213, "Phone number does not exist"),
    PASSWORD_UPDATE_FAIL(500214, "Failed to update password"),
    SESSION_ERROR(500215, "User SESSION does not exist"),


    //Seckill Module
    EMPTY_STOCK(500500, "Insufficient inventory"),
    REPEATE_ERROR(500501, "This item is limited to one per person"),
    REQUEST_ILLEGAL(500502, "Request is illegal, please try again"),
    ERROR_CAPTCHA(500503, "The verification code is wrong, please re-enter"),
    ACCESS_LIMIT_REACHED(500504, "Access is too frequent, please try again later"),
    //Order Module 5003xx
    ORDER_NOT_EXIST(500300, "Order does not exist"),


    ;

    private final Integer code;
    private final String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    RespBeanEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
