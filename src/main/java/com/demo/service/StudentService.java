package com.demo.service;

import java.util.List; 
import com.demo.entity.Students; 
import com.demo.repository.StudentRepository; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.data.domain.Page; 
import org.springframework.data.domain.PageRequest; 
import org.springframework.data.domain.Pageable; 
import org.springframework.stereotype.Service; 

@Service 
public class StudentService implements IStudentService { 
	
@Autowired 
private StudentRepository repository; 

public List<Students>findPaginated(int pageNo, int pageSize) {
	
Pageable paging=PageRequest.of(pageNo, pageSize) ; 
Page<Students>pagedResult = repository.findAll(paging); 

return pagedResult.toList(); 
} 
} 
