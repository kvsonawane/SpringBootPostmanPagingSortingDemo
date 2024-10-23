package com.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.demo.entity.Students;

public interface StudentRepository extends PagingAndSortingRepository<Students, Integer>{

}
