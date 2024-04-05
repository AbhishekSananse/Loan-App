package com.loan.loanapp.service;

import java.time.LocalDate;
import java.util.List;

import com.loan.loanapp.bean.ListBean;

public interface LoanService_I {

	public boolean Auth(String userid,String pass);
	public List<ListBean> getList();
	public void addData(String loanee,String desc,String mobile,LocalDate disbDate,LocalDate nextDueDate) ;
	public void deleteData(Integer loanId);
	public ListBean findById(Integer id);
	public void editData(ListBean lb);
}
