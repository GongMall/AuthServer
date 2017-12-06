package com.gongmall.authserver.controller;

import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("oauth/")
public class AuthorizeController {

    @RequestMapping("authorize")
    public void authorize(HttpServletRequest request, HttpServletResponse response) throws OAuthSystemException,ServletException,IOException{

    }

    @RequestMapping("token")
    public void token(HttpServletRequest request,HttpServletResponse response) throws OAuthSystemException{

    }
}
