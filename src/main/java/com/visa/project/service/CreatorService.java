package com.visa.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.visa.project.dal.CreatorDAO;
import com.visa.project.domain.TestCreator;

@Component("service")
@Transactional
public class CreatorService {
	
	@Autowired
	CreatorDAO dao;
	
	public TestCreator findOne(String emailId){
		return dao.findOne(emailId);
	}
	

	public TestCreator addNew(TestCreator tc){
		return dao.addNew(tc);
	}

	
	
	

}
