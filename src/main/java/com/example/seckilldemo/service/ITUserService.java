package com.example.seckilldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckilldemo.entity.TUser;
import com.example.seckilldemo.vo.LoginVo;
import com.example.seckilldemo.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * User Table Service Class
 * </p>
 *
 * @author boshen
 * @since 2022-03-02
 */

public interface ITUserService extends IService<TUser> {

    /**
     * Login method
     *
     * @param loginVo
     * @param request
     * @param response
     * @return com.example.seckilldemo.vo.RespBean
     * @author boshen
     * @operation add
     * @date 1:49 下午 2022/3/3
     **/
    RespBean doLongin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);

    /**
     * Get users based on cookies
     *
     * @param userTicket
     * @return com.example.seckilldemo.entity.TUser
     * @author boshen
     * @operation add
     * @date 1:50 下午 2022/3/3
     **/
    TUser getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);


    /**
     * Update password
     *
     * @param userTicket
     * @param id
     * @param password
     * @return com.example.seckilldemo.vo.RespBean
     * @author boshen
     * @operation add
     * @date 9:05 下午 2022/3/4
     **/
    RespBean updatePassword(String userTicket, String password, HttpServletRequest request, HttpServletResponse response);
}
