package com.loan.loanapp.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.loan.loanapp.bean.ListBean;
import com.loan.loanapp.service.LoanService_I;

@Controller
public class LoanAppController {

    @Autowired
    private LoanService_I loanServ;

    @RequestMapping("/")
    public String getHomePage(ModelMap model) {
    	model.put("user", "Admin");
//      model.put("user",getLoggedInUsername());// Should get it after successful auth through Spring Security(SS)
    	return "welcome";
    }
    public String getLoggedInUsername(){
    		Authentication auth = SecurityContextHolder.getContext().getAuthentication();//after successful authentication	
    		return auth.getName();  // will return the username after successful authentication
    	}

    @GetMapping("getlist")
    public String getlist(ModelMap m) {
    	List<ListBean> list = loanServ.getList();
		m.put("list",list);
		return "list-all-data";
    }

    @GetMapping("add-data")
    public String addloanData() {
        return "add-data";
    }

    @GetMapping("submit-add-data")
    public String submitData(@RequestParam String loanee, @RequestParam String desc, @RequestParam String mobile, @RequestParam LocalDate disbDate, @RequestParam LocalDate nextDueDate, ModelMap m) {
    	//Invoking the method in the service layer
		 // redirecting the url to the list page
		 loanServ.addData(loanee, desc, mobile, disbDate, nextDueDate);
		 return "redirect:getlist";
    }

    @GetMapping("deleteLoan")
    public String deleteData(@RequestParam Integer loanId) {
    	loanServ.deleteData(loanId);
		 return "redirect:getlist";
    }

    @GetMapping("editLoan")
    public String editData(@RequestParam Integer loanId, ModelMap m) {
    	ListBean lb = loanServ.findById(loanId);
		 m.put("lb", lb);
		 return "edit";
    }

    @GetMapping("updateLoan")
    public String update(ListBean lb) {
    	loanServ.editData(lb);
		 return "redirect:getlist";
    }
}
