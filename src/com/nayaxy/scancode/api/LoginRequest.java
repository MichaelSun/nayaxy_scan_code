package com.nayaxy.scancode.api;

import com.nayaxy.scancode.api.beanrequest.NYRequestBase;
import com.plugin.internet.core.annotations.RequiredParam;
import com.plugin.internet.core.annotations.RestMethodUrl;

/**
 * Created with IntelliJ IDEA.
 * User: michael
 * Date: 13-10-8
 * Time: PM2:35
 * To change this template use File | Settings | File Templates.
 */

@RestMethodUrl("login")//or @RestMethodUrl("http://ap.cssets.com/api/login")
public class LoginRequest extends NYRequestBase {

    @RequiredParam("username")
    private String userName;

    @RequiredParam("password")
    private String password;

    public LoginRequest(String name, String passwd) {
        userName = name;
        password = passwd;
    }
}
