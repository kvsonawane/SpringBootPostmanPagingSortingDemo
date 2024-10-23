package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Students;

public interface Studentrepo extends JpaRepository<Students,Long>{

}
