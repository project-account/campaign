package com.campaign.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by soner.ustel on 17/04/2018.
 */
@Controller
public class UserController {

    @RequestMapping(value="/giris-yap", method = RequestMethod.GET)
    public String getSignInForm(){
        return "membership/signin";
    }

    @RequestMapping(value="/giris-yap", method = RequestMethod.POST)
    public String signIn(){
        return "membership/signin";
    }

    @RequestMapping(value="/uye-ol", method = RequestMethod.GET)
    public String getSignUpForm(){
        return "membership/signup";
    }

    @RequestMapping(value="/uye-ol", method = RequestMethod.POST)
    public String signUp(){
        return "membership/signup";
    }

}
