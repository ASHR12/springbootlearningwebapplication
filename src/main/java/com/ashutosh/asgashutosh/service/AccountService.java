package com.ashutosh.asgashutosh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashutosh.asgashutosh.model.Accounts;
import com.ashutosh.asgashutosh.repository.AccountsRepository;


@Service
public class AccountService {
	@Autowired
	AccountsRepository accountRepository;

	public void saveOrUpdate(Accounts accounts) 
	{
		accountRepository.save(accounts);
	}
}
