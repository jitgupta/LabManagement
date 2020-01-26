package com.lab.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab.management.bean.LabUser;

@Repository
public interface LabUserRepository extends JpaRepository<LabUser, Long>{
}
