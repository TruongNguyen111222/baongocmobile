package com.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminController {



    @RequestMapping(value = {"/addvoucher"}, method = RequestMethod.GET)
    public String addvoucher() {
        return "admin/addvoucher";
    }

    @RequestMapping(value = {"/banner"}, method = RequestMethod.GET)
    public String banner() {
        return "admin/banner";
    }

    @RequestMapping(value = {"/chat"}, method = RequestMethod.GET)
    public String chat() {
        return "admin/chat";
    }

    @RequestMapping(value = {"/doanhthu"}, method = RequestMethod.GET)
    public String doanhthu() {
        return "admin/doanhthu";
    }

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String index() {
        return "admin/index";
    }

    @RequestMapping(value = {"/invoice"}, method = RequestMethod.GET)
    public String invoice() {
        return "admin/invoice";
    }

    @RequestMapping(value = {"/voucher"}, method = RequestMethod.GET)
    public String voucher() {
        return "admin/voucher";
    }
    @RequestMapping(value = {"/addimportproduct"}, method = RequestMethod.GET)
    public String addimportproduct() {
        return "admin/addimportproduct";
    }

    @RequestMapping(value = {"/importproduct"}, method = RequestMethod.GET)
    public String importproduct() {
        return "admin/importproduct";
    }
}
