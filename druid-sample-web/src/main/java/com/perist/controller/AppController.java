package com.perist.controller;

import com.perist.model.Product;
import com.perist.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class AppController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String hello(ModelMap model) {
        LOGGER.info("---------lalallalala");
        LOGGER.info("{}", productService.list());
        model.addAttribute("message", "Hello ---world!");
        return "hello";
    }

    @RequestMapping(value = "about", method = RequestMethod.GET)
    public String about() {
        return "about";
    }

    @RequestMapping(value = "json", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> json() {
        return productService.list();
    }
}