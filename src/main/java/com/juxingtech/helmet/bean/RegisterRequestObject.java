package com.juxingtech.helmet.bean;

import lombok.Data;

@Data
public class RegisterRequestObject {

    private RegisterObject RegisterObject;
    @Data
    public static class RegisterObject {
        private String DeviceID;
    }
}
