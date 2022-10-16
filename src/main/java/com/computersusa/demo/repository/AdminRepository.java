package com.computersusa.demo.repository;

import com.computersusa.demo.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AdminRepository extends JpaRepository<Admin,Long> {
}