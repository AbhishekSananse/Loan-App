//package com.loan.loanapp.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.loan.loanapp.service.LoanService_I;
//@Controller
//public class LoginController {
//
//    @Autowired
//    private LoanService_I loanServ;
//
//    @GetMapping("login")
//    public String getLoginPage() {
//        return "login";
//    }
//
//    @GetMapping("loginsubmit")
//    public String auth(@RequestParam("userid") String userid, @RequestParam("pass") String pass, ModelMap m) {
//        if (loanServ.Auth(userid, pass)) {
//            m.addAttribute("user", userid);
//            return "welcome";
//        } else {
//            m.addAttribute("msg", "Wrong Credentials, Try Again");
//            return "login";
//        }
//    }
//}
