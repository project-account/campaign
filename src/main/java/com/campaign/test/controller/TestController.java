package com.campaign.test.controller;

import com.campaign.dao.CampaignDao;
import com.campaign.dao.CategoryDao;
import com.campaign.dao.SellerDao;
import com.campaign.model.Campaign;
import com.campaign.model.Category;
import com.campaign.model.Seller;
import com.campaign.test.dao.TestDao;
import com.campaign.test.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestDao testDao;

    @Autowired
    private CampaignDao campaignDao;

    @Autowired
    private SellerDao sellerDao;

    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/getAll")
    @ResponseBody
    public List<Test> getAllTest(){

        List<Test> testList = testDao.findAll();
        return testList;
    }

    @GetMapping("/get")
    @ResponseBody
    public List<Campaign> getAll(){
        List<Campaign> campaignList = campaignDao.findAll();

        if(campaignList != null ){
            System.out.println(true);
        }

        List<Seller> sellerList = sellerDao.findAll();
        if(sellerList != null){
            System.out.println(true);
        }

        List<Category> categoryList = categoryDao.findAll();
        if(categoryList != null){
            System.out.println(true);
        }

        return campaignList;
    }

    @RequestMapping(value="/mvc-test",method = RequestMethod.GET)
    public String getMvc(Model model){
        model.addAttribute("name", "soner");
        return "test";
    }

    @RequestMapping(value="/test-mvc",method = RequestMethod.GET)
    public String getTestMvc(){
        return "home";
    }


}
