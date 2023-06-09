package com.example.seckilldemo.vo;


import com.example.seckilldemo.validator.IsMobile;

import javax.validation.constraints.NotNull;

/**
 * LoginVo
 *
 * @author: LC
 * @ClassName: LoginVo
 */
public class LoginVo {

    @NotNull
//    @IsMobile
    private String mobile;

    @NotNull
//    @Length(min = 32)
    private String password;

    @Override
    public String toString() {
        return "LoginVo{" +
                "mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
