package com.loan.loanapp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.bean.ListBean;
import com.loan.loanapp.dal.LoanAppRepository;

@Service
public class LoanService_C implements LoanService_I{

	@Autowired
	LoanAppRepository lar;
	
	// Authentication
	public boolean Auth(String userid, String pass) {
		boolean isValidUser = userid.equals("Admin");
		boolean isValidPwd = pass.equals("123");
		return isValidUser && isValidPwd;
	}
	// list
//	public static List<ListBean> loanlist=new ArrayList<>();
	
	// a static variable to hold the loanId
//	private static int loanId=0;
	
	// create a static block to initialize data
//	static {
//		loanlist.add(new ListBean(++loanId, "spring", "HL", "1234567899" , LocalDate.now(), LocalDate.now().plusMonths(1)));
//		loanlist.add(new ListBean(++loanId, "java", "ML", "6564567899" , LocalDate.now(), LocalDate.now().plusMonths(3)));
//		loanlist.add(new ListBean(++loanId, "spring-boot", "CL", "8786544529" , LocalDate.now(), LocalDate.now().plusMonths(2)));		
//	}
	
	// method to return the list of data
	public List<ListBean> getList(){
		return lar.findAll();
	}
	
	// following method is used to add static data in collection
	public void addData(String loanee,String desc,String mobile,LocalDate disbDate,LocalDate nextDueDate) {
//		loanlist.add(new ListBean(++loanId, loanee, desc, mobile, disbDate, nextDueDate));
		ListBean lb = new ListBean();
		lb.setLoanee(loanee);
		lb.setDescription(desc);
		lb.setMobileNo(mobile);
		lb.setDisbDate(disbDate);
		lb.setNextDueDate(nextDueDate);
		lar.save(lb);
	}

	// delete a record
	public void deleteData(Integer id) {
		//Lambda Expressions
//		Predicate<? super ListBean> predicate = lb->lb.getLoanId()==id;
//		loanlist.removeIf(predicate);
	
		//
//		for (ListBean loan : loanlist) {
//	        if (loan.getLoanId() == id) {
//	            loanlist.remove(loan);
//	            break;
//	        }
//	    }
		
		//for db
		// Delete the record
	    lar.deleteById(id);
	    }
	
	public ListBean findById(Integer id) {
		// Lambda Expression
//		Predicate<? super ListBean> predicate = l->l.getLoanId()==id;
//		ListBean lb = loanlist.stream().filter(predicate).findFirst().get();
//		return lb;

		return lar.findById(id).orElse(null);
	}
	
	// update a record
	public void editData(ListBean lb) {
		
		//
//		deleteData(lb.getLoanId());
//		loanlist.add(lb);
		
		//self try
// 		loanlist.set(id, new ListBean(id, loanee, desc, mobileNo, disbDate, nextDueDate));
		// Self try
//		for (int i = 0; i < loanlist.size(); i++) {
//	        if (loanlist.get(i).getLoanId() == id) {
//	            loanlist.set(i, new ListBean(id, loanee, desc, mobileNo, disbDate, nextDueDate));
//	            break;
//	        }
//	    }
		
		ListBean lbEdit = lar.findById(lb.getLoanId()).orElse(null);
//		lbEdit.setLoanId(lb.getLoanId());
		lbEdit.setLoanee(lb.getLoanee());
		lbEdit.setDescription(lb.getDescription());
		lbEdit.setMobileNo(lb.getMobileNo());
		lbEdit.setDisbDate(lb.getDisbDate());
		lbEdit.setNextDueDate(lb.getNextDueDate());
		lar.save(lbEdit);

		
	}
}
