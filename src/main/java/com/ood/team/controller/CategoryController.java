package com.ood.team.controller;

import com.ood.team.service.CategoryService;
import com.ood.team.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Category Controller
 *
 * @author Ruofan Li
 * @date 2021/4/26
 */
//@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    //新增分类
    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> insertCategory(Category category){
        Map<String, Object> result = new HashMap<>();
        Integer returnNum = categoryService.insertCategory(category);
        if(returnNum == 1){
            result.put("msg","insert succeed");
        }else {
            result.put("msg","insert fail");
        }
        return result;
    }

    //更改分类信息
    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> updateCategory(Category category){
        Map<String, Object> result = new HashMap<>();
        Integer returnNum = categoryService.updateCategory(category);
        if(returnNum == 1){
            result.put("msg","update succeed");
        }else {
            result.put("msg","update fail");
        }
        return result;
    }

    //删除分类信息
    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> deleteCategory(Integer categoryId){
        Map<String, Object> result = new HashMap<>();
        Integer returnNum = categoryService.deleteCategory(categoryId);
        if(returnNum == 1){
            result.put("msg","delete succeed");
        }else {
            result.put("msg","delete fail");
        }
        return result;
    }

    //批量删除分类信息
    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> batchDeleteCategory(List<Integer> categoryIdList){
        Map<String, Object> result = new HashMap<>();
        Integer returnNum = 0;
        for(int i=0;i<categoryIdList.size();i++){
            returnNum += categoryService.deleteCategory(categoryIdList.get(i));
        }
        if(returnNum == categoryIdList.size()){
            result.put("msg","batch delete succeed");
        }else {
            result.put("msg","batch delete fail");
        }
        return result;
    }

    //查询分类信息列表
    @RequestMapping("")
    @ResponseBody
    public Map<String, Object> categoryList(){
        Map<String, Object> result = new HashMap<>();
        List<Category> categoryList = categoryService.categoryList();
        if(categoryList.isEmpty()){
            result.put("msg","query fail");
        }else {
            result.put("msg","query succeed");
            result.put("list",categoryList);
        }
        return result;
    }
}
