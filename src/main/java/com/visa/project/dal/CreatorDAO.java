package com.visa.project.dal;

import org.springframework.stereotype.Component;

import com.visa.project.domain.TestCreator;

@Component("CreatorDAO")
public interface CreatorDAO {

	 TestCreator findOne(String creatorEmailId);
	 
	 TestCreator addNew(TestCreator tc);
	
	
}
