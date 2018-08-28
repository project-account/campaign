package com.campaign.controller;

import com.campaign.converter.SellerConverter;
import com.campaign.dao.SellerDao;
import com.campaign.dto.SellerDTO;
import com.campaign.model.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping("rest/seller")
public class SellerController {

    @Autowired
    private SellerDao sellerDao;

    @Autowired
    private SellerConverter sellerConverter;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void createSeller(@RequestBody SellerDTO sellerDTO){
        if(sellerDTO == null){
            return;
        }
        Seller seller = Seller.builder().name(sellerDTO.getName())
                .password(sellerDTO.getPassword())
                .emailAddress(sellerDTO.getEmailAddress())
                .createdDate(new Date())
                .id(sellerDTO.getId())
                .build();

        sellerDao.save(seller);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public void updateSeller(@RequestBody SellerDTO sellerDTO){
        if(sellerDTO == null || sellerDTO.getId() == null){
            return;
        }
        Optional<Seller> optional = sellerDao.findById(sellerDTO.getId());
        if(!optional.isPresent()){
            return;
        }
        Seller seller = optional.get();
        sellerDao.save(sellerConverter.convert(sellerDTO, seller));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteSeller(@PathVariable Long id){
        if(id == null){
            return;
        }
        Optional<Seller> optional = sellerDao.findById(id);
        if(!optional.isPresent()){
            return;
        }
        Seller seller = optional.get();
        sellerDao.delete(seller);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public SellerDTO retrieveSeller(@PathVariable Long id){
        if(id == null){
            return null;
        }
        Optional<Seller> optional = sellerDao.findById(id);
        return optional.isPresent() ? sellerConverter.convert(optional.get()) : null;
    }

}
