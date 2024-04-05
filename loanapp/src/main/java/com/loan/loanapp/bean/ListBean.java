package com.loan.loanapp.bean;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loan")
public class ListBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer loanId;
	private String loanee;
	private String Description;
	private String MobileNo;
	private LocalDate disbDate;// LocalDate is used to perform Operations easily 
	private LocalDate nextDueDate;
	public ListBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ListBean(Integer loanId, String loanee, String description, String mobileNo, LocalDate disbDate,
			LocalDate nextDueDate) {
		super();
		this.loanId = loanId;
		this.loanee = loanee;
		this.Description = description;
		this.MobileNo = mobileNo;
		this.disbDate = disbDate;
		this.nextDueDate = nextDueDate;
	}

	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	public String getLoanee() {
		return loanee;
	}
	public void setLoanee(String loanee) {
		this.loanee = loanee;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.MobileNo = mobileNo;
	}
	
	public LocalDate getDisbDate() {
		return disbDate;
	}

	public void setDisbDate(LocalDate disbDate) {
		this.disbDate = disbDate;
	}

	public LocalDate getNextDueDate() {
		return nextDueDate;
	}

	public void setNextDueDate(LocalDate nextDueDate) {
		this.nextDueDate = nextDueDate;
	}

	@Override
	public String toString() {
		return "ListBean [loanId=" + loanId + ", loanee=" + loanee + ", Description=" + Description + ", MobileNo="
				+ MobileNo + ", disbDate=" + disbDate + ", nextDueDate=" + nextDueDate + "]";
	}
		
}
