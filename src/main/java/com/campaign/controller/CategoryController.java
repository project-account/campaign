package com.campaign.controller;

import com.campaign.converter.CategoryConverter;
import com.campaign.dao.CategoryDao;
import com.campaign.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("rest/category")
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private CategoryConverter categoryConverter;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<CategoryDTO> retrieveCategories(){
        return categoryConverter.convert(categoryDao.findAll());
    }

}
