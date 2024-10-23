package com.demo.service;

import java.util.List; 
import org.springframework.stereotype.Service; 
import com.demo.entity.Students; 

@Service 
public interface IStudentService { 
	
List<Students>findPaginated(int pageNo,int pageSize); 

} 
