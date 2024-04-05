//package com.loan.loanapp.controllers;

//import java.time.LocalDate;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import com.loan.loanapp.bean.ListBean;
//import com.loan.loanapp.service.LoanService_I;

//@SessionAttributes("user")
//@Controller
//public class LoanController {

//	@Autowired
//	private LoanService_I loanServ;
//	
////  Equivalent to @Autowired
////	public LoanController(LoanService_I auth) {
////		super();
////		this.auth = auth;
////	}
//
//	@GetMapping("/")
//	public String getHomePage() {
//		return "index";
//	}
//	
//	//following controller method is invoked when user confirms login hyperlink
//	@GetMapping("login")
//	public String getLoginPage() {
//		return "login";
//	}
//	
//	//when the user enters id and pwd ,the following is invoked
//	// we write BL in service layer for reusing
//	@GetMapping("loginsubmit")
//	public String auth(@RequestParam("userid")String userid,@RequestParam("pass")String pass,ModelMap m) {
//		if(loanServ.Auth(userid, pass)) {
//			m.addAttribute("user",userid);
//			return "welcome";
//		}
//		else {
//			m.addAttribute("msg", "Wrong Credentials, Try Again");
//			return "login";
//		}
//	}
//	
//	// controller method to return the list of static data
//	@GetMapping("getlist")
//	public String getlist(ModelMap m) {
//		List<ListBean> list = loanServ.getList();
//		m.put("list",list);
//		return "list-all-data";
//	}
//	
//	// Controller method to return add data form
//	@GetMapping("add-data")
//	 public String addloanData() {
//		 return "add-data";
//	 }
//	
//	// Controller method to add data and open list
//	@GetMapping("submit-add-data")
//	 public String submitData(@RequestParam String loanee,@RequestParam String desc,@RequestParam String mobile,@RequestParam LocalDate disbDate,@RequestParam LocalDate nextDueDate,ModelMap m) {
//		 //Invoking the method in the service layer
//		 // redirecting the url to the list page
//		 loanServ.addData(loanee, desc, mobile, disbDate, nextDueDate);
//		 return "redirect:getlist";
//	 }
//	
//	// Controller method to delete data and open list
//	@GetMapping("deleteLoan")
//	 public String deleteData(@RequestParam Integer loanId) {
//		 loanServ.deleteData(loanId);
//		 return "redirect:getlist";
//	 }
//	
//	// Controller method to update the data and open the update form 
//	@GetMapping("editLoan")
//	 public String editData(@RequestParam Integer loanId,ModelMap m) {
//		 ListBean lb = loanServ.findById(loanId);
//		 m.put("lb", lb);
//		 return "edit";
//	 }
//	 
//	// Controller method to update data and open list
//	@GetMapping("updateLoan")
//	 public String update(ListBean lb) {
//		 loanServ.editData(lb);
//		 return "redirect:getlist";
//	 }
	 
//}
