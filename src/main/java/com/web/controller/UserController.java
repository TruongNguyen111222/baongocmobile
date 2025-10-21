package com.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {


    @RequestMapping(value = {"/baiviet"}, method = RequestMethod.GET)
    public String baiviet() {
        return "user/baiviet";
    }

    @RequestMapping(value = {"/chitietbaiviet"}, method = RequestMethod.GET)
    public String chitietbaiviet() {
        return "user/chitietbaiviet";
    }

    @RequestMapping(value = {"/detail"}, method = RequestMethod.GET)
    public String detail() {
        return "user/detail";
    }

    @RequestMapping(value = {"/index","/"}, method = RequestMethod.GET)
    public String index() {
        return "user/index";
    }

    @RequestMapping(value = {"/product"}, method = RequestMethod.GET)
    public String product() {
        return "user/product";
    }
}
