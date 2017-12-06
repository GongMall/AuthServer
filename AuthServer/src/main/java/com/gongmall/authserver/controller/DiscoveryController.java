package com.gongmall.authserver.controller;

import com.gongmall.authserver.domain.Discovery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(".well-known/")
public class DiscoveryController {

    @RequestMapping(value = "openid-configuration")
    public ResponseEntity<?> openIdConfiguration(){

        Discovery dis=new Discovery();
        dis.setIssuer("http://auth.gongmall.com");
        //json
        return ResponseEntity.ok(dis);
    }

}
