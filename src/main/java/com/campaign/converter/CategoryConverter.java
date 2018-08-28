package com.campaign.converter;

import com.campaign.dto.CategoryDTO;
import com.campaign.model.Category;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryConverter {

    public List<CategoryDTO> convert(List<Category> categoryList){
        if(CollectionUtils.isEmpty(categoryList)){
            return null;
        }
        return categoryList.stream().map(e -> convert(e)).collect(Collectors.toList());
    }

    public CategoryDTO convert(Category category){
        if(category == null){
            return null;
        }
        return CategoryDTO.builder().id(category.getId())
                .name(category.getName())
                .version(category.getVersion())
                .build();
    }
}
