package com.campaign.test.controller;

import com.campaign.test.command.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

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
    public String getSignUpForm(UserDTO userDTO){
        return "membership/signup";
    }

    @RequestMapping(value="/uye-ol", method = RequestMethod.POST)
    public String signUp(@Valid UserDTO userDTO, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            return "membership/signup";
        }

        String name = userDTO.getName();
        return "membership/signup";
    }

}
