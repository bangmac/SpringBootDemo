package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/categories")
    public ModelAndView listAllcategories(){
        List<Category> categories = categoryService.findByAll();
        ModelAndView modelAndView = new ModelAndView("categories-list");
        modelAndView.addObject("aaa", categories);
        return modelAndView;
    }

}
