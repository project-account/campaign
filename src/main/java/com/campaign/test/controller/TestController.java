package com.campaign.test.controller;

import com.campaign.test.dao.TestDao;
import com.campaign.test.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestDao testDao;

    @GetMapping("/getAll")
    public List<Test> getAllTest(){

        List<Test> testList = testDao.findAll();
        return testList;
    }
}
