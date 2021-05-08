package com.ood.team.entity;

/**
 * ActivityCategory Bean
 * @author Ruofan Li
 * @date 2021/4/24
 */
public class Category {
    /**
     * categoryId
     */
    private Integer categoryId;

    /**
     * categoryName
     */
    private String categoryName;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

