package com.loan.loanapp.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.loanapp.bean.ListBean;

@Repository
public interface LoanAppRepository extends JpaRepository<ListBean, Integer> {


}
