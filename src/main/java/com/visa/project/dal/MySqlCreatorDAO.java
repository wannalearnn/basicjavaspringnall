package com.visa.project.dal;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.visa.project.domain.TestCreator;

@Component("MySqlCreatorDAO")
public class MySqlCreatorDAO implements CreatorDAO{

	@Autowired
	EntityManager em;
	
	public TestCreator findOne(String creatorEmailId){
		
		TestCreator tc = em.find(TestCreator.class, creatorEmailId);
		return tc;
		
	}
	
	public TestCreator addNew(TestCreator tc){
		em.persist(tc);
		return tc;
	}
	
	
}
