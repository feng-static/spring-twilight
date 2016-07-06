package com.prist.controller;

import com.prist.model.Product;
import com.prist.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping("/index")
    public String hello(ModelMap model) {
        LOGGER.info("---------lalallalala");
        model.addAttribute("message", "Hello ---world!");
        return "hello";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<Product> json() {
        return productService.list();
    }
}