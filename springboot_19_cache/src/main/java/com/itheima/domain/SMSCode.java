package com.itheima.domain;

import lombok.Data;

@Data
public class SMSCode {
    private String tele;
    private String code;

    @Override
    public String toString() {
        return "SMSCode{" +
                "tele='" + tele + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
