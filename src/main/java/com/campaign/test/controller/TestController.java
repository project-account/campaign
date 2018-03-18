package com.campaign.test.controller;

import com.campaign.test.dao.TestDao;
import com.campaign.test.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestDao testDao;

    @GetMapping("/getAll")
    @ResponseBody
    public List<Test> getAllTest(){

        List<Test> testList = testDao.findAll();
        return testList;
    }

    @RequestMapping(value="/mvc-test",method = RequestMethod.GET)
    public String getMvc(){
        return "test";
    }
}
