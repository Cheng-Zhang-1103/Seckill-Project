package com.example.seckilldemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * t_user
 *
 * @author boshen
 */
@TableName("t_user")
@ApiModel(value = "user", description = "user")
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /** User ID, Phone number **/
    @ApiModelProperty("User ID, Phone number")
    private Long id;

    private String nickname;

    /** MD5(MD5(passET+Fixedsalt)+salt) **/
    @ApiModelProperty("MD5(MD5(passET+Fixedsalt)+salt)")
    private String password;

    private String salt;

    /** Avatar **/
    @ApiModelProperty("Avatar")
    private String head;

    /** Registration Time **/
    @ApiModelProperty("Registration Time")
    private Date registerDate;

    /** Last login event **/
    @ApiModelProperty("Last login event")
    private Date lastLoginDate;

    /** Number of logins **/
    @ApiModelProperty("Number of logins")
    private Integer loginCount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    @Override
    public String toString() {
        return "TUser{" +
        "id=" + id +
        ", nickname=" + nickname +
        ", password=" + password +
        ", salt=" + salt +
        ", head=" + head +
        ", registerDate=" + registerDate +
        ", lastLoginDate=" + lastLoginDate +
        ", loginCount=" + loginCount +
        "}";
    }
}
